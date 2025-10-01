public class Manual {
    private StringBuilder manual = new StringBuilder();

    public void add(String info) {
        manual.append(info).append("\n");
    }

    @Override
    public String toString() {
        return manual.toString();
    }
}
