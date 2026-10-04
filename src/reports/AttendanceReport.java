package reports;

public class AttendanceReport extends Report {
    private final int attendedSessions;
    private final int totalSessions;

    public AttendanceReport(String id, Formatter formatter, int attendedSessions, int totalSessions) {
        super(id, formatter);
        this.attendedSessions = attendedSessions;
        this.totalSessions = totalSessions;
    }

    public int getAttendedSessions() { return attendedSessions; }
    public int getTotalSessions() { return totalSessions; }

    @Override
    protected String getReportTitle() {
        return "Attendance Report";
    }

    @Override
    protected String calculateContent() {
        int percentage = (int) Math.round(((double) attendedSessions / totalSessions) * 100);
        return attendedSessions + " of " + totalSessions + " attended sessions as " + percentage + "%";
    }
}