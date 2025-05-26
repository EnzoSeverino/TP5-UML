import java.util.ArrayList;

public class SistemaSoporte {

    private ArrayList<TicketSoporte> tickets;
    private static int contadorTickets = 0;

    public SistemaSoporte() {
        tickets = new ArrayList<>();
    }

    public TicketSoporte crearTicket(String descripcion, Usuario usuario) {
        contadorTickets++;
        TicketSoporte ticket = new TicketSoporte(contadorTickets, descripcion, usuario);
        tickets.add(ticket);
        return ticket;
    }

    public void asignarTecnico(int idTicket, Tecnico tecnico) {
        for (TicketSoporte t : tickets) {
            if (t.getId() == idTicket) {
                t.asignarTecnico(tecnico.getNombre());
            }
        }
    }

    public void listarTickets() {
        for (TicketSoporte t : tickets) {
            System.out.println(t.mostrarDetalle());
        }
    }

    public void listarTicketsPorEstado(String estado) {
        for (TicketSoporte t : tickets) {
            if (t.getEstado().equalsIgnoreCase(estado)) {
                System.out.println(t.mostrarDetalle());
            }
        }
    }

}
