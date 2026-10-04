package reports;

public class GradeReport extends Report {
    private final int[] grades;

    public GradeReport(String id, Formatter formatter, int... grades) {
        super(id, formatter);
        this.grades = grades;
    }

    @Override
    protected String getReportTitle() {
        return "Grade Report";
    }

    @Override
    protected String calculateContent() {
        if (grades == null || grades.length == 0) {
            return "average of 0 as 0";
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        int average = sum / grades.length;

        StringBuilder sb = new StringBuilder("average of ");
        for (int i = 0; i < grades.length; i++) {
            sb.append(grades[i]);
            if (i < grades.length - 2) sb.append(", ");
            else if (i == grades.length - 2) sb.append(" and ");
        }
        return sb.append(" as ").append(average).toString();
    }
}