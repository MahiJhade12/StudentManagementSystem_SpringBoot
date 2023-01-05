package schoolManagement.sms;

public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher(){

    }
    public Teacher(String name, int numberOfStudents, int age){
        this.name=name;
        this.numberOfStudents=numberOfStudents;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}