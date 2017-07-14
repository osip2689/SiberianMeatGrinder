package controller;

import model.npc.Dog;
import model.npc.GameObject;
import model.npc.Human;
import model.gamesItems.Weapon;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GameObject player1 = new Human("Вася");
        Weapon weaponForPlayer1 = new Weapon("Кулак");
        weaponForPlayer1.setDamage(4);
        player1.setWeapon(weaponForPlayer1);

        GameObject player2 = new Dog("Шарик");
        Weapon weaponForPlayer2 = new Weapon("Клыки");
        weaponForPlayer2.setDamage(5);
        player2.setWeapon(weaponForPlayer2);

        fighting(player1, player2);
    }

    public static GameObject fighting(GameObject g1, GameObject g2) throws InterruptedException {

        for (int i = 1; !((g1.getHealts() <= 0) || (g2.getHealts() <= 0)); i++) {
            if (i % 2 == 0) {
                g2.strike(g1);
            } else
            g1.strike(g2);

            Thread.sleep(1000);
        }
        if (g1.getHealts() <= 0) {
            System.out.println("ПОБЕДИЛ " + g2.getName());
            return g2;

        } else {
            System.out.println("ПОБЕДИЛ " + g1.getName());
            return g1;
        }
    }
}

