package at.jakob.Lists;

public interface DefList {

    public void add(int value);

    public boolean remove(int value);
    public boolean removeAt(int index);

    public int get(int index);

    public boolean contains(int value);

    public String toString();


}
