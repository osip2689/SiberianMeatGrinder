package model.npc;


import model.gamesItems.Weapon;

public class GameObject {
    private String name;
    private int healts;
    private Weapon weapon;

    public GameObject(String name) {
        this.name = name;
    }

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
        if (Math.random() > 0.5) {
            damage = damage*2;
        }
        gameObject.setHealts(gameObject.getHealts() - damage);

        System.out.println(gameObject.getName() + " ПОТЕРЯЛ " + damage + " ОЧКОВ ЗДОРОВЬЯ. У НЕГО ОСТАЛОСЬ " + gameObject.getHealts());
        return gameObject;
    }
}