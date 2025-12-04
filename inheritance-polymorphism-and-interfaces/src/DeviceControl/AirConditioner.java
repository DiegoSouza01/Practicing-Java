package DeviceControl;

public class AirConditioner implements Controllable {
    private boolean ligado = false;

    @Override
    public void ligar() {
        if (this.ligado) {
            System.out.println("Ar-condicionado já está ligado.");
        } else {
            this.ligado = true;
            System.out.println("Ar-condicionado ligado.");
        }
    }

    @Override
    public void desligar() {
        if (!this.ligado) {
            System.out.println("Ar-condicionado já está desligado.");
        } else {
            this.ligado = false;
            System.out.println("Ar-condicionado desligado.");
        }
    }
}
