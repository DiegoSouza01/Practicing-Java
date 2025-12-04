package ReservationControl;

public class Main {
    public static void main(String[] args) {
        Reservation r = new Reservation();

        r.reservar();
        r.reservar("10/04");
        r.reservar("12/04", 4);

        System.out.println();

        Reservation vip = new VipReservation();

        vip.reservar();
    }
}
