package model.game.process;

import controller.GameEventListener;

/**
 * Непосредственно сам игровой процесс описывается
 * в этом классе и все передается на представление.
 * Класс синглтон(не знаю будет ли это работать)
 */
public class GameProcess {
    private GameEventListener gameEventListener;
    private GameObjects gameObjects = GameObjects.getInstance();

    private static volatile GameProcess instance;

    private GameProcess() {}


    public static GameProcess getInstance() {
        GameProcess localInstance = instance;
        if (localInstance == null) {
            synchronized (GameProcess.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new GameProcess();
                }
            }
        }
        return localInstance;
    }

    public GameObjects getGameObjects() {
        return gameObjects;
    }
}
