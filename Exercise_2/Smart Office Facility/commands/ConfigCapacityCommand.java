package commands;
import core.*;
public class ConfigCapacityCommand implements Command{
     @Override
    public void execute(String[] args) {
        if (args.length != 2) throw new IllegalArgumentException("Usage: ");
        try {
            int roomId = Integer.parseInt(args[0]);
            int capacity = Integer.parseInt(args[1]);
            Room room = OfficeManager.getInstance().getRoom(roomId);
            if (room != null) room.setMaxCapacity(capacity);
            else System.out.println("Room " + roomId + " does not exist.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid capacity. Please enter a valid positive number.");
        }
    }
    @Override
    public String getUsage() {
        return "config room max capacity <roomId> <capacity>";
    }
}
