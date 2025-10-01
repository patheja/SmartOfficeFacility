package core;

import java.util.*;

public class OfficeManager {
    private static OfficeManager instance;
    private final Map<Integer, Room> rooms = new HashMap<>();

    public static OfficeManager getInstance() {
        if (instance == null) {
            instance = new OfficeManager();
        }
        return instance;
    }

    public void configureRooms(int count) {
        if (count <= 0) {
            System.out.println("Invalid room count. Must be positive.");
            return;
        }
        rooms.clear();
        StringBuilder sb = new StringBuilder("Office configured with " + count + " meeting rooms:\n");
        for (int i = 1; i <= count; i++) {
            Room room = new Room(i);
            rooms.put(i, room);
            sb.append("Room ").append(i);
            if (i < count) sb.append(", ");
        }
        sb.append(".");
        System.out.println(sb.toString());
    }

    public Room getRoom(int id) {
        return rooms.get(id);
    }
}
