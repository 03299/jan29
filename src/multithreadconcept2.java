class A1 implements Runnable{
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("A="+i);
        }
    }

}

public class multithreadconcept2 {
    public static void main(String args[]){
        A1 a=new A1();
        Thread t=new Thread(a);
        t.start();
    }
}
