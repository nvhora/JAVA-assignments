import java.util.Scanner;
public class ConstructorClass {
    private String name;
    private int age;
    private int studentId;
 
     public ConstructorClass(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
 
     	public String getName() {
        return name;
    }
 
     	public int getAge() {
        return age;
    }
 
     	public int getStudentId() {
        return studentId;
    }
 
    public static void main(String[] args) {
        
    	ConstructorClass student1 = new ConstructorClass("Nimish Vhora", 27, 12345);
    	ConstructorClass student2 = new ConstructorClass("Nimu Vhora", 72, 67890);
 
      
    	System.out.println("Student 1 - Name: " + student1.getName() + ", Age: " + student1.getAge() + ", Student ID: " + student1.getStudentId()); 
    	System.out.println("Student 2 - Name: " + student2.getName() + ", Age: " + student2.getAge() + ", Student ID: " + student2.getStudentId());
 
    }
}

