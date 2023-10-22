public class Planet{
    
    //Variables that define planet parameters and measurements
    SolarSystem solar; //implementing the solarsystem as a variable.
    private double planetDistance;
    private double planetDiameter;
    private double planetAngle;
    private double centreAngle;
    private double centreRotation;
    private String planetColor;

    //Constructor
    public Planet(SolarSystem solar, double planetDiameter, double planetDistance, double planetAngle, double centreAngle, double centreRotation, String planetColor){
        this.solar = solar;
        this.planetDistance = planetDistance;
        this.planetDiameter = planetDiameter;
        this.planetAngle = planetAngle;
        this.planetColor = planetColor;
        this.centreAngle = centreAngle;
        this.centreRotation = centreRotation;
    }

    //Method to draw the planet with appropiate diameter, angle, distance and color
    public void drawPlanet(){
        solar.drawSolarObjectAbout(planetDistance, planetAngle, planetDiameter, planetColor, centreRotation, centreAngle);
    }


}