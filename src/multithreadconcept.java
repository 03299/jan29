class A extends Thread{
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("A="+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int j=0; j<20; j++){
            System.out.println("B="+j);
        }
    }
}
public class multithreadconcept {
    public static void main(String args[]){
        A a=new A();
        B b=new B();
        a.start();
        b.start();
    }
}
