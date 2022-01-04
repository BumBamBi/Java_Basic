package A_09_Inheritance;

public class Circle extends Shape {
    int radius;
    // 자식이 같은 이름이 있으면 상속x
    // char -> int
    int title = 0;

    Circle(int x, int y, int radius){
        // spuer()를 통해 부모의 생성자를 호출함
        // 만약 super(x,y)가 따로 없다면, 부모생성자의 기본 생성자가 호출되어 0으로 초기화됨.
        super(x,y);
        
        this.radius = radius;
    }
    
    void getParentsTitle(){
        System.out.println(super.title);
    }

    void Overriding_test(){
        super.Overriding_test();
        System.out.println("It's child");
    }

    /* 
    void Overriding_test2(){
        // 부모의 final 메서드는 Overriding 불가
    }
     */
}