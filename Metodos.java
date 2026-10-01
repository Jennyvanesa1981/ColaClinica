import java.util.Queue;
import java.util.Stack;

public class Metodos {

public void LlenarArreglo(ObjPaciente[] pacientes) {

        pacientes[0] = new ObjPaciente(1, "Juan Perez", "Consulta", 30, "Normal", "Mañana", "Medicina General", "Activo", "No");
        pacientes[1] = new ObjPaciente(2, "Maria Lopez", "Urgencia", 25, "Prioritario", "Tarde", "Pediatría", "Activo", "Sí");
        pacientes[2] = new ObjPaciente(3, "Carlos Sanchez", "Consulta", 40, "Normal", "Mañana", "Cardiología", "Inactivo", "No");
        pacientes[3] = new ObjPaciente(4, "Ana Torres", "Urgencia", 35, "Prioritario", "Tarde", "Ginecología", "Activo", "Sí");
        pacientes[4] = new ObjPaciente(5, "Luis Ramirez", "Consulta", 28, "Normal", "Mañana", "Dermatología", "Activo", "No");
    }

    public void MostrarArreglo(ObjPaciente[] pacientes) {

        for (int i = 0; i < pacientes.length; i++) {
            System.out.println("ID: " + pacientes[i].getId());
            System.out.println("Nombre: " + pacientes[i].getNombre());
            System.out.println("Tipo de Trámite: " + pacientes[i].getTipoTramite());
            System.out.println("Edad: " + pacientes[i].getEdad());
            System.out.println("Condición de Atención: " + pacientes[i].getCondicionAtencion());
            System.out.println("Turno: " + pacientes[i].getTurno());
            System.out.println("Servicio: " + pacientes[i].getServicio());
            System.out.println("Estado: " + pacientes[i].getEstado());
            System.out.println("Prioritario: " + pacientes[i].getPrioritario());
            System.out.println("---------------------------");
        }
    }

    public void LlenarPila(ObjPaciente[ ] pacientes, Stack<ObjPaciente> pendientes) {

        for (int i = pacientes.length - 1; i >= 0;  i--) {

          pendientes.push(pacientes[i]);
            

        }
    }

    public void MostrarPila(Stack<ObjPaciente> pendientes) {
      
      for(ObjPaciente p : pendientes) {

        System.out.println("ID: " + p.getId());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Tipo de Trámite: " + p.getTipoTramite());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Condición de Atención: " + p.getCondicionAtencion());
        System.out.println("Turno: " + p.getTurno());
        System.out.println("Servicio: " + p.getServicio());
        System.out.println("Estado: " + p.getEstado());
        System.out.println("Prioritario: " + p.getPrioritario());
        System.out.println("---------------------------");

      }

    }

    public void AtenderPaciente(Stack<ObjPaciente> pendientes, Queue <ObjPaciente> atendidos) {

      if (!pendientes.isEmpty()) {

        ObjPaciente paciente = pendientes.pop();
        paciente.setEstado("Atendido");
        
        atendidos.offer(paciente);

        System.out.println("Paciente Atendido Correctamente");
        System.out.println("Nombre: " + paciente.getNombre());

      }else {

        System.out.println("No hay pacientes pendientes");
      }

    }

    public void MostrarAtendidos(Queue<ObjPaciente> atendidos) {

      for (ObjPaciente p : atendidos) {

        System.out.println("ID: " + p.getId());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Tipo de Trámite: " + p.getTipoTramite());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Condición de Atención: " + p.getCondicionAtencion());
        System.out.println("Turno : " + p.getTurno());
        System.out.println("Servicio: " + p.getServicio());
        System.out.println("Estado: " + p.getEstado());
        System.out.println("Prioritario: " + p.getPrioritario());
        System.out.println("============================");
 
      }

    }

    public void CancelarPaciente(Stack<ObjPaciente> pendientes, Queue<ObjPaciente> cancelados) {

      if(!pendientes.isEmpty()) {

        ObjPaciente paciente = pendientes.pop();

        paciente.setEstado("Cancelado");

        cancelados.offer(paciente);

        System.out.println("Paciente Cancelado Correctamente");
        System.out.println("Nombre: " + paciente.getNombre());

      }else {

        System.out.println("No hay pacientes pendientes");


      }
    }

    public void MostrarCancelados(Queue<ObjPaciente> cancelados) {

      for (ObjPaciente p : cancelados) {

        System.out.println("ID: " + p.getId());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Tipo de Trámite: " + p.getTipoTramite());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Condición de Atención: " + p.getCondicionAtencion());
        System.out.println("Turno : " + p.getTurno());
        System.out.println("Servicio: " + p.getServicio());
        System.out.println("Estado: " + p.getEstado());
        System.out.println("Prioritario: " + p.getPrioritario());
        System.out.println("============================");
 
      }

    }

    public void MarcarPrioritario(Stack<ObjPaciente> pendientes, Queue<ObjPaciente> prioritarios) {

      if(!pendientes.isEmpty()) {

        ObjPaciente paciente = pendientes.pop();
        paciente.setPrioritario("Sí");

        prioritarios.offer(paciente);

        System.out.println("Paciente Marcado como Prioritario");
        System.out.println("Nombre: " + paciente.getNombre());

      } else {

        System.out.println("No hay pacientes pendientes");

      }
    }

    public void MostrarPrioritarios(Queue<ObjPaciente> prioritarios) {

      for (ObjPaciente p : prioritarios) {

        System.out.println("ID: " + p.getId());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Tipo de Trámite: " + p.getTipoTramite());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Condición de Atención: " + p.getCondicionAtencion());
        System.out.println("Turno : " + p.getTurno());
        System.out.println("Servicio: " + p.getServicio());
        System.out.println("Estado: " + p.getEstado());
        System.out.println("Prioritario: " + p.getPrioritario());
        System.out.println("============================");
 
      }

    }

    public void CambiarServicio(ObjPaciente[] pacientes, int id, String nuevoServicio) {

      for(int i = 0; i < pacientes.length; i++) {

        if(pacientes[i].getId() == id) {

          pacientes[i].setServicio(nuevoServicio);

          System.out.println("Servicio Cambiado Correctamente");
          System.out.println("Nombre: " + pacientes[i].getNombre());
          System.out.println("Nuevo Servicio: " + pacientes[i].getServicio());

        }
      }
    }

    public void SolicitarAtencion(Queue<ObjPaciente> atendidos, Stack<ObjPaciente> pendientes) {

      if(!atendidos.isEmpty()) {

        ObjPaciente paciente = atendidos.poll();
        paciente.setEstado("Pendiente");

        pendientes.push(paciente);

        System.out.println("Paciente Solicitando Atención");
        System.out.println("Nombre: " + paciente.getNombre());

      } else {

        System.out.println("No hay pacientes atendidos");

      }
      
    }
    
}
