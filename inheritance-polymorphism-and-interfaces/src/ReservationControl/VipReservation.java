package ReservationControl;

public class VipReservation extends Reservation {

    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
