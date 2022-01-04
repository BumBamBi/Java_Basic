package A_15_Exception;

public class mainClass {

    // 예외가 발생하면 JVM에서 예외객체를 반환해줌
    // 이를 통해 어떤 예외인지 확인해서 처리 가능함

    // try - catch - (finally)
    // try는 한 줄 이상의 코드 필요
    // 중간에 예외가 발생하면 이후 문장은 실행x하고, 해당 예외의 catch구문 실행

    // throws
    // 해당 메서드가 아닌 처음 호출한 메서드로 돌아가서 예외처리 하는 것
    // 사용자정의 예외 발생 할 때 자주 사용

    public static void main(String args[]){
        try{
            int a = 9;
            int b = 0;
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("0 으로 나누기 불가");
        }catch(NumberFormatException e){
            System.out.println("숫자 포맷이 이상함");
        }catch(Exception e){
            System.out.println("그 외의 에러 발생!");   
        }finally{
            System.out.println("에러 유무와 상관없이 무조건 실행되는 부분");
        }
    }
}