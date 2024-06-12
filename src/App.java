import java.util.Stack;

import Cola.Cola;
import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Ejercicio_03_linkedLists.LinkedListEjr;
import Materia.ColaGenerica;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Models.Pantallas;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;
import Materia.Models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
         
    //     Pila pila = new Pila();
    //     pila.push(10);
    //     pila.push(20);
    //     pila.push(30);
    //     pila.push(40);
       
         
    //     System.out.println("Elemento en la cima de la pila es:"+pila.peek());
    //     System.out.println("Elemento eliminado de la pila es: "+pila.pop());
    //     System.out.println("Elemento en la cima de la pila es:"+pila.peek());

    //     System.out.println();
    //     //IMPLEMENTACION DE PILA GENERICA
    //     PilaGenerica<Pantallas> pilaPantallas = new PilaGenerica<>();
    //     pilaPantallas.push(new Pantallas("Home Page", "/home/"));
    //     pilaPantallas.push(new Pantallas("Menu Page", "/home/menu"));
    //     pilaPantallas.push(new Pantallas("Settings Page", "/home/menu/settings"));

    //     System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());
    //     System.out.println("Destruir pantalla: \n\t"+pilaPantallas.pop().getNombre());
    //     System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());
    //     pilaPantallas.push(new Pantallas("User Page", "/home/menu/user"));
    //     System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());

    //     //INSTANCIA DE COLA
    //     Cola cola = new Cola();
    //     //Añadir elementos a la cola
    //     cola.addNode(10);
    //     cola.addNode(20);
    //     cola.addNode(30);
    //     //Mostrar elemento en el frente
    //     System.out.println("\nElemento en el frente: "+cola.peek());//10
    //     //Retiramos elementos de la cola
    //     System.out.println("Elemento retirado: "+cola.remove());//10
    //     System.out.println("Elemento en el frente: "+cola.peek());//20
        
    //     System.out.println("Elemento retirado: "+cola.remove());//20
    //     System.out.println("Elemento en el frente: "+cola.peek());//30

    //     //Verificar si la cola esta vacia
    //     System.out.println("¿Cola vacia?: "+(cola.isEmpty()?"Si":"NO"));//false

    //     //IMPLEMENTACION DE COLA GENERICA
    //     ColaGenerica<Pantalla> colaGenerica = new ColaGenerica<>();
    //     colaGenerica.addNode(new Pantalla(1,"Home Page" ));
    //     colaGenerica.addNode(new Pantalla(2,"Menu Page" ));
    //     colaGenerica.addNode(new Pantalla(3,"Settings Page" ));

    //     System.out.println("\nLa cola tiene "+colaGenerica.size()+" Elementos");
    //     System.out.println("Estoy en la pantalla:\n\t "+colaGenerica.peek().getNombre());
    //     System.out.println("Pantalla destruida: \n\t"+colaGenerica.remove().getNombre());
    //     System.out.println("Estoy en la pantalla:\n\t "+colaGenerica.peek().getNombre());
    //     System.out.println("Pantalla destruida: \n\t"+colaGenerica.remove().getNombre());
    //     System.out.println("Pantalla destruida: \n\t"+colaGenerica.remove().getNombre());
    //     System.out.println("La cola tiene "+colaGenerica.size()+" Elementos");
    //     System.out.println();
    //    //EJERCICIO 01 Validación de Signos
    //    String cadena = "([]){}";
    //    if(SignValidator.validarSignos(cadena)){
    //     System.out.println("La cadena "+cadena+" está correctamente equilibrada.");
    //     }else {
    //         System.out.println("La cadena "+cadena+" NO está correctamente equilibrada.");
    //     }
    //     String cadena1 = "({)}";
    //     if (SignValidator.validarSignos(cadena1)) {
    //         System.out.println("La cadena1 "+cadena1+"está correctamente equilibrada.");
    //     } else {
    //         System.out.println("La cadena1 "+cadena1+" NO está correctamente equilibrada.");
    //     }
    //         System.out.println();

    //         // EJERCICIO 02 ORDENAR UN STACK
    //         Stack<Integer> stack = new Stack<>();
    //         stack.push(30);
    //         stack.push(50);
    //         stack.push(16);
    //         stack.push(24);
    
    //         System.out.println("Stack previo a ordenar: " + stack);
    //         StackSorter.OrdenarStack(stack);
    //         System.out.println("Stack después de ordenar: " + stack);

            //Lista ENLAZADA
            // ListaEnlazada lista = new ListaEnlazada();
            // lista.addNode(1);
            // lista.addNode(4);
            // lista.addNode(3);
            // lista.addNode(6);
            // lista.print();
            // lista.deleteNode(1);
            // lista.print();
            // lista.deleteNode(3);
            // lista.print();
            //EJERCICIO 03 BUSCAR POSICION EN LISTA ENLAZADA
        ListaEnlazada lista = new ListaEnlazada();
        lista.addNode(1);
        lista.addNode(2);
        lista.addNode(5);
        lista.addNode(7);
        lista.addNode(6);

        LinkedListEjr ejercicio = new LinkedListEjr();
        int n = 1;
        int resultado = ejercicio.getByPos(lista, n);
        System.out.println("Posicion a buscar: " + n);
        System.out.println("Return: "+ resultado);


    }
}



    

