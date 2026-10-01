public class ObjPaciente {

    private int Id;
    private String Nombre;
    private String TipoTramite;
    private int Edad;
    private String CondicionAtencion;
    private String Turno;
    private String Servicio;
    private String Estado;
    private String Prioritario;


    public ObjPaciente() {
    }


    public ObjPaciente(int id, String nombre, String tipoTramite, int edad, String condicionAtencion, String turno,
            String servicio, String estado, String prioritario) {
                
        Id = id;
        Nombre = nombre;
        TipoTramite = tipoTramite;
        Edad = edad;
        CondicionAtencion = condicionAtencion;
        Turno = turno;
        Servicio = servicio;
        Estado = estado;
        Prioritario = prioritario;
    }


    public int getId() {
        return Id;
    }


    public void setId(int id) {
        Id = id;
    }


    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getTipoTramite() {
        return TipoTramite;
    }


    public void setTipoTramite(String tipoTramite) {
        TipoTramite = tipoTramite;
    }


    public int getEdad() {
        return Edad;
    }


    public void setEdad(int edad) {
        Edad = edad;
    }


    public String getCondicionAtencion() {
        return CondicionAtencion;
    }


    public void setCondicionAtencion(String condicionAtencion) {
        CondicionAtencion = condicionAtencion;
    }


    public String getTurno() {
        return Turno;
    }


    public void setTurno(String turno) {
        Turno = turno;
    }


    public String getServicio() {
        return Servicio;
    }


    public void setServicio(String servicio) {
        Servicio = servicio;
    }


    public String getEstado() {
        return Estado;
    }


    public void setEstado(String estado) {
        Estado = estado;
    }


    public String getPrioritario() {
        return Prioritario;
    }


    public void setPrioritario(String prioritario) {
        Prioritario = prioritario;
    }


    
    
}
