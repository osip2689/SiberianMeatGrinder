package controller;

import model.non.player.character.Cat;
import model.non.player.character.Dog;
import model.non.player.character.GameObject;
import model.non.player.character.Human;
import model.games.items.Weapon;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GameObject player1 = new Human("Вася");
        // создаем объект оружие
        Weapon weaponForPlayer1 = new Weapon("Кулак");
        //устанавливаем
        weaponForPlayer1.setBonusDamage(0);
        weaponForPlayer1.setDamage(4);
        player1.setWeapon(weaponForPlayer1);

        GameObject player2 = new Dog("Шарик");
        Weapon weaponForPlayer2 = new Weapon("Клыки");
        weaponForPlayer2.setBonusDamage(0.4);
        weaponForPlayer2.setDamage(5);
        player2.setWeapon(weaponForPlayer2);

        GameObject player3 = new Cat("Кеша");
        Weapon weaponForPlayer3 = new Weapon("Когти");
        weaponForPlayer3.setBonusDamage(0.3);
        weaponForPlayer3.setDamage(7);
        player3.setWeapon(weaponForPlayer3);

        fighting(player1, player3);
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

