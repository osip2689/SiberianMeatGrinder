package view;


import controller.GameController;
import model.game.process.GameProcess;

import javax.swing.*;

/*
Класс отвечающий за отображение игровых процессов (представление)
*/

public class ViewGame extends JFrame
{
    private GameController controller;  // поле контроллера
    private FieldGame field;            // поле панели представления

    private GameProcess gameProcess = GameProcess.getInstance();

    public ViewGame(GameController controller) {
        this.controller = controller;
    }

    /*инициализация класса*/
    public void init() {
        //  создаем новый объект панели представления
        field = new FieldGame(this);

        //  добавляем на предстваление
        add(field);

        //  действие при закрытии на крестик (выход и закрытия программы)
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //  установка размеров представления
        setSize(500, 500);

        //  установка положения при запуске
        setLocationRelativeTo(null);

        //  подпись окна
        setTitle("SiberianMeatGrinder");

        setResizable(false);

        //  видимость
        setVisible(true);
    }

    public void update()
    {
        field.repaint();
    }

    public GameProcess getGameProcess() {
        return gameProcess;
    }
}
