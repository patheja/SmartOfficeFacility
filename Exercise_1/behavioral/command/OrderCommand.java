public interface OrderCommand {
    void execute();
    void undo();
}