package at.jakob.Lists;

public class DefSingleConnectedList implements DefList {

    private Node root;
    private int size;

    @Override
    public void add(int value) {
        if(this.root == null){
            this.root = new Node(value);
            this.size++;
            return;
        }

        Node pointer = root;

        while(pointer.getNext() != null) pointer = pointer.getNext();

        pointer.setNext(new Node(value));
        this.size++;

    }

    @Override
    public void remove(int index) {
        if(index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        Node pointer = root;

        for(int i = 0; i < index-1; i++){
            pointer = pointer.getNext();
        }

        pointer.setNext(pointer.getNext().getNext());

    }

    @Override
    public int get(int index) {
        if(index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        Node pointer = root;
        for(int i = 0; i < index; i++){
            pointer = pointer.getNext();
        }
        return pointer.getValue();
    }
}
