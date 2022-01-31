package at.jakob.observer.Messgerät;

public class BarChart extends AbstractObserver{

    public BarChart(int serialNumber) {
        super(serialNumber);
    }

    @Override
    public void draw(int x) {
        System.out.println("Bar Chart " + serialNumber + ":\n\tTemperatur: " + x);

    }
}
