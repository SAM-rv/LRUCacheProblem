package LRUCacheProblem;

public class Nodes {
    private int key;
    private int value;
    private Nodes previous;
    private Nodes next;

    public Nodes(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {return key;}

    public int getValue() {return value;}

    public Nodes getNext() {return next;}

    public Nodes getPrevious() {return previous;}

    public void setValue(int value) {this.value = value;}

    public void setNext(Nodes next) {this.next = next;}

    public void setPrevious(Nodes previous) {this.previous = previous;}

}


