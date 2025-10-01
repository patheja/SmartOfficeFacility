package commands;
import core.*;
public class ConfigRoomCommand implements Command{
    @Override
    public void execute(String[] args) {
        if (args.length != 2 || !args[0].equalsIgnoreCase("count"))
            throw new IllegalArgumentException("Usage: "+getUsage());
        try {
            int count = Integer.parseInt(args[1]);
            OfficeManager.getInstance().configureRooms(count);
        } catch (NumberFormatException e) {
            System.out.println("Invalid room count. Please enter a valid positive number.");
        }
    }
    @Override
    public String getUsage() {
        return "config room count <count>";
    }
}
