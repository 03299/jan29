import java.util.*;
public class Demo {
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(23);
        a.add(12);
        a.add(67);
        a.add(44);
        System.out.println(a);
        a.add(2,89);
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        //Arraylist contains an element or not
        System.out.println(a.contains(12));

    }

}
