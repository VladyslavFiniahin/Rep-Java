public class ReportFormatter {
    public String format(Report report) {
        return "=== " + report.getTitle() + " ===\n" + report.getContent();
    }
}
