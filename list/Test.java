package list;

public class Test {
    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        int x = L.getFirst();
        System.out.println(x);

        IntList M = new IntList(15, null);
        M = new IntList(10, M);
        M = new IntList(5, M);
        int y = M.first;
        System.out.println(y);
    }
}
