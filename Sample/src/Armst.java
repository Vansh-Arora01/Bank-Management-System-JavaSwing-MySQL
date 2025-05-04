import java.util.*;
public class Armst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int temp = n;
        int art =0;
        while (temp!=0){
             int ans =temp%10;
             art+=Math.pow(ans,3);
             temp/=10;

        }
        if(art==n){
            System.out.println("ARms");
        }
        else {
            System.out.println("not arms");
        }
    }
}
