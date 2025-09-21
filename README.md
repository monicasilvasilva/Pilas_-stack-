# EA2. Actividad - Pilas (Stack)

# IU Digital 
## Docente
Steven Zuluaga

## Asignatura
Estructura de Datos

## curso
PREICA2502B010080

## Grupo de estudiantes 
Grupo 1

## Integrantes
Karen Dayana Bueno Cruz
Monica Silva Silva
Santiago Cano

## Objetivo del Proyecto
Comprender el concepto de pila (Stack) y aplicarlo en un simulador de Deshacer/Rehacer (Undo/Redo) en un editor de texto simple de Java, trabajando en equipo y usando buenas prácticas de Git/GitHub.

## Definición de Pila (Stack)
Este proyecto es un editor simple en consola que deja escribir texto, deshacer (Undo) y rehacer (Redo) con pilas de estructura LIFO (*Last In, First Out*).
Para hacerlo usamos dos pilas hechas en Java:
- Pila de acciones: aquí se guardan las líneas de texto que el usuario escribe.
- Pila de deshechas: aquí se guardan las líneas que se borran cuando se hace Undo, para poder recuperarlas con Redo.
Cómo funciona
- Escribir texto: cada vez que se escribe una línea, se guarda en la pila de acciones. Además, cuando se escribe algo nuevo, la pila de deshechas se limpia, porque ya no tendría sentido rehacer lo anterior.
- Undo (Deshacer): quita la última línea escrita de la pila de acciones y la pasa a la pila de deshechas. Así se borra, pero queda guardada por si se quiere recuperar.
- Redo (Rehacer): toma la última línea de la pila de deshechas y la vuelve a poner en la pila de acciones. De esta manera, se restaura la línea que se había borrado.
- Peek (Mostrar texto): muestra cuál es la última línea que está en la pila de acciones y también deja ver todo el texto escrito.
## Operaciones de la pila
### En el código se programaron las operaciones básicas de una pila:
- push: agregar un dato en la cima.
- pop: quitar el dato que está en la cima.
- peek: mirar el dato de la cima sin quitarlo.
- isEmpty: revisar si la pila está vacía.
Con este programa se entiende cómo funcionan las pilas y cómo se pueden aplicar a algo útil como un sistema de Undo y Redo en desarrollos adicionales .

## Funcionalidades Implementadas en el menú de consola con opciones:
### == Editor (Undo/Redo con java.util.Stack) ==
1. Escribir texto (agregar línea)
2. Deshacer (Undo)
3. Rehacer (Redo)
4. Mostrar texto actual (peek)
5. Mostrar todo el texto
6. Salir

## Cómo ejecutar
**Requisitos:** Java y Git.

Clonar Repositorio
```bash
git clone https://github.com/monicasilvasilva/Pilas_-stack-
cd nombre-del-repositorio
```
Ejecutar codigo 
```bash
javac -d ".\out" ".\src\Main.java"
java -cp ".\out" src.Main
```

## Captura de pantalla del código
- ![img1.png](img1.png)
- ![img2.png](img2.png)
- ![img3.png](img3.png)
