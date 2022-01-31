package at.jakob.observer.Messgerät;

public class LineChart extends AbstractObserver{

    public LineChart(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public void draw(int x) {
        System.out.println("Line Chart " + serialNumber + ":\n\tTemperatur: " + x);
    }
}
