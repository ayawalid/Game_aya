// Source code is decompiled from a .class file using FernFlower decompiler.
package engine;

import exceptions.InvalidTargetException;
import exceptions.NotEnoughActionsException;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import model.characters.collectibles.Supply;
import model.characters.collectibles.Vaccine;
import model.world.Cell;
import model.world.CharacterCell;
import model.world.CollectibleCell;
import model.world.TrapCell;

public class Game {
    public static ArrayList<Hero> availableHeroes = new ArrayList();
    public static ArrayList<Agent> agents = new ArrayList();
    public static ArrayList<Hero> heroes = new ArrayList();
    public static ArrayList<Zombie> zombies = new ArrayList();
    public static Cell[][] map = new Cell[15][15];

    public Game() {
    }

    public static void loadHeroes(String filePath) throws IOException {
        availableHeroes = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        for(String line = br.readLine(); line != null; line = br.readLine()) {
            String[] sp = line.split(",");
            Object h;
            if (sp[1].equals("EXP")) {
                h = new Explorer(sp[0], Integer.parseInt(sp[2]), Integer.parseInt(sp[4]), Integer.parseInt(sp[3]));
            } else if (sp[1].equals("FIGH")) {
                h = new Fighter(sp[0], Integer.parseInt(sp[2]), Integer.parseInt(sp[4]), Integer.parseInt(sp[3]));
            } else {
                h = new Medic(sp[0], Integer.parseInt(sp[2]), Integer.parseInt(sp[4]), Integer.parseInt(sp[3]));
            }

            availableHeroes.add(h);
        }

        br.close();
    }

    public static void endTurn() throws NotEnoughActionsException, InvalidTargetException {
        Iterator var1 = zombies.iterator();

        while(var1.hasNext()) {
            Zombie zombie = (Zombie)var1.next();
            zombie.attack();
            zombie.setTarget((Character)null);
        }

        spawnNewZombie();

        for(int i = 0; i < map.length; ++i) {
            for(int j = 0; j < map[i].length; ++j) {
                map[i][j].setVisible(false);
            }
        }

        var1 = heroes.iterator();

        while(var1.hasNext()) {
            Hero hero = (Hero)var1.next();
            hero.setActionsAvailable(hero.getMaxActions());
            hero.setTarget((Character)null);
            hero.setSpecialAction(false);
            adjustVisibility(hero);
        }

    }

    public static void adjustVisibility(Hero h) {
        Point p = h.getLocation();

        for(int i = -1; i <= 1; ++i) {
            int cx = p.x + i;
            if (cx >= 0 && cx <= 14) {
                for(int j = -1; j <= 1; ++j) {
                    int cy = p.y + j;
                    if (cy >= 0 && cy <= 14 && cy >= 0 && cy <= map.length - 1) {
                        map[cx][cy].setVisible(true);
                    }
                }
            }
        }

    }

    public static void spawnNewZombie() {
        Zombie z = new Zombie();
        zombies.add(z);

        int x;
        int y;
        do {
            do {
                x = (int)(Math.random() * (double)map.length);
                y = (int)(Math.random() * (double)map[x].length);
            } while(map[x][y] instanceof CharacterCell && ((CharacterCell)map[x][y]).getCharacter() != null);
        } while(map[x][y] instanceof CollectibleCell || map[x][y] instanceof TrapCell);

        z.setLocation(new Point(x, y));
        map[x][y] = new CharacterCell(z);
    }

    public static boolean checkWin() {
        int remainingVaccines = 0;

        for(int i = 0; i < map.length; ++i) {
            for(int j = 0; j < map[i].length; ++j) {
                if (map[i][j] instanceof CollectibleCell && ((CollectibleCell)map[i][j]).getCollectible() instanceof Vaccine) {
                    ++remainingVaccines;
                }
            }
        }

        Hero hero;
        for(Iterator var4 = heroes.iterator(); var4.hasNext(); remainingVaccines += hero.getVaccineInventory().size()) {
            hero = (Hero)var4.next();
        }

        if (heroes.size() >= 5 && remainingVaccines == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkGameOver() {
        int i;
        int j;
        if (heroes.size() > 0) {
            for(i = 0; i < map.length; ++i) {
                for(j = 0; j < map[i].length; ++j) {
                    if (map[i][j] instanceof CollectibleCell && ((CollectibleCell)map[i][j]).getCollectible() instanceof Vaccine) {
                        return false;
                    }
                }
            }

            Iterator var3 = heroes.iterator();

            while(var3.hasNext()) {
                Hero hero = (Hero)var3.next();
                if (hero.getVaccineInventory().size() > 0) {
                    return false;
                }
            }
        }

        for(i = 0; i < map.length; ++i) {
            for(j = 0; j < map[i].length; ++j) {
                if (map[i][j] instanceof CharacterCell && ((CharacterCell)map[i][j]).getCharacter() instanceof Militant) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void startGame(Hero h) {
        heroes.add(h);
        availableHeroes.remove(h);

        int i;
        for(i = 0; i < map.length; ++i) {
            for(int j = 0; j < map[i].length; ++j) {
                map[i][j] = new CharacterCell((Character)null);
            }
        }

        ((CharacterCell)map[0][0]).setCharacter(h);
        h.setLocation(new Point(0, 0));
        spawnCollectibles();

        for(i = 0; i < 10; ++i) {
            spawnNewZombie();
        }

        spawnTraps();
        adjustVisibility(h);
        spawnMilitant();
    }

    public static void spawnCollectibles() {
        int i;
        int x;
        int y;
        for(i = 0; i < 5; ++i) {
            Vaccine v = new Vaccine();

            do {
                do {
                    x = (int)(Math.random() * (double)map.length);
                    y = (int)(Math.random() * (double)map[x].length);
                } while(map[x][y] instanceof CharacterCell && ((CharacterCell)map[x][y]).getCharacter() != null);
            } while(map[x][y] instanceof CollectibleCell || map[x][y] instanceof TrapCell);

            map[x][y] = new CollectibleCell(v);
        }

        for(i = 0; i < 5; ++i) {
            Supply v = new Supply();

            do {
                do {
                    x = (int)(Math.random() * (double)map.length);
                    y = (int)(Math.random() * (double)map[x].length);
                } while(map[x][y] instanceof CharacterCell && ((CharacterCell)map[x][y]).getCharacter() != null);
            } while(map[x][y] instanceof CollectibleCell || map[x][y] instanceof TrapCell);

            map[x][y] = new CollectibleCell(v);
        }

    }

    public static void spawnTraps() {
        for(int i = 0; i < 5; ++i) {
            int x;
            int y;
            do {
                do {
                    x = (int)(Math.random() * (double)map.length);
                    y = (int)(Math.random() * (double)map[x].length);
                } while(map[x][y] instanceof CharacterCell && ((CharacterCell)map[x][y]).getCharacter() != null);
            } while(map[x][y] instanceof CollectibleCell || map[x][y] instanceof TrapCell);

            map[x][y] = new TrapCell();
        }

    }

    public static void spawnMilitant() {
        for(int i = 0; i < 2; ++i) {
            int x;
            int y;
            do {
                do {
                    x = (int)(Math.random() * (double)map.length);
                    y = (int)(Math.random() * (double)map[x].length);
                } while(map[x][y] instanceof CharacterCell && ((CharacterCell)map[x][y]).getCharacter() != null);
            } while(map[x][y] instanceof CollectibleCell || map[x][y] instanceof TrapCell);

            map[x][y] = new CharacterCell(new Militant());
        }

    }
}
