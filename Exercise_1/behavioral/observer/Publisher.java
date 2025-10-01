import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    public void unsubscribe(Subscriber sub) {
        subscribers.remove(sub);
    }

    public void publishNewIssue(String magazineName, int issueNumber) {
        System.out.println("\nPublisher: New issue released - " + magazineName + " Issue " + issueNumber);
        notifySubscribers(magazineName, issueNumber);
    }

    private void notifySubscribers(String magazineName, int issueNumber) {
        for (Subscriber sub : subscribers) {
            sub.update(magazineName, issueNumber);
        }
    }
}