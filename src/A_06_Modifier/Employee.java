package A_06_Modifier;
public class Employee {
    String name;
    int age;
    static String companyName;
    final static String preCompanyName = "ZZZ";

    public static void init_companyName(){
        companyName = "init";

        /* static 메서드(클래스 메서드) 내부이므로, static 변수가 아니면 사용 불가 */
        //name = "";
        //age = 0;
    }

    public static void change_preCompanyName(){
        // preCompanyName은 final 변수라 변경이 불가능 하다.
    }
}