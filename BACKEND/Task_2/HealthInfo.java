/**
 * The HealthInfo class represents a person's health information, including height and weight.
 */
public class HealthInfo {
    private double height; // Height in centimeters
    private double weight; // Weight in kilograms
    
    /**
     * Constructs a new HealthInfo object with default values of height and weight.
     */
    public HealthInfo() {
        this.height = 0;
        this.weight = 0;
    }
    
    /**
     * Constructs a new HealthInfo object with specified values of height and weight.
     * 
     * @param height The height in centimeters.
     * @param weight The weight in kilograms.
     */
    public HealthInfo(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    
    /**
     * Gets the height in centimeters.
     * 
     * @return The height in centimeters.
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Sets the height in centimeters.
     * 
     * @param height The height in centimeters.
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Gets the weight in kilograms.
     * 
     * @return The weight in kilograms.
     */
    public double getWeight() {
        return weight;
    }
    
    /**
     * Sets the weight in kilograms.
     * 
     * @param weight The weight in kilograms.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    /**
     * Calculates and returns the body mass index (BMI) based on the height and weight.
     * 
     * @return The BMI calculated from the height and weight.
     */
    public double getBMI() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
}
