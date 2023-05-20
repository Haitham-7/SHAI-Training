/**
 * The School class represents a school with a name, email, and location.
 */
public class School {

    private String name;
    private String email;
    private String location;

    /**
     * Constructs a School object with default values for instance variables.
     */
    public School() {
        this.name = "";
        this.email = "";
        this.location = "";
    }

    /**
     * Constructs a School object with the specified name and default values for email and location.
     * @param name the name of the school
     */
    public School(String name) {
        this.name = name;
        this.email = "";
        this.location = "";
    }

    /**
     * Constructs a School object with the specified values for name, email, and location.
     * @param name the name of the school
     * @param email the email address of the school
     * @param location the location of the school
     */
    public School(String name, String email, String location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }

    /**
     * Returns the name of the school.
     * @return the name of the school
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the school.
     * @param name the name of the school
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the email address of the school.
     * @return the email address of the school
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the school.
     * @param email the email address of the school
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the location of the school.
     * @return the location of the school
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the school.
     * @param location the location of the school
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Returns a string representation of the School object.
     * @return a string representation of the School object
     */
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
