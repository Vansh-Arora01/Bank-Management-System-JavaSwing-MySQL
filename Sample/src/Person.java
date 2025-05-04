public class Person {
    String name;
    int age;
    Person(String name){
        this.name=name;
        this.age=18;
    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name "+this.name);
        System.out.println("Age"+this.age);

    }
}
