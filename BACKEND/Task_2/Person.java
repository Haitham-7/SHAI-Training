/**
 * The Person class represents a person with their nationality ID and health information.
 */
public class Person {
    private int nationalityId;
    private HealthInfo healthInfo;

    /**
     * Creates a new Person object with default nationality and health information.
     */
    public Person() {
        nationalityId = 0;
        healthInfo = new HealthInfo();
    }

    /**
     * Creates a new Person object with the specified nationality ID and default health information.
     * @param nationalityId The nationality ID of the person.
     */
    public Person(int nationalityId) {
        this.nationalityId = nationalityId;
        healthInfo = new HealthInfo();
    }

    /**
     * Gets the nationality ID of the person.
     * @return The nationality ID of the person.
     */
    public int getNationalityId() {
        return nationalityId;
    }

    /**
     * Sets the nationality ID of the person.
     * @param nationalityId The nationality ID of the person.
     */
    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }

    /**
     * Gets the health information of the person.
     * @return The health information of the person.
     */
    public HealthInfo getHealthInfo() {
        return healthInfo;
    }

    /**
     * Sets the health information of the person.
     * @param healthInfo The health information of the person.
     */
    public void setHealthInfo(HealthInfo healthInfo) {
        this.healthInfo = healthInfo;
    }
}