package A_08_Arguments;

public class myMath {
    
    // 가변 매개변수
    // 가변 매개변수는 매개변수의 마지막에 딱 한번만 사용가능
    public static int intSum(int... num){
        int sum = 0;
        for(int i=0; i<num.length; i++){
            sum += num[i];
        }
        return sum;
    }
}
