package 싱글톤;

public class Company {

    private static Company instance;

    private Company(){}

    public static Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

}
