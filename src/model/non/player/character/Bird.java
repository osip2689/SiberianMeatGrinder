package model.non.player.character;

import java.awt.*;

public class Bird extends GameObject {

    private int legs;

    public Bird(String name) {
        super(name);
        this.legs = 2;
        this.setHealts(25);
    }

    @Override
    public void draw(Graphics graphics) {

    }
}
