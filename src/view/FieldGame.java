package view;


import model.game.process.GameProcess;
import model.non.player.character.GameObject;
import model.player.character.Player;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/*
        Класс панель на котором будет все отображаться
*/

public class FieldGame extends JPanel{
    private final ViewGame viewGame;        // поле отображение

    private GameProcess gameProcess = GameProcess.getInstance();

    public FieldGame(ViewGame viewGame) {
        this.viewGame = viewGame;
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.decode("#8FBC8F"));
        g.fillRect(10, 10, 475, 450);

        List<GameObject> tmpRepo = gameProcess.getGameObjects().getGameObjects();
        for (int i = 0; i < tmpRepo.size(); i++) {
            tmpRepo.get(i).draw(g);
        }
    }
}
