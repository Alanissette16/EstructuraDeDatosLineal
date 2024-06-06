import Cola.Cola;
import Materia.ColaGenerica;
import Materia.Models.Pantallas;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;
import Materia.Models.Pantalla;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
       
         
        System.out.println("Elemento en la cima de la pila es:"+pila.peek());
        System.out.println("Elemento eliminado de la pila es: "+pila.pop());
        System.out.println("Elemento en la cima de la pila es:"+pila.peek());

        System.out.println();
        //IMPLEMENTACION DE PILA GENERICA
        PilaGenerica<Pantallas> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantallas("Home Page", "/home/"));
        pilaPantallas.push(new Pantallas("Menu Page", "/home/menu"));
        pilaPantallas.push(new Pantallas("Settings Page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla: \n\t"+pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantallas("User Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla:\n\t "+pilaPantallas.peek().getNombre());

        //INSTANCIA DE COLA
        Cola cola = new Cola();
        //Añadir elementos a la cola
        cola.addNode(10);
        cola.addNode(20);
        cola.addNode(30);
        //Mostrar elemento en el frente
        System.out.println("\nElemento en el frente: "+cola.peek());//10
        //Retiramos elementos de la cola
        System.out.println("Elemento retirado: "+cola.remove());//10
        System.out.println("Elemento en el frente: "+cola.peek());//20
        
        System.out.println("Elemento retirado: "+cola.remove());//20
        System.out.println("Elemento en el frente: "+cola.peek());//30

        //Verificar si la cola esta vacia
        System.out.println("¿Cola vacia?: "+(cola.isEmpty()?"Si":"NO"));//false

        //IMPLEMENTACION DE COLA GENERICA
        ColaGenerica<Pantalla> colaGenerica = new ColaGenerica<>();
        colaGenerica.addNode(new Pantalla(1,"Home Page" ));
        colaGenerica.addNode(new Pantalla(2,"Menu Page" ));
        colaGenerica.addNode(new Pantalla(3,"Settings Page" ));

        System.out.println("\nLa cola tiene "+colaGenerica.size()+" Elementos");
        System.out.println("Estoy en la pantalla:\n\t "+colaGenerica.peek().getNombre());
        System.out.println("Pantalla destruida: \n\t"+colaGenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla:\n\t "+colaGenerica.peek().getNombre());
        System.out.println("Pantalla destruida: \n\t"+colaGenerica.remove().getNombre());
        System.out.println("Pantalla destruida: \n\t"+colaGenerica.remove().getNombre());
        System.out.println("La cola tiene "+colaGenerica.size()+" Elementos");


    }
}
