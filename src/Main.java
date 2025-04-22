public class Main {
    public static void main(String[] args) {
        Report report = new Report("Продажі за лютий", "Загальний дохід: 1000000 uah.");

        ReportFormatter formatter = new ReportFormatter();
        ReportFileSaver fileSaver = new ReportFileSaver();
        ReportEmailSender emailSender = new ReportEmailSender();

        ReportManager manager = new ReportManager(formatter, fileSaver, emailSender);
        manager.processReport(report);
    }
}
