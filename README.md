# 🌳 Práctica: Estructuras No Lineales – Ejercicios con Árboles Binarios

## 📌 Información General

- **Título:** Implementación de Árboles Binarios – Insertar, Invertir, Listar Niveles y Calcular Profundidad
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Mateo Josue Miller Mendez
- **Correo:** mmillerm@est.ups.edu.ec
- **Fecha:** 06 / 07 / 2025
- **Profesor:** Ing. Pablo Torres

---

## 📁 Estructura del Proyecto

```
src/
└── main/
├── Ejercicio_01_insert/
│ └── InsertBST.java
├── Ejercicio_02_invert/
│ └── InvertBinaryTree.java
├── Ejercicio_03_listLeves/
│ └── ListLevels.java
├── Ejercicio_04_depth/
  └── Depth.java
```


---

## 🧠 Explicación de Ejercicios

### Ejercicio 01: Insertar en un Arbol Binario de Búsqueda (BST)

En este ejercicio, creo un meodo que sirve para insertar números en un arbol binario, llamado al arbol binario (BST). La idea es comparar el numero que quieres agregar con el valor del nodo donde esta parado. Si el numero es menor, vas para la izquierda, y si es mayor, va para la derecha. Si llegamos donde no hay nodo o esta vacio, ahi colocamos el nuvo numero. Asi el arbol esta ordenado y facil de buscar

```java
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }
```

### Ejercicio 02: Invertir un Arbol Binario

Este metodo sirve para darle la vuelta a un arbol binario, como si fuera relfejo en espejo. En cada vista cada nodo y se intercambian los hijos izquierdo y derecho. El metodo es recursivo entonces s e llama a si mismo: primero invierte los arboles hjos y luego cambia las ramas del nodo actual asi logrando que el arbol quede invertido

```java
public Node invertTree(Node root) {
    if (root == null) {
        return null;
    }
    Node left = invertTree(root.getLeft());
    Node right = invertTree(root.getRight());
    root.setLeft(right);
    root.setRight(left);
    return root;
}
```

### Ejercicio 03: Listar Niveles en Listas Enlazadas

En este metodo usamos una cola y hacemos un recorrido por nival siempre desde arriba hacia abajo, entonces en cada nivel vamos guardando los nodos que encontramos en una lsita y al final devolvemos esa lista que contiene todas las listas y como es una por cada nivel del arbol

```java
public List<List<Node>> listLevels(Node root) {
    if (root == null) {
        return new ArrayList<>();
    }

    List<List<Node>> result = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Node> currentLevel = new ArrayList<>();
        for (int i = 0; i < levelSize; i++) {
            Node current = queue.poll();
            currentLevel.add(current);
            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
        result.add(currentLevel);
    }

    return result;
}
```

### Calcular la Profundidad Máxima

En este metodo hacemos con recursividad osea llamado a si mismo entonces si el nodo es null la profundidad es 0 y retornamos ese numero, si no, sumanos 1 y vemos cual es el de la profundidad mas grande entre el izquierdo y derecho y retorna la cantidad maxima del nivel que tiene el arbol 

```java
public int maxDepth(Node root) {
    if (root == null) {
        return 0;
    }
    return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
}
```

# Estructuras No Lineales – Ejercicios Árboles

Este proyecto contiene la solución a cuatro ejercicios prácticos sobre estructuras de datos tipo árbol binario, como parte del aprendizaje de estructuras no lineales en Java. Cada ejercicio se encuentra organizado en su propia carpeta, siguiendo la convención de paquetes y buenas prácticas.

---

## Identificación del Estudiante (Obligatorio)

Antes de comenzar a programar o ejecutar el proyecto, **debes completar tu nombre y correo institucional en el archivo `student.env`** que se encuentra en la raíz del proyecto. Este archivo es necesario para validar tu identidad como autor del trabajo.

### ¿Por qué es obligatorio?

Este proyecto utiliza una verificación automática que valida que has ingresado tu información personal. Si no lo haces:

