package src;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    // Pilas con los nombres solicitados
    static Stack<String> acciones = new Stack<>(); // guarda las líneas escritas (estado actual)
    static Stack<String> deshechas = new Stack<>(); // guarda lo deshecho para poder rehacer

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
do {
        System.out.println("\n== Editor (Undo/Redo con java.util.Stack) ==");
            System.out.println("1. Escribir texto (agregar línea)");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar texto actual (peek)");
            System.out.println("5. Mostrar todo el texto");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            while (!sc.hasNextInt()) {
        System.out.println("Ingresa un número válido.");
                sc.next();
                System.out.print("Elige una opción: ");
            }
opcion = sc.nextInt();
            sc.nextLine(); // limpiar salto de línea

switch (opcion) {
        case 1: { // Escribir
        System.out.print("Escribe la línea: ");
String linea = sc.nextLine();
// Nueva acción invalida el historial de 'deshechas'
                    deshechas.clear();
push(acciones, linea);
                    System.out.println("Línea agregada.");
                    break;
                            }
    case 2: { // Undo
        if (isEmpty(acciones)) {
            System.out.println("No hay acciones para deshacer.");
        } else {
            String ult = pop(acciones);
            push(deshechas, ult);
            System.out.println("Se deshizo: \"" + ult + "\"");
        }
        break;
    }
case 3: { // Redo
                    if (isEmpty(deshechas)) {
                        System.out.println("No hay acciones para rehacer.");
                    } else {
                        String rec = pop(deshechas);
                        push(acciones, rec);
                        System.out.println("Se rehizo: \"" + rec + "\"");
                    }
                    break;
                }
                case 4: { // Peek
                    String cima = peek(acciones);
                    if (cima == null) {
                        System.out.println("Texto vacío.");
                    } else {
                        System.out.println("Última línea (peek): " + cima);
                        // Si quieres ver todo el texto en orden, descomenta la línea siguiente:
                        // mostrarTextoCompleto();
                    }
                    break;
                }
                case 5: {
        mostrarTextoCompleto();
        break;
    }
    case 6:
        System.out.println("Saliendo... ¡Hasta luego!");
        break;
    default:
        System.out.println("Opción inválida. Intenta de nuevo.");
}

} while (opcion != 6);

        sc.close();
    }
    // Operaciones de la Pila

    // push(): inserta en la cima
    static void push(Stack<String> pila, String valor) {
        pila.push(valor);
    }

    // pop(): quita y devuelve la cima (o null si vacía)
    static String pop(Stack<String> pila) {
        return pila.empty() ? null : pila.pop();
    }

    // peek(): devuelve la cima sin quitar (o null si vacía)
    static String peek(Stack<String> pila) {
        return pila.empty() ? null : pila.peek();
    }

    // isEmpty(): ¿pila vacía?
    static boolean isEmpty(Stack<String> pila) {
        return pila.empty();
    }
                