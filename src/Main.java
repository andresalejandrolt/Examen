public class Main {

    static void main() {

        System.out.println("Nodos creados correctamente = " + NodoRed.getNodosCreados());

        System.out.println("=".repeat(40));


        var nodo1 = new NodoRed(1, 2);
        System.out.println("Conexiones activas = " + nodo1.getConexionesActivas());
        System.out.printf(" nodoID = %d%n conexionesMax = %d%n conexionesActivas = %d%n nodoCorrecto = %s%n",
                nodo1.getNodoID(), nodo1.getConexionesMax(), nodo1.getConexionesActivas(), nodo1.isNodoCorrecto());

        System.out.println("=".repeat(40));

        System.out.println("Nodos creados correctamente = " + NodoRed.getNodosCreados());

        System.out.println("=".repeat(40));

        System.out.println("-".repeat(20));
        System.out.println("Conectar 1 :");
        System.out.println("Resultado = " + nodo1.conectar());
        System.out.println("-".repeat(20));

        System.out.println("-".repeat(20));
        System.out.println("Conectar 2 :");
        System.out.println("Resultado = " + nodo1.conectar());
        System.out.println("-".repeat(20));

        System.out.println("-".repeat(20));
        System.out.println("Conectar 3 :");
        System.out.println("Resultado = " + nodo1.conectar());
        System.out.println("-".repeat(20));

        System.out.println("=".repeat(40));

        System.out.println("-".repeat(20));
        System.out.println("Desconectar 1 :");
        System.out.println("Resultado = " + nodo1.desconectar());
        System.out.println("-".repeat(20));

        System.out.println("-".repeat(20));
        System.out.println("Desconectar 2 :");
        System.out.println("Resultado = " + nodo1.desconectar());
        System.out.println("-".repeat(20));

        System.out.println("-".repeat(20));
        System.out.println("Desconectar 3 :");
        System.out.println("Resultado = " + nodo1.desconectar());
        System.out.println("-".repeat(20));

        System.out.println("=".repeat(40));

        System.out.println("Nodos creados correctamente = " + NodoRed.getNodosCreados());

        System.out.println("=".repeat(40));

        //nodo invalido
        var nodo2 = new NodoRed(-1, -1);
        System.out.println("Conexiones activas = " + nodo1.getConexionesActivas());

        System.out.printf(" nodoID = %d%n conexionesMax = %d%n conexionesActivas = %d%n nodoCorrecto = %s%n",
                nodo2.getNodoID(), nodo2.getConexionesMax(), nodo2.getConexionesActivas(), nodo2.isNodoCorrecto());


        System.out.println("=".repeat(40));

        System.out.println("Nodos creados correctamente = " + NodoRed.getNodosCreados());



    }

}