- Al ejecutar el proyecto (`App.java`) verás este mensaje de error:
```
❌ Debes completar STUDENT_NAME y STUDENT_EMAIL en student.env
```
- No podrás enviar tu código (`push`) al repositorio si tienes activado el sistema de validación local.
- Las pruebas automáticas en GitHub Actions también fallarán si no detectan tu nombre y correo.

### ¿Qué debo hacer?

1. Abre el archivo `student.env` que ya está creado en el proyecto.
2. Rellena tus datos:

```
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.correo@institucion.edu.ec
```


3. **No borres estas líneas ni cambies los nombres de las variables.**
4. Guarda los cambios y vuelve a ejecutar el programa o hacer push.

> 💡 Este mecanismo asegura la autoría del código y que cada estudiante reciba su evaluación automática de forma personalizada.

---




## Explicación para el estudiante

```
src/
│
├── Materia/
│
├── Ejercicio_01_insert/
├── Ejercicio_02_invert/
├── Ejercicio_03_listLeves/
└── Ejercicio_04_depth/
```

---

## Descripción de Ejercicios

### Ejercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)

Carpeta: `Ejercicio_01_insert`
Implementa un algoritmo para insertar nodos en un Árbol Binario de Búsqueda.

 **Input de ejemplo:** `[5, 3, 7, 2, 4, 6, 8]`
 **Output esperado:**

```
    5
  3   7
 2 4 6 8
```

---

### Ejercicio 02: Invertir un Árbol Binario

📂 Carpeta: `Ejercicio_02_invert`
Dada la raíz de un árbol binario, el algoritmo devuelve su versión invertida (espejo).

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
    4
  7   2
9  6 3  1
```

---

### Ejercicio 03: Listar Niveles en Listas Enlazadas

📂 Carpeta: `Ejercicio_03_listLeves`
Devuelve una lista enlazada con los nodos por nivel. Si hay N niveles, se obtienen N listas.

 **Input de ejemplo:**

```
    4
  2   7
1  3 6  9
```

**Output esperado:**

```
4  
2 → 7  
1 → 3 → 6 → 9
```

---

### Ejercicio 04: Calcular la Profundidad Máxima

Carpeta: `Ejercicio_04_depth`
Calcula la profundidad máxima de un árbol binario (la longitud del camino más largo desde la raíz hasta una hoja).

**Input de ejemplo:**

```
    4
  2   7
1  3  
8
```

**Output esperado:** `4`

---

## Indicaciones Generales

* Lee cuidadosamente el enunciado de cada ejercicio.
* Cada carpeta debe contener:

  * Código fuente Java.
  * Casos de prueba.
  * Comentarios claros.
* Realiza commit y push con el mensaje:

  ```
  Estructuras No Lineales – Ejercicios Árboles
  ```
* En el AVAC, sube la **URL del repositorio** con el código.

---

## No se calificará si:

* No hay commit con los ejercicios.
* No se incluye este README explicativo.
* Las clases o métodos no siguen los nombres requeridos.

---

## Rúbrica de Calificación

| **Criterio**       | **Descripción**                                                                       | **Puntaje** |
| ------------------ | ------------------------------------------------------------------------------------- | ----------- |
| **Informe**        | No hay informe                                                                        | 0 pts       |
|                    | Informe parcial **sin explicación** de cada método                                    | 1 pt        |
|                    | Informe parcial **con explicación** de cada método                                    | 2 pts       |
|                    | Informe completo                                                                      | 3 pts       |
| **Funcionamiento** | No implementado                                                                       | 0 pts       |
|                    | Implementado parcialmente: <br>• Ejercicio 1 y 4 → 2 pts<br>• Ejercicio 2 y 3 → 4 pts | 2–4 pts     |
|                    | Código funcional pero **no pasa todas las pruebas**                                   | 6 pts       |
|                    | Código funcional y **pasa todas las pruebas correctamente**                           | 7 pts       |



## Contribuir

Para contribuir a este proyecto, por favor crea un fork y envía una solicitud de extracción, o simplemente abre un issue con tus comentarios y sugerencias.

## Autores

- [PABLO TORRES] - Desarrollo inicial

