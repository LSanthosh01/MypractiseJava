package practice1;

class Student implements Cloneable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // FIX: Changed visibility from 'protected' to 'public'
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}

public class ObjectCloningExamplle {
    public static void main(String[] args) { // Fixed array declaration style
        try {
            Student student1 = new Student("John");
            Student student2 = (Student) student1.clone();
            
            System.out.println("Original object: " + student1);
            System.out.println("Cloned object: " + student2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}