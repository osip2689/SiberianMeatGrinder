package model.npc;


public class Human extends GameObject {

    private int legs;

    public Human(String name) {
        super(name);
        this.legs = 2;
        this.setHealts(100);
    }
}
