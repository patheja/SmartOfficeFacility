public class RegularReader implements Subscriber {
    private String name;

    public RegularReader(String name) {
        this.name = name;
    }

    @Override
    public void update(String magazineName, int issueNumber) {
        System.out.println(name + ": Received " + magazineName + " Issue " + issueNumber + " in mailbox.");
    }
}