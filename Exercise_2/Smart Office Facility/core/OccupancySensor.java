package core;

import java.util.ArrayList;
import java.util.List;

public class OccupancySensor{
     private final List<RoomObserver> observers = new ArrayList<>();

    public void attach(RoomObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(int roomId, boolean occupied, int count) {
        for (RoomObserver obs : observers) {
            obs.update(roomId, occupied, count);
        }
    }
}
