package day_240312;

public class Table {
    //state
    private static final Table deskinstance = new Table();

    //constructor
    private Table(){
        System.out.println("构造器调用");
    }

    //behavior
    public static Table getDeskinstance(){
        return deskinstance;
    }

}
