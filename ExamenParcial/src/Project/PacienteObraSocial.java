package Project;

public class PacienteObraSocial extends Paciente{
    private String nombreObraSocial;
    private int numeroDeAsociado;

    public PacienteObraSocial(Consulta consulta, String fechaDeNacimiento, String nombre, String apellido,
                              boolean esPrimeraConsulta, String nombreObraSocial, int numeroDeAsociado) {
        super(consulta, fechaDeNacimiento, nombre, apellido, esPrimeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroDeAsociado = numeroDeAsociado;
    }
    public boolean esMayorAOtro(PacienteObraSocial segundoPaciente) {
        return this.numeroDeAsociado > segundoPaciente.numeroDeAsociado;
    }
}
