package model.npc;


public class Dog extends GameObject {

    private int legs;

    public Dog(String name) {
        super(name);
        this.legs = 4;
        this.setHealts(75);
    }
}
