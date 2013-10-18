package kata3;

public class CalcuclateMailDomainHistogramControl {
    
    private String filename;

    public CalcuclateMailDomainHistogramControl(String filename) {
        this.filename = filename;
    }
    
    public void execute() {
        HistogramBuilder<String> builder = new HistogramBuilder();
        builder.calculate(MailReader.readDomain(filename));
        HistogramViewer<String> viewer = new HistogramViewer<String>(builder.getHistogram());
        viewer.show();
    }
}
