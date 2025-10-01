package commands;
import core.*;
import java.time.LocalTime;
public class BookRoomCommand implements Command{
    @Override
    public void execute(String[] args) {
        if (args.length != 3) throw new IllegalArgumentException("Usage: "+getUsage());
        try {
            int roomId = Integer.parseInt(args[0]);
            LocalTime start = LocalTime.parse(args[1]);
            int duration = Integer.parseInt(args[2]);
            Room room = OfficeManager.getInstance().getRoom(roomId);
            if (room != null) room.book(start, duration);
            else System.out.println("Room " + roomId + " does not exist.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid room number. Please enter a valid room number.");
        }
    }
    @Override
    public String getUsage() {
        return "block room <roomId> <HH:MM> <duration>";
    }
}
