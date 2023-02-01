interface A6{
    public void show1();
}
interface B6{
    public void show2();
}
interface C6 extends A6,B6{
    public void show3();
}
class D6 implements C6{
    public void show1(){
        System.out.println("hi");
    }
    public void show2(){
        System.out.println("Chitra");
    }
    public void show3(){
        System.out.println("How are you");
    }
}
public class inher1{
    public static void main(String args[]){
        D6 o=new D6();
        o.show1();
        o.show2();
        o.show3();

    }
}