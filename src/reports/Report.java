package reports;

public abstract class Report {
    private final String id;
    private Formatter formatter;

    public Report(String id, Formatter formatter) {
        this.id = id;
        this.formatter = formatter;
    }

    public String getId() {
        return id;
    }

    public void setImplementation(Formatter formatter) {
        this.formatter = formatter;
    }

    public String execute() {
        return formatter.format(id, getReportTitle(), calculateContent());
    }

    protected abstract String getReportTitle();
    protected abstract String calculateContent();
}