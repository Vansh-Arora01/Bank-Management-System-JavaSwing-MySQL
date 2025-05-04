import  java.util.*;
//public class Pyramid {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0;i<n;i++){
//            for (int j = 0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for (int k= 0;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
public  class Pyramid{
    public static void main(String[] args) {
        System.out.println("enter numbers ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=1;
       for (int i = 0 ; i <n;i++){
           for (int j = 0 ;j<i;j++){
               System.out.print(" ");
           }
           for (int k = 0;k<n-i;k++){
               System.out.print(k+" ");

           }
           System.out.println();
       }
    }
}
