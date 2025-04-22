public class ReportManager {
    private ReportFormatter formatter;
    private ReportFileSaver fileSaver;
    private ReportEmailSender emailSender;

    public ReportManager(ReportFormatter formatter, ReportFileSaver fileSaver, ReportEmailSender emailSender) {
        this.formatter = formatter;
        this.fileSaver = fileSaver;
        this.emailSender = emailSender;
    }

    public void processReport(Report report) {
        String formatted = formatter.format(report);
        fileSaver.saveToFile(formatted);
        emailSender.sendByEmail(formatted);
    }
}

