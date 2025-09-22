package sk.kasv.sauer.school;

public class TrafficLight3 extends TrafficLight2 {
    private boolean orange;

    public TrafficLight3() {
        orange = false;
    }

    public void info(){              // najlepšie riešenie je dať setter, getter pre atribúty v predkovi a nie protected
        System.out.println("Lights: ");
        System.out.println("   red : " + red);
        System.out.println("   orange : " + orange);
        System.out.println("   red : " + green);
    }
}
