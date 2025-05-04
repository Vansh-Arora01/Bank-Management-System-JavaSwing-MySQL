public class Employee {
    int empno ;
   static int empcount =0;
   static double totalSal=0;
    double salary;
    Employee(double salary){
        empcount++;
        this.empno=empcount;
        this.salary=salary;
        totalSal+=salary;

    }
    public  void display(){
        System.out.println("emp no :"+ this.empno + "emp salary"+this.salary);
    }
    public static void stats(){
        System.out.println("total sal"+ totalSal);
        System.out.println("total count "+ empcount);
    }
}
