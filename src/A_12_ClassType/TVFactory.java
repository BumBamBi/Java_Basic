package A_12_ClassType;

public class TVFactory {
    public TV getTV(String tvName){
        if(tvName.equals("S")){
            return new S_TV();
        }else if (tvName.equals("L")){
            return new L_TV();
        }else{
            return null;
        }
    }
}
