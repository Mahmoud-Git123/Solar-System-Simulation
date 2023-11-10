/**
 * This class extends the circle class to draw the sun
 * @author Mahmoud Abdelfattah
 */

public class Sun extends Circle{

    /**
     * Constructor
     * @param solar (from super class) instance of the solar system 
	 * @param circleDistance (from super class) 0 as sun doesn't revolve around objects
     * @param circleDiameter (from super class) the diameter of the sun
     * @param circleAngle (from super class) 0 as sun doesn't revolve around objects
     * @param circleCentreAngle (from super class) the centre angle for the the sun
     * @param circleCentreRotation (from super class) 0 as sun doesn't revolve around objects
     * @param circleColor (from super class) the color of the sun (yellow)
     */
    //constructor
    public Sun(SolarSystem solar, double circleDiameter, double circleAngle, double circleCentreRotation,  double circleCentreAngle, double circleDistance, String circleColor){
        super(solar, circleDistance, circleDiameter, circleAngle, circleCentreAngle, circleCentreRotation, circleColor);
    }



}