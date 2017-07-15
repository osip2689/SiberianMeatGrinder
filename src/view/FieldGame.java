package view;


import model.player.character.Player;

import javax.swing.*;
import java.awt.*;

/*
        Класс панель на котором будет все отображаться
*/

public class FieldGame extends JPanel{
    private final ViewGame viewGame;        // поле отображение

    public FieldGame(ViewGame viewGame) {
        this.viewGame = viewGame;
    }

    public void paint(Graphics g)
    {
        super.paint(g); //  кнопки легковесные и прорисовываться без этого не будут
        g.setColor(Color.decode("#8FBC8F"));
        g.fillRect(10, 10, 475, 450);
        Player player = new Player("dfs");
        player.draw(g);
    }
}
