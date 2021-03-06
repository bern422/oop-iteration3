package game.model.game_world.terrain;

import game.controller.MoveToAction;
import game.model.entity.Avatar;
import game.model.entity.Entity;
import game.util.Location;
import game.view.GameWorldView;

import javax.swing.*;


public class Dirt extends Terrain {

    public Dirt(Location l) {
        super(l);
    }

    @Override
    public AbstractAction beInteractedWithBy(Entity i) {
        return new MoveToAction(i , getLocation());

    }

    @Override
    public AbstractAction beInteractedWithBy(Avatar a) {
        return null;
    }

    @Override
    public String toString(){
        return "Dirt";
    }
    
    @Override
    public void prepareForDraw(Location l, GameWorldView gmw) {
    	gmw.drawGameObject(this, l);
    }
}
