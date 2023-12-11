package ObjectsAndAClasses.OrderByAge_06;

public class Person {
    private String name;
    private String identification;
    private int age;

    public Person(String name, String identification, int age){
        this.name = name;
        this.identification = identification;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getIdentification(){
        return this.identification;
    }
}
