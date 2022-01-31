package at.jakob.Test;

public class main {
    public static void main(String[] args) {
        Economy ec = new Economy();
        SuperSpar ss = new SuperSpar();
        TopSpeed ts = new TopSpeed();

        Motorsteuerung motor1 = new Motorsteuerung(ec);

        motor1.drive();

        motor1.setAlgorithmus(ss);

        motor1.drive();

        motor1.setAlgorithmus(ts);

        motor1.drive();

    }
}
