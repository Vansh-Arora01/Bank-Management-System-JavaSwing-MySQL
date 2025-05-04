import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        long fact=1;
        for(int i=1;i<=no;i++){
          fact= fact*i;
        }
        System.out.println(fact);
    }

}
