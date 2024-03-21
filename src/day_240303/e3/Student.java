package day_240303.e3;

public class Student {
    // state
    public int number;
    public int state;
    public int score;

    @Override
    public String toString(){
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}