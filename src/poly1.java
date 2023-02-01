class A7{
    public void show(){
        System.out.println("This is very unique sounds..");
    }
}
class B7 extends A7{
    public void show(){
        super.show();
        System.out.println("THis is peacock..");
    }

}

public class poly1 {
    public static void main(String args[]) {


    B7 b = new B7();
    b.show();
}
}
