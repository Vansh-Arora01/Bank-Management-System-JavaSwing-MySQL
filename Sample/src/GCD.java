import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        //eucleids
        while (n2!=0){
            int temp = n2;
            n2=n1 % n2;
            n1=temp;
        }
        System.out.println("GCD IS "+n1);
    }
}
