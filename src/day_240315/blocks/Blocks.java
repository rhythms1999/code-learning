package day_240315.blocks;

public class Blocks {
    // state
    String name = "初始值";
    int age = 8;

    static int id;

    // Static Initialization Blocks
    static {
        id = 123;
    }

    // Initializing Instance Members
    {
        name = "123";
        age = 17;
        System.out.println("...");
    }
}