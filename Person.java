import java.util.Scanner;

public class Person {
    protected String name;
    protected String id;

    Person(String name, String id){
     this.name = name;
     this.id = id;
    }


    @Override
    public String toString() {
        return "Person name: "+name+"\n"+"Person ID: "+id;
    }
}
class Student extends Person implements Association{

    private  int rollNo, semester;

    Student(String name, String id) {
        super(name, id);

    }

    @Override
    public String toString() {
        return super.toString() + "\nRollNo: " + rollNo + "\nSemester: " + semester;
    }

    @Override
    public void associate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter roll number:");
        this.rollNo = input.nextInt();
        System.out.println("Enter semester:");
        this.semester = input.nextInt();
    }

}
class Teacher extends Person implements Association{

    private String designation, department;

    Teacher(String name, String id) {
        super(name, id);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void associate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter designation:");
        this.designation = input.next();
        System.out.println("Enter department:");
        this.department = input.next();

    }
}

