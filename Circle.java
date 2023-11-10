public abstract class Circle {

    //Variables
    private double circleDistance;
    private double circleDiameter;
    private double circleAngle;
    private double circleCentreAngle;
    private double circleCentreRotation;
    private String circleColor;
    private SolarSystem solar;

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

    //draw circle method
    public void drawCircle(){
        solar.drawSolarObjectAbout(circleDistance, circleAngle, circleDiameter, circleColor,circleCentreRotation, circleCentreAngle);
    }

    //first way to move (revolving around a primary object)
    public void moveCircle1(double circleMoveSpeed){
        circleAngle = circleAngle + circleMoveSpeed;
    }

    //second way to move (revolving around a secondary object)
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
