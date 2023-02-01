class A3{
    private int a,b;
    public void set(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void get(){
        System.out.println("A= "+a+"B="+b);
    }
}
public class encap1 {
    public static void main(String args[]){
        A3 o=new A3();


        o.set(4,7);
        o.get();
    }
}
