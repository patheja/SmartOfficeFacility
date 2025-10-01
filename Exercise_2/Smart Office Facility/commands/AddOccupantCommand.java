package commands;
import core.*;
public class AddOccupantCommand implements Command{
   @Override
    public void execute(String[] args) {
        if (args.length != 2) throw new IllegalArgumentException("Usage: "+getUsage());
        try {
            int roomId = Integer.parseInt(args[0]);
            int count = Integer.parseInt(args[1]);
            Room room = OfficeManager.getInstance().getRoom(roomId);
            if (room != null) room.setOccupants(count);
            else System.out.println("Room " + roomId + " does not exist.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid room number. Please enter a valid room number.");
        }
    }
    @Override
    public String getUsage() {
        return "add occupant <roomId> <count>";
    }
}
