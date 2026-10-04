package reports;

public class TextFormatter implements Formatter {
    @Override
    public String format(String id, String title, String content) {
        return "TEXT [" + id + "] " + title + " -> " + content;
    }
}