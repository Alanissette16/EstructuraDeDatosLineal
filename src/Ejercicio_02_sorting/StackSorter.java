package Ejercicio_02_sorting;
import java.util.Stack;



public class StackSorter {
    public static void OrdenarStack(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!aux.isEmpty() && aux.peek() > temp) {
                stack.push(aux.pop());
            }

            aux.push(temp);
        }

        // Reintroducir los elementos en orden en la pila original
        while (!aux.isEmpty()) {
            stack.push(aux.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(90);
        stack.push(10);
        stack.push(49);
        stack.push(22);

        System.out.println("Stack antes de ordenar: " + stack);
        OrdenarStack(stack);
        System.out.println("Stack después de ordenar: " + stack);
    }
}

