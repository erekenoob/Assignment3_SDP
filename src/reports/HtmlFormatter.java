package reports;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String id, String title, String content) {
        return "HTML <div id='" + id + "'><h1>" + title + "</h1><p>" + content + "</p></div>";
    }
}