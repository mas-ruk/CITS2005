public class Dog {
    private String name;
    private String colour;
    
    public Dog(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public static void main(String[] args) {
        // init object
        Dog dog = new Dog("Rex", "Black");
        System.out.println(dog.name + " " + dog.colour);
    }
}