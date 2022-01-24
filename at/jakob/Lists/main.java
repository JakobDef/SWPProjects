package at.jakob.Lists;

public class main {

    public static void main(String[] args) {

        DefList list = new DefSingleConnectedList();

        list.add(6);
        list.add(9);
        list.add(4);
        list.add(2);
        list.add(0);

        System.out.println(list.get(3));

        list.remove(4);

        System.out.println(list.get(3));

        System.out.println(list.get(5));

    }

}
