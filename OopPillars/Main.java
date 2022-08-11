package OopPillars;


 // Inheritance, Polymorphism, and Encapsulation


public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Tito", 4, 2);
        Dog dog1 = new Dog("Kumet", 1, "Pitpul");
        Dog dog2 = new Dog("Alex", 1, "Sivas");

        //set
        dog2.setName("zek");
        dog2.setAge(3);

        //will use the overloaded method  to set age
        dog2.setTypeOfDog("Kangal");

        //Display objects
        System.out.println(animal);
        System.out.println(dog1);
        System.out.println(dog2);

    }
}