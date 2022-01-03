package A_07_Overloading;

public class Employee {
    String name;
    int age;

    void print_type(){
        System.out.println("void");
    }
    void print_type(String s){
        System.out.println("string");
    }
    void print_type(int n){
        System.out.println("int");
    }
}
