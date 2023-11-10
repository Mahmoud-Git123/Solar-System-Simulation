/**
 * This abstract class provides a the base template and movement for any circle
 * @author Mahmoud Abdelfattah
 */

public abstract class Circle {

    //Variables
    private double circleDistance;
    private double circleDiameter;
    private double circleAngle;
    private double circleCentreAngle;
    private double circleCentreRotation;
    private String circleColor;
    private SolarSystem solar;

    /**
	 * Constructor
	 * @param solar instance of the solar system
	 * @param circleDistance distance of the circle from the object revolved/moved around
     * @param circleDiameter the diameter of the circle
     * @param circleAngle the angle of the circle in respect to the object revolved/moved around
     * @param circleCentreAngle the centre angle for the the circle
     * @param circleCentreRotation the centre point of rotation for the circle
     * @param circleColor the color of the circle
	 */

    //constructor
    public Circle(SolarSystem solar, double circleDistance, double circleDiameter, double circleAngle, double circleCentreAngle, double circleCentreRotation, String circleColor){
        this.solar = solar;
        this.circleDistance = circleDistance;
        this.circleDiameter = circleDiameter;
        this.circleAngle = circleAngle;
        this.circleCentreAngle = circleCentreAngle;
        this.circleCentreRotation = circleCentreRotation;
        this.circleColor = circleColor;

    }

    /**
	 * drawCircle method
	 * implements the "drawSolarObjectAbout" using the solar instance form the solar system class
	 */

    //draw circle method
    public void drawCircle(){
        solar.drawSolarObjectAbout(circleDistance, circleAngle, circleDiameter, circleColor,circleCentreRotation, circleCentreAngle);
    }


    /**
	 * moveCircle1 method
     * @param circleMoveSpeed allows to change the speed of the circle movement
	 * Changes the circle angle by incrementing it
     * this allows for revolving around a primary object
	 */

    public void moveCircle1(double circleMoveSpeed){
        circleAngle = circleAngle + circleMoveSpeed;
    }

    /**
	 * moveCircle2 method
     * @param circleMoveSpeed allows to change the speed of the circle movement
	 * Changes the circle centre angle by incrementing it
     * this allows for revolving around a primary object
	 */
    public void moveCircle2(double circleMoveSpeed){
        circleAngle = circleAngle + circleMoveSpeed;
        circleCentreAngle++;
    }

    //Setter methods to confirm movement of an object
    public void setCentreAngle(double circleCentreAngle){
        this.circleCentreAngle = circleCentreAngle;
    }

    public void setAngle(double circleAngle){
        this.circleAngle = circleAngle;
    }

    //Getter methods in case access is needed from any classes
    public double getCircleDistance(){
        return circleDistance;
    }
    public double getCircleCiameter(){
        return circleDiameter;
    }
    public double getCircleAngle(){
        return circleAngle;
    }
    public double getCircle(){
        return circleDistance;
    }
    public double getCircleCenterAngle(){
        return circleAngle;
    }
    public SolarSystem getSolar(){
        return solar;
    }

}
