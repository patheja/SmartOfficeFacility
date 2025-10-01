package commands;
import core.*;
public class CancelRoomCommand implements Command{
    @Override
    public void execute(String[] args) {
        if (args.length != 1) throw new IllegalArgumentException("Usage: "+getUsage());
        try {
            int roomId = Integer.parseInt(args[0]);
            Room room = OfficeManager.getInstance().getRoom(roomId);
            if (room != null) room.cancelBooking();
            else System.out.println("Room " + roomId + " does not exist.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid room number. Please enter a valid room number.");
        }
    }
    @Override
    public String getUsage() {
        return "cancel room <roomId>";
    }
}
