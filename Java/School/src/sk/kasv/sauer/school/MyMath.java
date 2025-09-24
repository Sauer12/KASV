package sk.kasv.sauer.school;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;


public class MyMath {
    public void calcVolCubo(){
        int a = 17;
        int b = 15;
        int c = 6;
        int volume = a*b*c;
        System.out.println("Volume is " + volume);
    }

    public void calcPerimeterTriangle(int a, int b, int c){
        System.out.println("O = " + (a+b+c));
    }

    public double getAverage(double x, double y, double z){
        double avg = (x+y+z)/3;
        return avg;
    }

    public long getCurrenTime(){
        Date date=new Date();
        return date.getTime();
    }

    public double getDiagonalRectangle(double a, double b){
        double diagonal = Math.sqrt( a*a+ Math.pow(b,2) );
        return diagonal;
    }

    public String getInitname(String firstname, String lastName){
        return firstname.charAt(0)+". "+lastName;
    }

    // Objem gule (1)
    public double getVolumeSphere(double radius){
        return 4.0/3.0 * Math.PI * radius * radius;
    }

    // Priemer 5 desatinnych cisel (2)
    public double getAverageFiveNumbers(double a, double b, double c, double d, double e){
        return (a+b+c+d+e) / 5.0;
    }

    // Geometricky priemer (3)
    public double getGeometricAverage(double a, double b){
        return Math.sqrt((a * b));
    }

    // Obsah trojuholnika (4)
    public double getTriangleArea(int a, int b, int c){
        double halfPerimeter = (a+b+c)/2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter-a) * (halfPerimeter-b) * (halfPerimeter-c));
    }

    // Obsah kruhu (5)
    public double getCircleArea(double radius){
        return Math.PI * radius * radius;
    }

    // Náklady na cestu (6)
    public double getRoadCost(double distance, double priceOfFuel, double carFuelConsumption){
        return distance / 100 * carFuelConsumption * priceOfFuel;
    }

    // Konverzia mil na kilometre
    public double convertMToKm(double dist){
        return dist * 1.609344;
    }

    // Konverzia kilometrov na mile
    public double convertKmToM(double dist){
        return dist / 1.609344;
    }

    // Konverzia kelvinov na celzius
    public double convertKelvinToCelsius(double temperature){
        return temperature - 273.15;
    }

    // Konverzia celsius na kelvin
    public double convertCelsiusToKelvin(double temperature){
        return temperature + 273.15;
    }

    // Zisti rok narodenia
    public int getAge(int year){
        int currYear = LocalDate.now().getYear();
        return currYear - year;
    }

    public int getRandomNumber(int i){
        Random rnd = new Random();
        int value = rnd.nextInt(28) + 1;
        return value;
    }
}
