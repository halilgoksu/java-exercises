package OopPillars;


public class Dog extends Animal {

    private String typeOfDog;

    public Dog()
    {
        super();
        this.typeOfDog = "Golden";
    }

    public Dog(String name, int age, String typeOfDog)
    {
        super(name, age);
        this.typeOfDog = typeOfDog;
    }

    public String typeOfDog() {
        return typeOfDog;
    }

    public void setTypeOfDog(String typeOfDog) {
        this.typeOfDog = typeOfDog;
    }

    public void setTypeOfDog(String typeOfDog) {
        this.typeOfDog = (String)typeOfDog;
    }

    @Override
    public String toString() {
        return super.toString() +
                " typeOfDog: " + typeOfDog;
    }
}