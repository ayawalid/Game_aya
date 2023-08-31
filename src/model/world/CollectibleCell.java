package model.world;

import javafx.scene.Scene;
import model.collectibles.Collectible;

public class CollectibleCell extends Cell {

    private Collectible collectible;

    public CollectibleCell(Collectible collectible) {
        this.collectible = collectible;
    }

    public Collectible getCollectible() {
        return collectible;
    }

    public Scene getCoordinates() {
        // TODO Auto-generated method stub
        return null;
    }


}
