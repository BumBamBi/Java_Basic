package A_16_java_lang;

public class mainClass {
    // java.lang 패키지
    // 가장 기본이되는 필수 클래스와 인터페이스가 포함된 패키지
    // import없이 사용할 수 있도록 하였음

    

    public static void main(String args[]){
        // equals()
        // == 연산자는 기본형일때 변수의 값을 비교, 참조형일때 주소의 값을 비교
        // 객체의 내용을 비교하기 위함.
        // 뭔가 클래스 내부에 메서드로 따로 만들어야하는듯??

        int a = 1;
        int b = 1;
        System.out.println(a==b);   // true

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1==e2); // false
        System.out.println(e1.equals(e2));  // true여야하는데 왜 false;;
    
        
        // toString()
        // 얘도 뭔가 따로 메서드로 만들어야할듯? 원하는 결과가 안나오네
        // 당연하게 e1의 주소값이 string으로 나와버림ㅋㅋㅋ
        System.out.println(e1.toString());
        
        // Wrapper
        // Boolean이나 Integet등 다양한 기본데이터 타입으로 변환하는 메서드들
        System.out.println(Integer.parseInt("10"));


        // String
        // 한번생성되면 변경x(고정 문자열)
        // 동일한 문자열이면 하나의 주소값을 가리킴.
        // + 연산으로 concat가능(하나만 string이라면, 둘 다 string이 아니더라도 string으로 변환시키고 연결)
        String s = "test";
        System.out.println(s + 10);
        System.out.println(s + false);

        /*
        다양한 String 메서드
        concat(s)       - 연결
        toLowerCase()   - 소문자로
        toUpperCase()   - 대문자로
        length()        - 길이
        startsWith(s)   - 시작이 s인지 확인
        endsWith(s)     - 끝이 s인지 확인
        equals(s)       - s와 동일한지 확인
        equalsIgnoreCase(s) - 대소문자 무시후 동일한지 확인
        chaAt(n)        - n번의 인덱스 문자 확인
        indexOf(s)      - s문자열의 인덱스 위치 확인
        lastIndexOf(s)  - s의 문자열의 인덱스 위치 확인(뒤에서 부터)
        substring(n1, n2) - n1 ~ n2-1 까지만 잘라서 저장
        substring(n)    - n번부터 마지막까지만 잘라서 저장
        replace(c1, c2) - c1을 c2로 치환
        */

        // StringBuffer
        // 변화하는 문자열
        // 기본적으로 16개의 문자를 저장 가능한 사이즈
        // + 연산 불가(append 사용)
        // 더 빠르고 메모리를 아낄 수 있지만 상황에 맞춰서 String이랑 번갈아서 쓰자
        StringBuffer sb = new StringBuffer("abcd");
        System.out.println("용량 : " + sb.capacity());  // 용량 확인
        System.out.println("길이 : " + sb.length());    // 길이 확인
        
        // 이어붙이기
        sb.append("가나다");
        
        System.out.println("용량 : " + sb.capacity());  // 용량 확인
        System.out.println("길이 : " + sb.length());    // 길이 확인
    }
}
