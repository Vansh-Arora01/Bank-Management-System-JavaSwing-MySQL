import  java.util.*;
public class REverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int temp = n ;
        int rem = 0;
        while (temp!=0){
            int ans = temp%10;
            rem= rem*10+ans;
            temp/=10;

        }
        System.out.println("number before reverse is"+n);
        System.out.println("number after reverse is"+rem);

    }
}
