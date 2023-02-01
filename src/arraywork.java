import java.util.*;
public class arraywork {
    public static void main(String args[]){
        //Program for checking all elements of the array is palindrome
        /*
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();//111, 121, 222, 333, 444
        }
        int flag=1;
        for(int i=0; i<n; i++){
            int tmp=a[i],sum=0;//111
            while(tmp!=0){
                int r=tmp%10;
                sum=sum*10+r;
                tmp=tmp/10;
            }
            if(sum!=a[i]){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("Yes");
        }

         */

        //Program for checking smallest on right side
        int a[]={12, 1, 2, 3, 0, 11, 4};
        for(int i=0; i<a.length; i++){

            int count=0;
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
