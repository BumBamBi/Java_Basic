package A_11_Inner_Class;

public class mainClass {
    // 내부 클래스
    // 정의되는 위치에 따라 멤버클래스와 지역클래스로 구분

    // 멤버 클래스
    // 멤버 변수와 동일하게 변수자리에 선언된 클래스
    // static이 붙은것과 안붙은것으로 나뉨
    // 동일 클래스 외 다른 클래스에서도 활용 가능
    // 멤버변수와 성격이 비슷함

    // 지역 클래스
    // 메서드 내에 클래스가 정의된 경우
    // 이름을 가지고있는것고 이름을 가지지 않는 것으로 나뉨
    // 활용범위가 메서드 블록 내부로 제한되어 지역변수와 성격이 비슷함


    // 이름이 없는 내부클래스를 위해 클래스를 인자로 넣는 식으로 구현
    public static void watchTV(TV tv){
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();
    }

    public static void main(String args[]){
        // static이 없는 내부 클래스
        // 내부클래스가 생성되기 위해선 외부클래스의 객체가 반드시 필요함
        // 외부클래스명$내부클래스명.class
        Outside outer1 = new Outside();
        Outside.Inside inner1 = outer1.new Inside();

        // static이 있는 내부 클래스
        // 그러나 static 내부 클래스라면 외부 클래스 객체를 만들지 않아도 됨
        Outside.staticInner sInner = new Outside.staticInner();

        // 이름이 있는 내부 클래스
        // 외부클래스명$1$내부클래스명.class
        Outside outer2 = new Outside();
        Outside.Inside inner2 = outer2.new Inside();

        // 이름이 없는 내부 클래스
        // 추상 클래스인 TV를 만들고 인자로 넣었기 때문에 이 내부에서만 사용되는 내부클래스가 됨 
        // 이름 있게 사용하는 것이 더 명확하고 재사용성이 좋음
    }
    
}
