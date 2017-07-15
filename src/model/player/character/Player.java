package model.player.character;

import model.game.process.data.Coordinates;
import model.non.player.character.GameObject;

import javax.swing.*;
import java.awt.*;

/**
 * Игрок
 */
public class Player extends GameObject{

    private Coordinates coordinates;

    public Player(String name) {
        super(name);
        coordinates = new Coordinates(225, 225);
    }

    @Override
    public void draw(Graphics graphics) {
        ImageIcon icon2 = new ImageIcon(Player.class.getResource("playerM.gif"));
        //if (this.isSelect()) {icon2 = new ImageIcon(Player.class.getResource("playerM.gif"));}

        int leftUpperCornerX = coordinates.getX();
        int leftUpperCornerY = coordinates.getY();
        graphics.drawImage(icon2.getImage(), leftUpperCornerX, leftUpperCornerY, null);
    }
}
