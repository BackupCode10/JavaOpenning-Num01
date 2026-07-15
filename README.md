# Sistema de Registro de Votos (Java Básico) -  ESTO ES UN CAMBIO ECHO POR MI XD

Este es un proyecto en **Java** que simula un sistema de registro y análisis de votos.  
El usuario puede ingresar calificaciones del **1 al 5**, ver las estadísticas de los votos registrados y conocer el nivel de satisfacción.

---

## Funcionalidades

1. **Registrar voto**
   - Permite ingresar una calificación del **1 al 5**.
   - Registra cada voto en una lista y actualiza un conteo acumulado.
   - Pregunta si se desea ingresar otro voto o continuar con otras opciones.

2. **Ver datos**
   - Muestra:
     - Total de votos.
     - Cantidad de votos por cada puntuación.
     - Promedio de las calificaciones.
     - Porcentaje de satisfacción (votos con **4 o 5**).

3. **Salir**
   - Finaliza el programa con un mensaje de despedida.

---

## Conceptos de Java practicados

En este proyecto se trabajaron los siguientes puntos:

- **Colecciones**
  - Uso de `List` (`ArrayList`) para almacenar los votos.
  - Uso de arreglos (`int[]`) para llevar el conteo por cada puntuación.

- **Control de flujo**
  - Estructuras `while` y `switch-case`.
  - Control de bucles con etiquetas (`continue menu;`).
  - Uso de `break`, `continue` y `return` para manejar la ejecución.

- **Entrada de datos**
  - Clase `Scanner` para leer números y cadenas.
  - Lectura y validación de entradas para evitar valores fuera de rango.

- **Manejo de condiciones**
  - Validación de votos (solo entre 1 y 5).
  - Confirmaciones con respuestas de tipo **sí** o **no**.
  - Manejo de opciones incorrectas.

- **Cálculos**
  - Suma y promedio de votos.
  - Porcentaje de satisfacción calculado con votos de **4** o **5**.

---
