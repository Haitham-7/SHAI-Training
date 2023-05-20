/**
*
*    This class is the main class that uses the other classes to create and display
*    information about a person, their health info, a school, and a student.
*    @author Haitham Al Daajah
*    @version 1.0
*/


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HealthInfo healthInfo = new HealthInfo();
        healthInfo.setHeight(180);
        healthInfo.setWeight (90.0);

        Person person = new Person(1);
        person.setNationalityId(777);
        person.setHealthInfo(healthInfo);

        School school = new School("Example School");
        Student student = new Student(1);
        student.setName("Haitham Al Daajah");
        student.setMarks(new double[]{89.0, 78.5, 97.7});
        school.addStudent(student);

        System.out.println("Person nationality ID: " + person.getNationalityId());
        System.out.println("Person health info: height=" + person.getHealthInfo().getHeight() + ", weight=" + person.getHealthInfo().getWeight ());

        System.out.println("School name: " + school.getName());
        System.out.println("Student name: " + student.getName());
        System.out.println("Student marks: " + Arrays.toString(student.getMarks()));
        System.out.println("Student average: " + student.getAvg());
        System.out.println("Is student healthy? " + student.isHealthy());
    }
}
