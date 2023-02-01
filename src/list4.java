import java.util.Stack;
public class list4 {
    public static void main(String args[]){
        Stack<String> s=new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        s.pop();
        for(String n: s){
            System.out.println(n);
        }
    }
}
