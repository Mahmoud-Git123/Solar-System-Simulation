public class Sun{

    //Variables that define sun parameters and measurements
    private SolarSystem solar; //implementing the solarsystem as a variable to use in the sun class
    private double sunDiameter;
    private double sunDistance;
    private double sunAngle;
    private String sunColor;

    //Constructor
    public Sun(SolarSystem solar, double sunDiameter, double sunDistance, double sunAngle, String sunColor){
        this.solar = solar;
        this.sunDistance = sunDistance;
        this.sunDiameter = sunDiameter;
        this.sunAngle = sunAngle;
        this.sunColor = sunColor;
    }


    //Method to draw the sun with appropiate diameter, angle, distance and color
    public void drawSun(){
        solar.drawSolarObject(sunDistance, sunAngle, sunDiameter, sunColor);
    }

    
}