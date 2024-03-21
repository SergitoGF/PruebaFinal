import java.util.ArrayList;

public class PruebaArrays {

    public static void main(String[] args) {
        /**
         * REALIZACIÓN DE PRUEBAS CON ARRAYLIST
         */
        ArrayList<Integer> lista = new ArrayList<>();

        // Podemos añadir cualquier elemento con diferente tipo de dato
        lista.add(5);
        lista.add(10);
        lista.add(12);
        lista.add(23);

        //Mostramos lista completa seguida
        System.out.println(lista.toString());
        System.out.println(" ");
        //Mostramos lista completa por separado usando size() que devuelve tamaño de la lista.
        for (Integer integer : lista) {
            System.out.println(integer);
        }
        /*for (int contador = 0; contador < lista.size(); contador++){
            System.out.println(lista.get(contador));
        }*/
        System.out.println(" ");
        // Devolvemos el valor del elemento en la posición que pongamos.
        System.out.println(lista.get(1));
        System.out.println("Devolvemos true si la lista está vacía: " + lista.isEmpty());
        System.out.println(" ");
        lista.clear();
        System.out.println("Mostramos elementos después del borrado total: " + lista.toString());
        System.out.println("Devolvemos true si la lista está vacía: " + lista.isEmpty());
        System.out.println(" ");
        lista.add(5);
        lista.add(10);
        lista.add(12);
        lista.add(23);

        //Mostramos lista completa seguida
        System.out.println(lista.toString());
        lista.add(2, 49);
        System.out.println(lista.toString());
        lista.set(2, 69);
        System.out.println(lista.toString());
        System.out.println("Buscamos un objeto en concreto y devuelve true si existe: " + lista.contains(79));
        System.out.println("Buscamos un objeto desde el principio del array y devuelve su posición: " + lista.indexOf(69));
        System.out.println("Buscamos un objeto desde el final del array y devuelve su posición: " + lista.lastIndexOf(12));
        System.out.println("Eliminamos un objeto en la posición que nosotros espscificamos y devuelve su valor: " + lista.remove(2));
        System.out.println(lista.toString());
        //System.out.println("Eliminamos el objeto que nosotros especificamos y devuelve true si lo ha encontrado: " + lista.remove(12));
        //System.out.println(lista.toString());
        System.out.println("---------------------------------------------------------------------");
    }
}
