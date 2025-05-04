import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int n = sc.nextInt();
        int f = 0;
        int s=1;
        System.out.println("Fibonacci series");
        for(int i =1;i<=n;i++){
            System.out.println(f);
            int next = f+s;
            f=s;
            s=next;
        }
    }
}
