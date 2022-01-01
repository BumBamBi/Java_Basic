public class A_02_control {
    public static void main(String[] args) throws Exception {
        int a = 1;

        if(a == 1){
            System.out.println("1");
        }else if(a == 2){
            System.out.println("2");
        }else{
            System.out.println("else");
        }

        switch(a){
            case 1: break;
            case 2: break;
            default : break;
        }
    }
}