package day_240308.access_control.Package1;

public class Order {
    // state
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    // behavior
    private void methodPrivate(){

    }
    void methodDefault(){

    }
    public void methodPublic(){

    }

    public void test(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

        methodPrivate();
        methodDefault();
        methodPublic();
    }
}