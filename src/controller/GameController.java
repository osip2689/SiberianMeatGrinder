package controller;


import model.game.process.GameProcess;
import model.player.character.Player;
import view.ViewGame;

/*
Класс контроллер который будет передавать все действия от игрока в игровую модель
*/

public class GameController implements GameEventListener {

    private ViewGame view;  // поле представления

    private GameProcess gameProcess = GameProcess.getInstance();

    public GameController() {

        // при создании нового объекта типа GameController, будет запускаться новое окно с игровым процессом

        this.view = new ViewGame(this);        // создаем представление с текущим контроллером
        gameProcess.getGameObjects().setGameObject(new Player("ПУТИН"));

        this.view.init();                               // инициализируем представление

        while (true) view.update();
    }



    /*При запуске начнется игра*/

    public static void main(String[] args) {
        GameController controller = new GameController();
    }
}
