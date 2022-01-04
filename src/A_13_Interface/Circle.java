package A_13_Interface;

// 다중상속 느낌으로 Shape은 상속받고 myInterface는 인터페이스로 사용
public class Circle extends Shape implements myInterface{
    int radius;

    Circle(int x, int y, int radius){
        // spuer()를 통해 부모의 생성자를 호출함
        // 만약 super(x,y)가 따로 없다면, 부모생성자의 기본 생성자가 호출되어 0으로 초기화됨.
        super(x,y);
        this.radius = radius;
    }
    

    // 인터페이스 구간
    public void test1(){
        System.out.println(x + y);
    }
    public void test2(){
        System.out.println(x + y + radius);
    }
}