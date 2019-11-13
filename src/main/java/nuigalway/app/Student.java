package nuigalway.app;

/**
 * Author: Aaron McCormack
 * ID: 16492186
 */

public class Student {

    //instance variables
    private String name;
    private int age;
    private String dob;
    private int idNumber;

    public Student(String name, int age, String dob, int idNumber){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.idNumber = idNumber;
    }

    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getUsername(){
        return getName() +" "+ getAge();
    }
}
