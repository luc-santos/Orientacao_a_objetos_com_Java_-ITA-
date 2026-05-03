public class Principal{

    public static void main (String[] args){

        Paciente paciente1 = new Paciente(70, 1.75);
        Paciente paciente2 = new Paciente(85, 1.75);
        Paciente paciente3 = new Paciente(95, 1.70);

        System.out.println(paciente1.diagnostico());
        System.out.println(paciente2.diagnostico());
        System.out.println(paciente3.diagnostico());
    }
}