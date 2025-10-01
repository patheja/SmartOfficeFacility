public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber Theja = new RegularReader("Thejeshwar Raj");
        Subscriber friend = new RegularReader("friend");

        publisher.subscribe(Theja);
        publisher.subscribe(friend);

        publisher.publishNewIssue("Tech Monthly", 1);
        publisher.publishNewIssue("Tech Monthly", 2);

        // Bob unsubscribes
        publisher.unsubscribe(friend);

        publisher.publishNewIssue("Tech Monthly", 3);
    }
}
