package Model;

public class User {
    private String userName;
    private int age;
    private int length;
    private int weight;

    public User (String userName, int age, int length, int weight) {
        this.userName = userName;
        this.age =  age;
        this.length = length;
        this.weight = weight;
    }

    public int getAge() {return age;}

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }
}
