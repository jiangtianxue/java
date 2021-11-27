package list;

public class IntList {
    public int first;
    public IntList rest;

    /*  recursive implementation of a list */
    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }
}
