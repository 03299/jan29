import java.util.*;
public class hashmap1 {
    public static void main(String args[]){
        HashMap<String, Integer> m=new HashMap<>();
        m.put("India",450);
        m.put("Japan",300);
        m.put("China",500);
        m.put("Japan",200);
        m.remove("China");

        for(Map.Entry<String, Integer> e: m.entrySet()){
            System.out.println(e.getValue());
        }
    }

}
