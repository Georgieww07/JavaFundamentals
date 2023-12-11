package ObjectsAndAClasses;

public class Student {
    private String firsName;
    private String lastName;
    private int age;
    private String hometown;

    public Student(String firstName, String lastName, int age, String hometown){
        this.firsName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirsName(){
        return this.firsName;
    }
    public void setFirsName(String firstName){
        this.firsName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getHometown(){
        return this.hometown;
    }
    public void setHometown(String hometown){
        this.hometown = hometown;
    }


    public String getDetails(){
        return String.format("%s %s is %d years old", this.firsName, this.lastName, this.age);
    }

}
