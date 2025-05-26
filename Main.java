public class Main {

    public static void main(String[] args) {

        SistemaSoporte sistema = new SistemaSoporte();

        Usuario usuario1 = new Usuario(1, "Eden Hazard", "eden@gmail.com");
        Usuario usuario2 = new Usuario(2, "Antoine Griezman", "antoine@gmail.com");

        Tecnico tecnico1 = new Tecnico(1, "Mario Rui", "Redes");
        Tecnico tecnico2 = new Tecnico(2, "Luca Romero", "Software");

        TicketSoporte t1 = sistema.crearTicket("No puedo conectarme al WiFi", usuario1);
        TicketSoporte t2 = sistema.crearTicket("Error en la aplicación", usuario2);

        sistema.asignarTecnico(t1.getId(), tecnico1);
        sistema.asignarTecnico(t2.getId(), tecnico2);

        t1.cerrarTicket();

        System.out.println("=== TODOS LOS TICKETS ===");
        sistema.listarTickets();

        System.out.println("=== TICKETS ABIERTOS ===");
        sistema.listarTicketsPorEstado("Abierto");
    }
}
