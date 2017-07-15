package model.non.player.character;


import model.game.process.data.Coordinates;
import model.games.items.Weapon;

import java.awt.*;

public abstract class GameObject {
    private String name;
    private int healts;
    private Weapon weapon;

    private Coordinates coordinates;

    public GameObject(String name) {
        this.name = name;
    }

    public abstract void draw(Graphics graphics);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealts() {
        return healts;
    }

    public void setHealts(int healts) {
        this.healts = healts;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public GameObject strike(GameObject gameObject) {
        int damage = this.getWeapon().getDamage();

        double critical = Math.random();
        double bonusCrit = +this.getWeapon().getBonusDamage();
        if ((critical >= (0.5 - bonusCrit)) && (critical <= 0.6)) {
            damage = damage * 2;
        }
        gameObject.setHealts(gameObject.getHealts() - damage);

        System.out.println(gameObject.getName() + " ПОТЕРЯЛ " + damage + " ОЧКОВ ЗДОРОВЬЯ. У НЕГО ОСТАЛОСЬ " + gameObject.getHealts());
        return gameObject;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
