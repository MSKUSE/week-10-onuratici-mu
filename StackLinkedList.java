public class StackLinkedList implements Stack{

    StackItem top;

    @Override
    public void push(Object item) {
        StackItem newBox = new StackItem(item);
        newBox.setNext(this.top);
        top = newBox;
    }

    @Override
    public Object pop() {
        Object tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("Top is " + this.top.getData());
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
