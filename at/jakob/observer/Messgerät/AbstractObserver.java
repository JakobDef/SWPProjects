package at.jakob.observer.Messgerät;

public abstract class AbstractObserver implements Observer {
    protected int serialNumber;

    public AbstractObserver(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public int getSerialNumber() {
        return this.serialNumber;
    }
}
