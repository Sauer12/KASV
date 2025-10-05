package sk.kasv.sauer.school;

public class Main {
    public static void main(String[] args) {
        /* System.out.println("School app started.");
        pozdrav();
        Student ziak1 = new Student();
        ziak1.setAge(24);
        ziak1.setFirstName("Patrik");
        ziak1.setLastName("Tomeček");
        ziak1.setWeight(80);
        ziak1.setHeight(1.80);
        ziak1.info();
        double bmi = ziak1.calcBMI();
        System.out.println(ziak1.getFirstName() + " your BMI is " + bmi + "\n");

        Mobile mobile = new Mobile("Nokia 3310", "0917 863 823", 100);
        mobile.info();

        Student ziak2 = new Student("Ivana", "Hudakova", 1.64, 68);
        ziak2.setPhone(mobile);
        ziak2.setAge(32);
        ziak2.info();

        Bicycle bicycle = new Bicycle("Merida", 550, 8);
        ziak2.setBicycle(bicycle);
        ziak2.bicycleInfo();

        System.out.println("School app finished."); */

        MyMath myMath = new MyMath();
        myMath.calcVolCubo();

        myMath.calcPerimeterTriangle(1,2,3);

        myMath.getAverage(5, 10, 20);

        //1
        System.out.println("Objem gule: " + myMath.getVolumeSphere(5.5));

        //2
        System.out.println("Priemer piatich čísel: " + myMath.getAverageFiveNumbers(5,5 ,2 ,3, 1));

        //3
        System.out.println("Geometrický priemer: " + myMath.getGeometricAverage(5.5, 10.5));

        // 4
        System.out.println("Obsah trojuholníka: " + myMath.getTriangleArea(5, 10 ,6));

        // 5
        System.out.println("Obsah kruhu: " + myMath.getCircleArea(5));

        // 6
        System.out.println("Náklady na cestu: " + myMath.getRoadCost(250, 7, 1.65));

        System.out.println(myMath.convertKmToM(15));

        // Vypisanie veku podla roku narodenia
        System.out.println(myMath.getAge(1995));

        // Nahodne cislo
        System.out.println(myMath.getRandomNumber(28));

        // Konverzia celzia na fahrenheit
        System.out.println("Stupne v fahrenheitoch: " + myMath.convertCelsiusToFahrenheit( + 25));

        // Konverzia fahrenheitov na celzius stupne
        System.out.println("Stupne v celzioch: " + myMath.convertFahrenheitToCelsius( + 77));

        // Bmi
        System.out.println("BMI: " + myMath.calcBMI(80, 1.80));

        // Bitcoin to euro konverzia
        System.out.println("Bitcoin to Euro: " + myMath.btcToEuro());

        // Mesacna splatka
        System.out.println("Mesačná splátka: " + myMath.calcMonthlyPayment(10000, 0.05) + "€");
    }

    public static void pozdrav(){
        System.out.println("Hello, how are you?");
    }
}