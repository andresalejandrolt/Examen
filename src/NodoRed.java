public class NodoRed {

    private int nodoID;
    private final int conexionesMax;
    private int conexionesActivas;
    private static int nodosCreados;
    private boolean nodoCorrecto;

    public NodoRed(int nodoID, int conexionesMax) {

        this.nodoCorrecto = true;
        this.conexionesActivas = 0;


        if(nodoID < 0){

            nodoCorrecto = false;
            this.nodoID = 0;
            System.out.println("ID invalido");

        }
        else {
            this.nodoID = nodoID;
        }

        if(conexionesMax < 0){

            nodoCorrecto = false;
            this.conexionesMax = 0;
            System.out.println("Conexiones max invalida");

        }
        else {
            this.conexionesMax = conexionesMax;
        }

        if(nodoCorrecto) {
            System.out.println("Nodo creado correctamente");
            nodosCreados++;
        }
        else
            System.out.println("Nodo creado incorrectamente");
    }


    public boolean conectar(){

        if(conexionesActivas < conexionesMax){
            System.out.println("Incrementando en uno las conexiones activas");
            conexionesActivas++;
            System.out.println("Conexiones activas = " + getConexionesActivas());
            return true;
        }

        System.out.println("Error, conexiones maximas alcanzadas");
        return false;


    }

    public boolean desconectar(){

        if(conexionesActivas > 0){
            System.out.println("Disminuyendo en uno las conexiones activas");
            conexionesActivas--;
            System.out.println("Conexiones activas = " + getConexionesActivas());
            return true;
        }

        System.out.println("Error, no hay conexiones activas");
        return false;


    }

    public int getNodoID() {
        return nodoID;
    }

    public int getConexionesMax() {
        return conexionesMax;
    }

    public int getConexionesActivas() {
        return conexionesActivas;
    }

    public static int getNodosCreados() {
        return nodosCreados;
    }

    public boolean isNodoCorrecto() {
        return nodoCorrecto;
    }
}
