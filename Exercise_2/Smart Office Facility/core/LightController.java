package core;

public class LightController implements RoomObserver{
    @Override
    public void update(int roomId, boolean occupied, int count) {
        System.out.println("Lights turned " + (occupied ? "ON" : "OFF") + " in Room " + roomId);
    }
}
