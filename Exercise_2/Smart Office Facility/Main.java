import commands.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        SmartOfficeCommandCenter registry=new SmartOfficeCommandCenter();
        Scanner sc=new Scanner(System.in);
        boolean running =true;
        System.out.println("Smart Office Facility");
        System.out.println("====================================");
        System.out.println("Available Commands:");
        registry.printAllCommands();
        System.out.println("====================================");
        while(running){
            System.err.print("> ");
            String input=sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                running = false;
                System.out.println("Shutting down Smart Office system...");
                break;
            }
            String matchedKey = registry.matchCommandKey(input.toLowerCase());
            if(matchedKey==null){
                System.out.println("Unknown command. Did you mean one of these?");
                registry.printAllCommands();
                continue;
            }
            String[] parts=input.split(" ");
            String[] cmdArgs = Arrays.copyOfRange(
                    parts, matchedKey.split(" ").length, parts.length);
            try{
                Command cmd = registry.getCommand(matchedKey);
                cmd.execute(cmdArgs);
                System.out.println("Command executed: " + matchedKey);
            }
            catch (IllegalArgumentException e){
                System.out.println("Error: "+e.getMessage());
            }catch(Exception e){
                System.out.println("Unexpected error: "+e.getMessage());
            }
        }
        System.out.println("Exiting Smart Office Facility");
    }
}
