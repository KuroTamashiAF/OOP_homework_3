package ObjectClasses;

/**
 * Human
 */
public class Human {
    private String name;
    //private int power;


    public Human(String name, int power) {
        this.name = name;
        //this.power = power;
    }
    public Human(String name) {
        this.name = name;
        //this.power = 0;
    }
    public String getName() {
        return this.name;
    }
    // public int getPower() {
    //     return this.power;
    // }

}