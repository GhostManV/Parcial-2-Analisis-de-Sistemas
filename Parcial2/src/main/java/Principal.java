/**
 * Se necesita realizar  hacer un agente de base de datos en el que se  centralice el acceso a la base de datos,
 * se debe asegurar de que existe una única instancia de ese agente, para que todos los objetos que la usen estén tratando
 * con la  misma instancia, accedan a ella de la misma forma
 *
 * @author  rvasquez
 *
 */

public class Principal {
    public static void main(String[] args) {
        AgenteConexion conexion1 = AgenteConexion.getInstance();
        AgenteConexion conexion2 = AgenteConexion.getInstance();
        System.out.println("Conexion 1->"+conexion1.conectar());
        System.out.println("Conexion 2->"+conexion2.conectar());
        System.out.println("Conexion 1->"+conexion1.desconectar());
        System.out.println("Conexion 2->"+conexion2.desconectar());
        if(conexion1 == conexion2) {
            System.out.println("Son la misma instancia");
            System.out.println(conexion1);
            System.out.println(conexion2);
        }else{
            System.out.println("Son diferentes instancias");
        }
    }
}
