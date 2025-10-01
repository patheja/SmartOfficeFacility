package commands;

import core.*;

public class RoomStatusCommand implements Command{
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: "+getUsage());
            return;
        }
        try {
            int roomId = Integer.parseInt(args[0]);
            Room room = OfficeManager.getInstance().getRoom(roomId);
            if (room != null) {
                room.printStatus();
            } else {
                System.out.println("Room " + roomId + " does not exist.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid room number. Please enter a valid room number.");
        }
    }
    @Override
    public String getUsage() {
        return "room status <roomId>";
    }
}
