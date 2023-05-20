/**
 * Represents a student with an ID, name, and marks.
 */
public class Student {
    private int id;
    private String name;
    private double[] marks;
    
    /**
     * Initializes a new instance of the Student class.
     */
    public Student() {
        this.id = 0;
        this.name = "";
        this.marks = new double[0];
    }
    
    /**
     * Initializes a new instance of the Student class with the specified ID.
     * @param id The ID of the student.
     */
    public Student(int id) {
        this.id = id;
        this.name = "";
        this.marks = new double[0];
    }
    
    /**
     * Gets the ID of the student.
     * @return The ID of the student.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Sets the ID of the student.
     * @param id The ID of the student.
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Gets the name of the student.
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of the student.
     * @param name The name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the marks of the student.
     * @return The marks of the student.
     */
    public double[] getMarks() {
        return marks;
    }
    
    /**
     * Sets the marks of the student.
     * @param marks The marks of the student.
     */
    public void setMarks(double[] marks) {
        this.marks = marks;
    }
    
    /**
     * Calculates and returns the average of the student's marks.
     * @return The average of the student's marks.
     */
    public double getAvg() {
        double sum = 0.0;
        for (double mark : marks) {
            sum += mark;
        }
        return marks.length > 0 ? sum / marks.length : 0;
    }
    
    /**
     * Determines whether the student is healthy based on their height and weight.
     * @param info The health information of the student.
     * @return true if the student is healthy, false otherwise.
     */
    public boolean isHealthy(HealthInfo info) {
        double bmi = info.getBMI();
        return bmi >= 18.5 && bmi <= 24.9;
    }
}
