package commands;

import java.util.HashMap;
import java.util.Map;

public class SmartOfficeCommandCenter {
    private final Map<String, Command> commandMap = new HashMap<>();

    public SmartOfficeCommandCenter() {
        registerDefaults();
    }

    private void registerDefaults() {
        commandMap.put("config room", new ConfigRoomCommand());
        commandMap.put("config room max capacity", new ConfigCapacityCommand());
        commandMap.put("block room", new BookRoomCommand());
        commandMap.put("cancel room", new CancelRoomCommand());
        commandMap.put("add occupant", new AddOccupantCommand());
        commandMap.put("room status", new RoomStatusCommand());
        commandMap.put("room summary", new RoomSummaryCommand());
    }

    public Command getCommand(String key) {
        Command cmd = commandMap.get(key.toLowerCase());
        if (cmd == null) {
            throw new IllegalArgumentException("Unknown command: " + key);
        }
        return cmd;
    }
    public String matchCommandKey(String input) {
        String matched = null;
        for (String key : commandMap.keySet()) {
            if (input.startsWith(key) &&
                (matched == null || key.length() > matched.length())) {
                matched = key;
            }
        }
        return matched;
    }
    public void printAllCommands() {
        for (Command cmd : commandMap.values()) {
            System.out.println("  " + cmd.getUsage());
        }
    }
    public void registerCommand(String key, Command command) {
        commandMap.put(key.toLowerCase(), command);
    }
}
