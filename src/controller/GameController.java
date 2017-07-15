package controller;


import view.ViewGame;

/*
Класс контроллер который будет передавать все действия от игрока в игровую модель
*/

public class GameController implements GameEventListener {

    private ViewGame view;  // поле представления

    public GameController() {

        // при создании нового объекта типа GameController, будет запускаться новое окно с игровым процессом

        this.view = new ViewGame(this);        // создаем представление с текущим контроллером
        this.view.init();                               // инициализируем представление
    }



    /*При запуске начнется игра*/

    public static void main(String[] args) {
        GameController controller = new GameController();
    }
}
