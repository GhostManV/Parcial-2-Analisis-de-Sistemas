public class AgenteConexion {

    private static AgenteConexion instance  = null;

    private AgenteConexion() {
    }

    public static AgenteConexion getInstance() {
        if (instance == null) {
            instance = new AgenteConexion();
        }
        return instance;
    }

    public String conectar() {
       return "Me conecto a la BD";
    }

    public String desconectar() {
        return "Me desconecto de la BD";
    }


}
