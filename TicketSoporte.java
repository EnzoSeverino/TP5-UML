import java.time.LocalDate;

public class TicketSoporte {

    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnico;

    public TicketSoporte(int id, String descripcion) {
        this(id, descripcion, null);
    }

    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void cerrarTicket() {
        estado = "Cerrado";
    }

    public void asignarTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String mostrarDetalle() {
        return "TICKET #" + id + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Estado: " + estado + "\n" +
                "Fecha de Creacion: " + fechaCreacion + "\n" +
                "Usuario: " + (usuario != null ? usuario.toString() : "No asignado") + "\n" +
                "Técnico: " + (tecnico != null ? tecnico : "No asignado") + "\n";
    }
}
