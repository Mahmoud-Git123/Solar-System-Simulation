/**
 * This class extends the circle class to draw planets
 * @author Mahmoud Abdelfattah
 */

public class Planet extends Circle{

    private double planetAngle;

    /**
     * Constructor
     * @param solar (from super class) instance of the solar system 
	 * @param circleDistance (from super class) distance of the planet from the object revolved/moved around
     * @param circleDiameter (from super class) the diameter of the planet
     * @param circleAngle (from super class) the angle of the planet in respect to the object revolved/moved around
     * @param circleCentreAngle (from super class) the centre angle for the the planet
     * @param circleCentreRotation (from super class) the centre point of rotation for the planet
     * @param circleColor (from super class) the color of the planet
     */
    //constructor
    
    public Planet(SolarSystem solar, double circleDiameter, double circleDistance, double planetAngle, double circleCentreAngle, double circleCentreRotation, String circleColor){
        super(solar, circleDistance, circleDiameter, planetAngle, circleCentreAngle, circleCentreRotation, circleColor);
        this.planetAngle = planetAngle;
        
    }


}