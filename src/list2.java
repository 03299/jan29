import java.util.ArrayList;
import java.util.Collections;
public class list2 {
    public static void main(String args[]){
        ArrayList<String> a=new ArrayList<>();
        a.add("Adi");
        a.add("vani");
        a.add("sahvi");
        a.add("ravi");
        a.add(2,"roy");
        a.remove(4);
        a.set(0,"Kavi");
        System.out.println(a.size());
        for(String n: a){
            System.out.println(n);
        }
        Collections.sort(a);
        System.out.println(a);
    }
}
