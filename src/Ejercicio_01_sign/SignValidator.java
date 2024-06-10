package Ejercicio_01_sign;
import java.util.Stack;

public class SignValidator {
    public static boolean validarSignos(String s) {
        Stack<Character> stack = new Stack<>();
        char[] caracteres = s.toCharArray();

        for (char charac : caracteres) {
            if (charac == '(' || charac == '{' || charac == '[') {
                stack.push(charac);
            } else if (charac == ')' || charac == '}' || charac == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if ((charac == ')' && stack.peek() == '(') ||
                           (charac == '}' && stack.peek() == '{') ||
                           (charac == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        
        if (validarSignos("([]){}")) {
            System.out.println("La cadena está correctamente equilibrada.");
        } else {
            System.out.println("La cadena NO está correctamente equilibrada.");
        }

        if (validarSignos("({)}")) {
            System.out.println("La cadena está correctamente equilibrada.");
        } else {
            System.out.println("La cadena NO está correctamente equilibrada.");
        }
    }
}
