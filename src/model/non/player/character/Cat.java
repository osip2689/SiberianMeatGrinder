package model.non.player.character;


import java.awt.*;

public class Cat extends GameObject {

    private int legs;

    public Cat(String name) {
        super(name);
        this.legs = 4;
        this.setHealts(65);
    }

    @Override
    public void draw(Graphics graphics) {

    }
}
