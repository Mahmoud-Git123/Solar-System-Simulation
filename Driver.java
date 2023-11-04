public class Driver{
    public static void main(String args[]){

        //SOLAR SYSTEM
        SolarSystem solar = new SolarSystem(1500, 1500);

        //SUN
        Sun sunObj = new Sun(solar, 150, 0, 0, "yellow");

        //EARTH
        Planet earthObj = new Planet(solar, 45, 210, 80, 0, 0, "blue");
        Moon earthMoonObj = new Moon(solar, 10, earthObj.getCircleAngle() + 50, earthObj.getCircleDistance(), earthObj.getCircleAngle(), 40 , "grey");

        //MARS
        Planet marsObj = new Planet(solar, 40, 280, 35, 0, 0, "red");
        Moon marsMoonObj1 = new Moon(solar, 10, marsObj.getCircleAngle() + 50, marsObj.getCircleDistance(), marsObj.getCircleAngle(), 30 , "grey");
        Moon marsMoonObj2 = new Moon(solar, 5, marsObj.getCircleAngle() + 10, marsObj.getCircleDistance(), marsObj.getCircleAngle(), 37 , "grey");

        //VENUS
        Planet venusObj = new Planet(solar, 30, 140, 25, 0, 0, "orange");
        
        //MERCURY
        Planet mercuryObj = new Planet(solar, 20, 100, 200, 0, 0, "white");

        //JUPITER
        Planet jupiterObj = new Planet(solar, 100, 365, 120, 0, 0, "red");
        Moon jupiterMoonObj1 = new Moon(solar, 8, jupiterObj.getCircleAngle() + 0, jupiterObj.getCircleDistance(), jupiterObj.getCircleAngle(), 65 , "grey");
        Moon jupiterMoonObj2 = new Moon(solar, 12, jupiterObj.getCircleAngle() + 120, jupiterObj.getCircleDistance(), jupiterObj.getCircleAngle(), 70 , "grey");
        Moon jupiterMoonObj3 = new Moon(solar, 10, jupiterObj.getCircleAngle() + 210, jupiterObj.getCircleDistance(), jupiterObj.getCircleAngle(),75 , "grey");
        Moon jupiterMoonObj4 = new Moon(solar, 5, jupiterObj.getCircleAngle() + 180, jupiterObj.getCircleDistance(), jupiterObj.getCircleAngle(), 80 , "grey");

        //SATURN (WITH RINGS)
        Planet saturnObj = new Planet(solar, 65, 430, 220, 0, 0, "yellow");
        Planet saturnRingShade = new Planet(solar, 100, 430, 220, 0, 0, "black");
        Planet saturnRingObj = new Planet(solar, 130, 430, 220, 0, 0, "grey");

        //URANUS
        Planet uranusObj = new Planet(solar, 55, 500, 160, 0, 0, "grey");


        //NEPTUNE
        Planet neptuneObj = new Planet(solar, 45, 600, 200, 0, 0, "blue");


        Asteroid ast = new Asteroid(solar, 0, 0, 0, 0, 0, "white");



        while(true){
            
            ast.drawBelt();
            //Drawing the sun
            sunObj.drawSun();

            //Drawing earth
            earthObj.drawCircle();
            earthObj.moveCircle1(1);

            //Drawing earth's moon
            earthMoonObj.drawCircle();
            earthMoonObj.moveCircle2(6);

            //Drawing mercury
            mercuryObj.drawCircle();
            mercuryObj.moveCircle1(3);

            //Drawing mars
            marsObj.drawCircle();
            marsObj.moveCircle1(1);

            //Drawing mars' moon
            marsMoonObj1.drawCircle();
            marsMoonObj1.moveCircle2(3);
            marsMoonObj2.drawCircle();
            marsMoonObj2.moveCircle2(3.5);

            //Drawing venus (no moons)
            venusObj.drawCircle();
            venusObj.moveCircle1(1.5);

            //Drawing Jupiter
            jupiterObj.drawCircle();
            jupiterObj.moveCircle1(1);

            jupiterMoonObj1.drawCircle();
            jupiterMoonObj2.drawCircle();
            jupiterMoonObj3.drawCircle();
            jupiterMoonObj4.drawCircle();
            jupiterMoonObj1.moveCircle2(3);
            jupiterMoonObj2.moveCircle2(3);
            jupiterMoonObj3.moveCircle2(3);
            jupiterMoonObj4.moveCircle2(3);


            //Saturn
            saturnRingObj.drawCircle();
            saturnRingObj.moveCircle1(1);

            saturnRingShade.drawCircle();
            saturnRingShade.moveCircle1(1);

            saturnObj.drawCircle();
            saturnObj.moveCircle1(1);

            //Uranus
            uranusObj.drawCircle();
            uranusObj.moveCircle1(1);

            //Neptune
            neptuneObj.drawCircle();
            neptuneObj.moveCircle1(1);

 

            solar.finishedDrawing();
    

        }
    }
}