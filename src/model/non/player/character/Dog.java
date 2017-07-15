package model.non.player.character;


import java.awt.*;

public class Dog extends GameObject {

    private int legs;

    public Dog(String name) {
        super(name);
        this.legs = 4;
        this.setHealts(75);
    }

    @Override
    public void draw(Graphics graphics) {

    }
}
