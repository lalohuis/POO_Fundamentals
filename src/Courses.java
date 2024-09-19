import java.util.ArrayList;

public class Courses {
    String courseName;
    String professorName;
    int year;
    
   
    ArrayList<Student> enrolledStudents = new ArrayList<>();


    public void enroll(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.firstName + " " + student.lastName + " ha sido inscrito en " + courseName);
    }

    public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student); 
        }
    }
    
    public void unEnroll(Student student) {
        if (enrolledStudents.contains(student)) {
            enrolledStudents.remove(student);
            System.out.println(student.firstName + " " + student.lastName + " ha sido desinscrito de " + courseName);
        } else {
            System.out.println(student.firstName + " " + student.lastName + " no está inscrito en " + courseName);
        }
    }

    public int countStudents() {
        return enrolledStudents.size();
    }

    public int bestGrade() {
        int maxGrade = 0;
        for (Student student : enrolledStudents) {
            if (student.grade > maxGrade) {
                maxGrade = student.grade;
            }
        }
        return maxGrade;
    }

    public void listEnrolledStudents() {
        System.out.println("Estudiantes inscritos en " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.firstName + " " + student.lastName);
        }
    }

    public static void main(String[] args) {
        Courses javaCourse = new Courses();
        javaCourse.courseName = "Matemáticas";
        javaCourse.professorName = "Maistro Jirafales";
        javaCourse.year = 2024;

        Student student1 = new Student();
        student1.firstName = "Eduardo";
        student1.lastName = "Huerta";
        student1.registration = 12345;
        student1.grade = 65;
        student1.year = 2;

        Student student2 = new Student();
        student2.firstName = "William";
        student2.lastName = "Levy";
        student2.registration = 54321;
        student2.grade = 85;
        student2.year = 2;

        Student student3 = new Student();
        student3.firstName = "Mario";
        student3.lastName = "Bross";
        student3.registration = 98765;
        student3.grade = 70;
        student3.year = 3;

  
        Student[] newStudents = { student1, student2, student3 };
        javaCourse.enroll(newStudents);
        javaCourse.listEnrolledStudents();
        javaCourse.unEnroll(student1);

        System.out.println("Cantidad de estudiantes inscritos: " + javaCourse.countStudents());
        System.out.println("La mejor calificación es: " + javaCourse.bestGrade());
    }
}

        		
