package at.jakob.observer.Messgerät;

public class main {

    public static void main(String[] args) {
        LineChart l1 = new LineChart(1);
        LineChart l2 = new LineChart(2);
        LineChart l3 = new LineChart(3);
        BarChart b1 = new BarChart(4);

        Gauge gauge = new Gauge();

        gauge.addObserver(l1);
        gauge.addObserver(l3);
        gauge.addObserver(b1);

        gauge.draw(69);
        gauge.draw(690);
        gauge.draw(120120201);

    }



}
