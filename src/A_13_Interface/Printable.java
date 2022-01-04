package A_13_Interface;

// 인터페이스간의 다중 상속
// 이 인터페이스를 implements받을 객체는 상위 메서드를 전부 Overriding해야함.
interface Printable extends Paintable, Drawable {
    public void print();
}
