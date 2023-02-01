import java.util.*;
public class merge2list {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        a.addAll(0,b);
        System.out.println(a);
        a.set(2,0);
        System.out.println(a);
        System.out.println(a.get(3));
    }

}
