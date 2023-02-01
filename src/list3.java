import java.util.LinkedList;
public class list3 {
    public static void main(String args[]){
        LinkedList<String> l=new LinkedList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.addFirst("z");
        l.addLast("d");
        l.set(0,"Start");
        l.removeLast();
        l.removeFirst();
        for(String s: l){
            System.out.println(s);
        }
    }
}
