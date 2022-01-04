package A_09_Inheritance;

public class mainClass {

    // extends
    // 부모로 물려받은 공통특징 + 개인의 특별 특징(확장)
    // 다중 상속 금지
    // 자식클래스를 생성하면, 부모클래스의 생성자-자식클래스 생성자 순서로 실행
    // super()로 부모의 생성자를 호출함.(부모에 접근 가능)
    // super()는 항상 자식 생성자의 처음에 실행되어야함 - 부모생성자가 자식생성자보다 먼저 수행되어야 하므로
    
    
    // private 변수는 상속X
    // 부모클래스와 같은 이름의 변수를 자식이 선언하면 상속X
    public static void main(String args[]){
        Circle c1 = new Circle(1, 1, 1);
        c1.title = 1;   // char가 아닌 int형(=부모것이 상속x)
        // c1.secureNum = 0; // 에러(private은 상속 안됨)

        // super로 부모에 접근
        c1.getParentsTitle();

        // 부모의 메서드에 접근
        c1.showPrint();

        // Overridng(부모의 메서드를 상속받지 않고 재정의)
        // Overriding 할 때, super를 통해 부모의 메서드를 상속받고 추가로 재정의도 가능
        c1.Overriding_test();

        // 메서드 앞에 final이 붙으면 Overriding 금지
        // c1.
    }
}
