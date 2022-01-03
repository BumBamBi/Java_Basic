package A_05_Constructor;

public class mainClass {
    // 반환형이 없다
    // 생성자는 클래스와 같은 이름으로 선언됨
    // 이름은 같게, 매개변수를 다르게 하여 중복정의(Overloading)가능
    // 접근 권한자로 (public, protected, private)이 있다.
    
    public static void main(String args[]){
        Employee E1 = new Employee("이름", 123);
        // 생성자의 매개변수 만큼 항상 값을 넣어서 초기화 해야함.
    }
}