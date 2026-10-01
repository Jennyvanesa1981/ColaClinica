import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        ObjPaciente[] pacientes = new ObjPaciente[5];
        Stack<ObjPaciente> pendientes = new Stack<>();
        Queue<ObjPaciente> atendidos = new LinkedList<>();
        Queue<ObjPaciente> cancelados = new LinkedList<>();
        Queue<ObjPaciente> prioritarios = new LinkedList<>();

        String[] historial = new String[20];

        Metodos metodos = new Metodos();

        metodos.LlenarArreglo(pacientes);
        metodos.LlenarPila(pacientes, pendientes);

        Menu menu = new Menu();

        menu.MostrarMenu(pacientes, pendientes, atendidos, cancelados, prioritarios, historial, metodos);
    }


    public void MostrarMenu(ObjPaciente[] pacientes, Stack<ObjPaciente> pendientes,
            Queue<ObjPaciente> atendidos, Queue<ObjPaciente> cancelados,
            Queue<ObjPaciente> prioritarios, String[] historial, Metodos metodos) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n===== ATENCION DE PACIENTES =====");
            System.out.println("1. Mostrar pacientes registrados");
            System.out.println("2. Mostrar pacientes pendientes");
            System.out.println("3. Atender paciente");
            System.out.println("4. Mostrar pacientes atendidos");
            System.out.println("5. Cancelar paciente");
            System.out.println("6. Mostrar pacientes cancelados");
            System.out.println("7. Marcar paciente prioritario");
            System.out.println("8. Mostrar pacientes prioritarios");
            System.out.println("9. Cambiar servicio");
            System.out.println("10. Solicitar atencion nuevamente");
            System.out.println("11. Mostrar historial");
            System.out.println("12. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch(opcion) {

                case 1:
                    metodos.MostrarArreglo(pacientes);
                    break;

                case 2:
                    metodos.MostrarPila(pendientes);
                    break;

                case 3:
                    metodos.AtenderPaciente(pendientes, atendidos);
                    break;

                case 4:
                    metodos.MostrarAtendidos(atendidos);
                    break;

                case 5:
                    metodos.CancelarPaciente(pendientes, cancelados);
                    break;

                case 6:
                    metodos.MostrarCancelados(cancelados);
                    break;

                case 7:
                    metodos.MarcarPrioritario(pendientes, prioritarios);
                    break;

                case 8:
                    metodos.MostrarPrioritarios(prioritarios);
                    break;

                case 9:
                    System.out.print("Ingrese el ID del paciente: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese el nuevo servicio: ");
                    String nuevoServicio = sc.nextLine();

                    metodos.CambiarServicio(pacientes, id, nuevoServicio);
                    break;

                case 10:
                    metodos.SolicitarAtencion(atendidos, pendientes);
                    break;

                case 11:
                    System.out.println("Historial de operaciones");
                    break;

                case 12:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while(opcion != 12);
    }
}


