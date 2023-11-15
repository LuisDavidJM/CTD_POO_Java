package Project;

public class Main {
    public static void main(String[] args) {
        //Iniciar consulta
        Consulta consulta = new Consulta("22-06-2023", "Oftalmologia", 12, 45);
        // Crear paciente particular
        PacienteParticular pacienteParticular = new PacienteParticular(consulta,"12-05-2000","Juan", "Perez",true, 500.0, "171717");
        // Crear  pacientes de obra social
        PacienteObraSocial pacienteObraSocial1 = new PacienteObraSocial(consulta,"22-06-1960","Maria", "Jimenez",true, "Nombre1", 123);
        PacienteObraSocial pacienteObraSocial2 = new PacienteObraSocial(consulta,"09-02-1998","Pedro", "Pascal",false, "Nombre2", 321);

        System.out.println("Consulta creada el "+consulta.getFechaDeConsulta()+" en la especialidad de "+consulta.getEspecialidad());

        System.out.println("El paciente particular debe hacer una evaluación inicial: " + pacienteParticular.debeRealizarEvaluacionInicial());

        System.out.println("Paciente 1 es mayor a paciente 2: " + pacienteObraSocial1.esMayorAOtro(pacienteObraSocial2));
    }
}
