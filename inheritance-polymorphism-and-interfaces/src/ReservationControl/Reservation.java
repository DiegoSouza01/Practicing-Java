package ReservationControl;

public class Reservation {
    public void reservar() {
        System.out.println("Reserva realizada");
    }

    public void reservar(String data) {
        System.out.println("Reserva feita para o dia " + data);
    }

    public void reservar(String data, int quantidadePessoas) {
        System.out.println("Reserva feita para o dia " + data + " para " + quantidadePessoas + " pessoas");
    }
}
