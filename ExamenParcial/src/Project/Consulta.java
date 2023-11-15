package Project;

public class Consulta {
    private String fechaDeConsulta;
    private String especialidad;
    private int hora;
    private int minuto;

    public Consulta(String fechaDeConsulta, String especialidad, int hora, int minuto) {
        this.fechaDeConsulta = fechaDeConsulta;
        this.especialidad = especialidad;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
}
