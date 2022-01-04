package A_09_Inheritance;

import java.util.stream.StreamSupport;

public class Shape {
    int x = 0;
    int y = 0;
    // private 은 상속x
    private int secureNum = 0;
    // 자식이 같은 이름이 있으면 상속x
    char title = 'A';

    Shape(){
        // super(x,y)가 주석처리 된 경우
        this(0,0);
    }
    Shape(int x, int y){
        // super(x,y)를 입력한경우
        this.x = x;
        this.y = y;
    }

    void showPrint(){
        System.out.println("---It's parents's method!---");
    }

    void Overriding_test(){
        System.out.println("---Overring test---");
        System.out.println("It's parents");
    }

    final void Overriding_test2(){
        System.out.println("--parents's final method--");
    }
}

