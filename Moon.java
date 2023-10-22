public class Moon{

    //Variables that define moon parameters and measurements
    SolarSystem solar; //implementing the solarsystem as a variable.
    private double moonDistance;
    private double moonDiameter;
    private double moonAngle;
    private double centreAngle;
    private double centreRotation;
    private String moonColor;

    private double moonSpeed;

    //Constructor
    public Moon(SolarSystem solar, double moonDiameter, double moonAngle, double centreRotation,double centreAngle, double moonDistance, String moonColor){
        this.solar = solar;
        this.moonDistance = moonDistance;
        this.moonDiameter = moonDiameter;
        this.moonAngle = moonAngle;
        this.moonColor = moonColor;
        this.centreAngle = centreAngle;
        this.centreRotation = centreRotation;
    }

    //Method to draw the moon with appropiate diameter, angle, distance and color
    public void drawMoon(){
        solar.drawSolarObjectAbout(moonDistance, moonAngle, moonDiameter, moonColor, centreRotation, centreAngle);
    }

    //Animating moon movement
    public void moveMoon(double moonSpeed){
        moonAngle = moonAngle + moonSpeed;
        centreAngle++;
    }

    //finished drawing method
    public void finishedDrawing(){
        solar.finishedDrawing();
    }



}