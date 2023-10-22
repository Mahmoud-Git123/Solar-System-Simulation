public class Driver{
    public static void main(String args[]){

        //Creating solar system object
        SolarSystem solar = new SolarSystem(800, 800);

        //Creating sun object
        Sun sunObj = new Sun(solar, 200, 0, 0, "yellow");

        //Creating earth object
        Planet earthObj = new Planet(solar, 50, 50, 0, 0, 150, "blue");

        //Drawing the sun
        sunObj.drawSun();

        //Drawing earth
        earthObj.drawPlanet();

    }
}