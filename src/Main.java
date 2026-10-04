import reports.*;

public class Main {
    public static void main(String[] args) {
        int passed = 0;
        int total = 7;

        Formatter textFmt = new TextFormatter();
        Formatter htmlFmt = new HtmlFormatter();
        Formatter mdFmt = new MarkdownFormatter();

        Report t1Report = new AttendanceReport("R01", textFmt, 3, 4);
        String t1Res = t1Report.execute();
        boolean t1Pass = t1Res.contains("TEXT") && t1Res.contains("75%");
        if (t1Pass) passed++;
        System.out.println("T1 " + (t1Pass ? "PASS" : "FAIL") + " | AttendanceReport + TextFormatter | result=" + t1Res);

        Report t2Report = new AttendanceReport("R01", htmlFmt, 3, 4);
        String t2Res = t2Report.execute();
        boolean t2Pass = t2Res.contains("HTML") && t2Res.contains("75%");
        if (t2Pass) passed++;
        System.out.println("T2 " + (t2Pass ? "PASS" : "FAIL") + " | AttendanceReport + HtmlFormatter | result=" + t2Res);

        Report t3Report = new GradeReport("R02", textFmt, 70, 80, 90);
        String t3Res = t3Report.execute();
        boolean t3Pass = t3Res.contains("TEXT") && t3Res.contains("80");
        if (t3Pass) passed++;
        System.out.println("T3 " + (t3Pass ? "PASS" : "FAIL") + " | GradeReport + TextFormatter | result=" + t3Res);

        Report t4Report = new GradeReport("R02", htmlFmt, 70, 80, 90);
        String t4Res = t4Report.execute();
        boolean t4Pass = t4Res.contains("HTML") && t4Res.contains("80");
        if (t4Pass) passed++;
        System.out.println("T4 " + (t4Pass ? "PASS" : "FAIL") + " | GradeReport + HtmlFormatter | result=" + t4Res);

        AttendanceReport t5Report = new AttendanceReport("R03", textFmt, 3, 4);
        Report originalRef = t5Report;
        String before = t5Report.execute();

        t5Report.setImplementation(htmlFmt);
        String after = t5Report.execute();

        boolean sameObject = (t5Report == originalRef);
        boolean stateUnchanged = t5Report.getId().equals("R03") && t5Report.getAttendedSessions() == 3 && t5Report.getTotalSessions() == 4;
        boolean t5Pass = sameObject && stateUnchanged && before.contains("TEXT") && after.contains("HTML");
        if (t5Pass) passed++;

        System.out.println("T5 " + (t5Pass ? "PASS" : "FAIL") + " sameObject=" + sameObject + " | stateUnchanged=" + stateUnchanged);
        System.out.println("before=" + before + " | after=" + after);


        System.out.println("SUMMARY: " + passed + "/" + total + " PASS");
    }
}