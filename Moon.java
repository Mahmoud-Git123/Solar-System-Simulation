/**
 * This class extends the circle class to draw moons
 * @author Mahmoud Abdelfattah
 */


public class Moon extends Circle{
    
    /**
     * Constructor
     * @param solar (from super class) instance of the solar system 
	 * @param circleDistance (from super class) distance of the moon from the object revolved/moved around
     * @param circleDiameter (from super class) the diameter of the moon
     * @param circleAngle (from super class) the angle of the moon in respect to the object revolved/moved around
     * @param circleCentreAngle (from super class) the centre angle for the the moon
     * @param circleCentreRotation (from super class) the centre point of rotation for the moon
     * @param circleColor (from super class) the color of the moon
     */
    //constructor
    public Moon(SolarSystem solar, double circleDiameter, double circleAngle, double circleCentreRotation,  double circleCentreAngle, double circleDistance, String circleColor){
        super(solar, circleDistance, circleDiameter, circleAngle, circleCentreAngle, circleCentreRotation, circleColor);
    }



}