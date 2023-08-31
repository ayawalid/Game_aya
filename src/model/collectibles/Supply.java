package model.collectibles;

import model.characters.Hero;
import model.world.CharacterCell;
import engine.Game;
import model.characters.Character;

public class Supply implements Collectible {

    @Override
    public void pickUp(Hero h) {
        boolean add = h.getSupplyInventory().add(this);
    }

    @Override
    public void use(Hero h) {
        h.getSupplyInventory().remove(this);
    }

}
