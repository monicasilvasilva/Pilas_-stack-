# EA2. Actividad - Pilas (Stack)

## Docente
Steven Zuluaga

## Asignatura
Estructura de Datos

## curso
PREICA2502B010080

## Grupo de estudiantes 
Grupo 1

## Integrantes
Jorge Daniel Londoño Duque
Karen Dayana Bueno Cruz
Monica Silva Silva
Santiago Cano
Sergio Alejandro Jimenez Acero

## Objetivo del Proyecto
Comprender el concepto de pila (Stack) y aplicarlo en un simulador de Deshacer/Rehacer (Undo/Redo) en un editor de texto simple de Java, trabajando en equipo y usando buenas prácticas de Git/GitHub.

## Definición de Pila (Stack)
Una pila es una estructura LIFO (*Last In, First Out*). Operaciones fundamentales a realizar:
- push(x): pone `x` en la cima.
- pop(): quita y devuelve el elemento en la cima.
- peek(): devuelve el elemento en la cima sin quitarlo.
- isEmpty(): indica si la pila está vacía.

Para el simulador se usan dos pilas:
1) acciones: guarda las acciones realizadas.
2) deshechas: guarda las acciones deshechas y permitir rehacerlas.

## Funcionalidades Implementadas en el menú de consola con opciones:
1. Escribir texto
2. Deshacer (Undo)
3. Rehacer (Redo)
4. Mostrar texto actual (peek)
5. Salir