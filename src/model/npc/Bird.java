package model.npc;

public class Bird extends GameObject {

    private int legs;

    public Bird(String name) {
        super(name);
        this.legs = 2;
        this.setHealts(25);
    }
}
