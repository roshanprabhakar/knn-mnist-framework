public class DataPoint {
    private String label;
    private DImage data;

    public DataPoint(String label, DImage data) {
        this.label = label;
        this.data = data;
    }

    public DataPoint() {

    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public DImage getData() {
        return data;
    }

    public void setData(DImage data) {
        this.data = data;
    }
}
