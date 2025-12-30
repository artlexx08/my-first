 import java.util.Scanner;
public class far{
    public static void main(String[] args) throws InterruptedException{
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the first number :");
        int  u=sc.nextInt();
        System.out.println("Enter the last number :");
        int a=sc.nextInt();
        Thread.sleep(1000);

        System.out.println("--------------------------");
        Thread.sleep(1000);

        int i;
        for(i=u;i<=a;i++)
        
        System.out.println(i);

    }
} 
    

