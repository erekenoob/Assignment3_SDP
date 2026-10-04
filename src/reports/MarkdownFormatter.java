package reports;

public class MarkdownFormatter implements Formatter {
    @Override
    public String format(String id, String title, String content) {
        return "MARKDOWN ## " + title + " (ID: " + id + ") **" + content + "**";
    }
}