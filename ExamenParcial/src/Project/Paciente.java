package Project;

public abstract class Paciente {
    private Consulta consulta;
    private String fechaDeNacimiento;
    private String nombre;
    private String apellido;
    private boolean esPrimeraConsulta;

    public Paciente(Consulta consulta, String fechaDeNacimiento, String nombre, String apellido, boolean esPrimeraConsulta) {
        this.consulta = consulta;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esPrimeraConsulta = esPrimeraConsulta;
    }
    public boolean debeRealizarEvaluacionInicial() {
        return esPrimeraConsulta;
    }
}
