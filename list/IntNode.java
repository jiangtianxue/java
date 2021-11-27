package list;

public class IntNode {
    public int item;
    public IntNode next;

    /*  recursive implementation of a list */
    public IntNode(int i, IntNode n) {
        item = i;
        next = n;
    }
}
