package OopPillars;

public class Animal {
    private String name;
    private int age;
    private int legs;

    public Animal()
    {
        this.name = null;
        this.age = 0;
        this.legs = 0;
    }

    public Animal(String name, int age, int legs)
    {
        this.name = name;
        this.age  = age;
        this.legs = legs;
    }

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //overload method to take a double parameter
    public void setAge(double age)
    {
        this.age = (int)age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }


    @Override
    public String toString() {
        return "name: " + name+
                ", age: " + age +
                ", numberLegs: " + legs;
    }
}