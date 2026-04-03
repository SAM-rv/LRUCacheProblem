package LRUCacheProblem;
import java.util.HashMap;
import java.util.Map;

public class LRU {
    Nodes head=new Nodes(-1,-1);
    Nodes tail=new Nodes(-1,-1);
    int size;
    LRU(int size) {
        this.size=size;
        head.setNext(tail);
        tail.setPrevious(head);
    }
    Map<Integer,Nodes> map1=new HashMap<>();

    public void put(int key,int value){
        Nodes node;
        if(map1.containsKey(key)){
            node=map1.get(key);
            node.setValue(value);
            moveToFront(node);
            return;
        }
        if(map1.size()>=size)
            removeLast(tail.getPrevious());

        node=new Nodes(key,value);
        map1.put(key,node);
        addToFront(node);
    }

    public void moveToFront(Nodes node){
            removeNode(node);
            addToFront(node);
    }

    public int get(int key){
        Nodes node;
        if(!map1.containsKey(key)){
            System.out.println("Key Not Found In Cache Memory");
            return -1;
        }
        node=map1.get(key);
        moveToFront(node);
        return node.getValue();
    }

    public void removeLast(Nodes node){
        removeNode(node);
        map1.remove(node.getKey());
    }

    public void addToFront(Nodes node){
        node.setPrevious(head);
        node.setNext(head.getNext());
        head.getNext().setPrevious(node);
        head.setNext(node);
    }

    public void removeNode(Nodes node){
        node.getPrevious().setNext(node.getNext());
        node.getNext().setPrevious(node.getPrevious());
        node.setNext(null);
        node.setPrevious(null);
    }

}
