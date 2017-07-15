package view;


import controller.GameController;

import javax.swing.*;

/*
Класс отвечающий за отображение игровых процессов (представление)
*/

public class ViewGame extends JFrame
{
    private GameController controller;  // поле контроллера
    private FieldGame field;            // поле панели представления

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
        setSize(490, 600);

        //  установка положения при запуске
        setLocationRelativeTo(null);

        //  подпись окна
        setTitle("SiberianMeatGrinder");

        //  видимость
        setVisible(true);
    }
}
