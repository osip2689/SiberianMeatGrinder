package view;


import javax.swing.*;

/*
        Класс панель на котором будет все отображаться
*/

public class FieldGame extends JPanel{
    private final ViewGame viewGame;        // поле отображение

    public FieldGame(ViewGame viewGame) {
        this.viewGame = viewGame;
    }
}
