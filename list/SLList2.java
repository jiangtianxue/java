package list;

public class SLList2 {
    /*  nested class definition，将两个class合并成为一个class
        没有用到任何SLList2的实例变量和方法，可以将其声明为static   */
    private static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
        item = i;
        next = n;
        }
    }
    /*  private 关键字，外部无法访问 */
    private IntNode first;

    public SLList2(int x){
        first = new IntNode(x, null);
    }

    public void addFirst(int x){
        first = new IntNode(x, first);
    }

    public int getFirst(){
        return first.item;
    }
}
