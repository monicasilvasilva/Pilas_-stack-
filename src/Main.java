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
