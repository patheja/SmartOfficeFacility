package core;

public interface RoomObserver {
    public void update(int roomId, boolean occupied, int count);
}
