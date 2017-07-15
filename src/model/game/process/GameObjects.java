package model.game.process;

import model.game.process.data.Coordinates;
import model.non.player.character.GameObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Хранилище всех игровых объектов
 */
public class GameObjects {

    List<GameObject> gameObjects = new ArrayList();

    private static volatile GameObjects instance;

    private GameObjects() {}


    public static GameObjects getInstance() {
        GameObjects localInstance = instance;
        if (localInstance == null) {
            synchronized (GameProcess.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new GameObjects();
                }
            }
        }
        return localInstance;
    }


    public List<GameObject> getGameObjects() {
        return gameObjects;
    }

    public void setGameObject(GameObject gameObject) {
        getInstance().getGameObjects().add(gameObject);
    }

    public GameObject getGameObject(Coordinates coordinates) {

        List<GameObject> tmpRepository = getInstance().getGameObjects();

        for (int i = 0; i < tmpRepository.size(); i++) {
            if (tmpRepository.get(i).getCoordinates().equals(coordinates));
            return gameObjects.get(i);
        }

        return null;
    }
}
