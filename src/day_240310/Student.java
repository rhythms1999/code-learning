package day_240310;

public class Student {
    //state
    String name;
    private static Student instance;

    private Student() {

        System.out.println("-------------");
    }
    //behavior

    public static Student getInstance(){
        if(instance==null){
            instance=new Student();
        }
        return instance;
    }
}
