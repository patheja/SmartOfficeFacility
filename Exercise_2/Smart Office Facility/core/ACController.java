package core;

public class ACController implements RoomObserver{
    @Override
    public void update(int roomId, boolean occupied, int count) {
        System.out.println("AC turned " + (occupied ? "ON" : "OFF") + " in Room " + roomId);
    }
}
