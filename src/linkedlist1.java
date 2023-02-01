import java.util.*;
public class linkedlist1 {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        LinkedList l=new LinkedList();
        for(int i=0; i<n; i++){
            int tmp=sc.nextInt();
            l.add(i,tmp);
        }
        for(int i=0; i<n; i++){
            System.out.println(l.get(i));
        }
    }

}
