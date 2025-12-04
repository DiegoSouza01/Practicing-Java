package DeviceControl;

public class Main {
    public static void main(String[] args) {
        Light luz = new Light();
        AirConditioner ar = new AirConditioner();

        luz.ligar();

        luz.ligar();

        luz.desligar();

        System.out.println();

        ar.desligar();
    }
}
