package Project;

public class PacienteParticular extends Paciente{
    private double costoConsulta;
    private String dni;

    public PacienteParticular(Consulta consulta, String fechaDeNacimiento, String nombre, String apellido,
                              boolean esPrimeraConsulta, double costoConsulta, String dni) {
        super(consulta, fechaDeNacimiento, nombre, apellido, esPrimeraConsulta);
        this.costoConsulta = costoConsulta;
        this.dni = dni;
    }
}
