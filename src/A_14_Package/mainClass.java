package A_14_Package;

// import
// java.util.*;
import java.sql.Date;
// 동일한 패키지 이름은 사용 불가 즉,
//  java.util.Date는 사용 불가 <- 코드 내 따로 경로를 잡아주기

// 이런식으로 다른 패키지를 imprt할 수 있음
import A_13_Interface.*;

public class mainClass {
    // 같은 이름의 클래스들의 충돌을 피할 수 있고 관리가 용이함.
    // 권한도 패키지 단위로 제어 가능
    public static void main(String args[]){
        // 사용 빈도가 높음 java.sql.Date는 import하고, 빈도가 적은 java.util.Date는 직접 사용
        // java.util 패키지의 Data클래스 사용
        java.util.Date date = new java.util.Date();
        System.out.println(date.toString());
    }
}
