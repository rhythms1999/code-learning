package day_240312;

public class Table {
    //state
    private static Table deskinstance;

    //constructor
    private Table() {
        System.out.println("构造器调用");
    }

    //behavior
    public static Table getDeskinstance() {
//        if (deskinstance == null) {
        deskinstance = new Table();
//        }
        return deskinstance;
    }

}
