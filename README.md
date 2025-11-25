# **INFORME DE INVESTIGACION DE COMPLEJIDAD**


![LOGO CARRERA](assets/ups-icc.png)


### **Asignatura:** Estructura de Datos

### **Tema:** Proyecto de Complejidad y Eficiencia de Algoritmos


# Integrantes:
- Edison Jahir Mendieta Armijos  - https://github.com/EdisonMendieta
- Nicolás Andrés Cornejo Solís - https://github.com/NiclasC0103

# Objetivos:

### - Objetivo principal.
1. Comprender y analizar la eficiencia de diferentes algoritmos mediante el estudio de su complejidad temporal y espacial, utilizando la notación Big O para evaluar su comportamiento en función del tamaño de la entrada.

### - Objetivos secunfdarios.

1. Realizar análisis experimental ejecutando los algoritmos y midiendo su rendimiento con diferentes tamaños de entrada.

2. Reconocer los factores que influyen en el tiempo de ejecución de un algoritmo, diferenciando entre factores propios, circunstancias externas y condiciones de entrada.



# Marco Teórico: 

## **1. Teoría de la Complejidad**


### 1.1 Definición general

La Teoría de la Complejidad es una rama fundamental de la informática teórica que estudia los recursos necesarios para resolver problemas mediante algoritmos. Su propósito principal es analizar y clasificar problemas y algoritmos según el tiempo de ejecución y el espacio en memoria que requieren, especialmente cuando el tamaño de la entrada crece.

A través de esta teoría es posible determinar qué tan difícil es resolver un problema desde una perspectiva computacional, permitiendo comparar distintos enfoques algorítmicos y seleccionar el más eficiente para un contexto determinado.

### 1.2 Importancia en la resolución de problemas

La eficiencia de un algoritmo se evalúa en términos del uso de recursos, principalmente:

### 1.3 Eficiencia de algoritmos

* **Coste temporal**

    Se refiere a la cantidad de tiempo que tarda un algoritmo en ejecutarse. Este tiempo no se mide en segundos, sino en el número de operaciones elementales que realiza, ya que esto permite un análisis independiente del hardware y más generalizable.
* **Coste espacial**

    Representa la memoria adicional que necesita un algoritmo durante su ejecución. Incluye variables temporales, estructuras auxiliares y memoria de recursión. Ambos costes, temporal y espacial, son esenciales para comprender el impacto que tiene el procesamiento de grandes volúmenes de datos.

### 1.4 Factores de tiempo de ejecución

* **Factores propios.**

    Están relacionados con la estructura interna del algoritmo, como el número de bucles, las operaciones realizadas y las estructuras de datos utilizadas. Estos factores determinan la complejidad teórica del programa.
* **Factores circunstanciales.**

    Incluyen aspectos externos como el hardware utilizado, el lenguaje de programación, el compilador, el sistema operativo y las características reales de los datos de entrada. Pueden modificar de forma práctica el tiempo de ejecución, aunque no alteran la complejidad teórica.
* **Análisis teórico.**

    Consiste en estudiar matemáticamente la eficiencia de un algoritmo sin ejecutarlo. Para ello se cuentan operaciones y se analiza cómo crecen en función del tamaño de la entrada (n). Es útil para clasificar algoritmos independientemente del entorno.
* **Análisis experimental.**

    Es el proceso de medir el rendimiento de un algoritmo mediante pruebas reales. Se ejecuta el programa con diferentes tamaños de entrada y se registran los tiempos obtenidos. Este análisis complementa al teórico, proporcionando resultados prácticos que pueden confirmar o contrastar las predicciones matemáticas.

### 1.5 Notación de complejidad

* **Big O**

    Es un estándar matemático que describe cómo crece el tiempo o espacio de un algoritmo cuando aumenta el tamaño de los datos.

    Big O NO dice:

    Cuántos segundos tarda
    Sí dice qué tan rápido empeora

    Ejemplo comparativo:

    O(1): casi no empeora

    O(n): empeora linealmente

    O(n²): empeora muy rápido

* **Mejor caso**

    Es el escenario más favorable.

    Ejemplo:
    Buscar un dato que está en la primera posición → O(1)
* **Peor caso**

    Es el escenario más costoso.

    Ejemplo:
    Buscar un dato que está al final o no está → O(n)
* **Caso promedio**

    Es el comportamiento esperado en la mayoría de situaciones.

    Ejemplo:
    Buscar un dato cualquiera en una lista → O(n/2) ≈ O(n)
* **Big O, Ω, Θ**

    Notación	Explica
    O (Big O)	Límite superior (peor desempeño posible)
    Ω (Omega)	Límite inferior (mejor desempeño posible)
    Θ (Theta)	Comportamiento exacto o promedio ideal

    Ejemplo para búsqueda lineal:

    Ω(1) → si está en la primera posición

    O(n) → si está al final o no está

    Θ(n) → comportamiento típico general


---

## **2. Ejemplos de Complejidad en Java**

En esta sección se presentan las clases creadas dentro del proyecto y el análisis correspondiente a cada una.

---

## **2.1 Complejidad O(1) – Constante**

### **Archivo:** `ComplejidadConstante.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(1)");
    int x = 10;
    int y = 5;
    int suma = x + y;
}
```
## **2.2 Complejidad O(n) – Lineal**

### **Archivo:** `ComplejidadLineal.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(n):");
    int[] numeros = {3, 6, 9, 12, 15};

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Valor: " + numeros[i]);
    }
}
```
## **2.3 Complejidad O(n²) – Cuadrática**

### **Archivo:** `ComplejidadCuadratica.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(n^2):");
    int[] datos = {1, 2, 3, 4};

    for (int i = 0; i < datos.length; i++) {
        for (int j = 0; j < datos.length; j++) {
            System.out.println("Par: " + datos[i] + " - " + datos[j]);
        }
    }
}
```
## **2.4 Complejidad O(log n) – Logarítmica**

### **Archivo:** `ComplejidadLogaritmica.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(log n):");
    int n = 32;

    System.out.println("Valor inicial: " + n);

    while (n > 1) {
        n = n / 2;
        System.out.println("Nuevo valor: " + n);
    }
}
```
## **2.5 Complejidad O(n log n)**

### **Archivo:** `ComplejidadNLogN.java`

### **Código del ejemplo**

```java
public void ejemplo() {
    System.out.println("Ejemplo O(n log n):");
    int[] datos = {5, 2, 8, 1, 3};
    dividir(datos, datos.length);
}

private void dividir(int[] arr, int n) {
    System.out.println("Procesando tamaño: " + n);

    if (n <= 1) {
        return;
    }

    int mitad = n / 2;

    dividir(arr, mitad);
    dividir(arr, n - mitad);
}
```

### **Explicación resumida**

* **O(1)**

    La complejidad es O(1) porque el método siempre ejecuta la misma cantidad de instrucciones, sin importar si existen pocos o muchos datos. No usa ciclos ni recursión, y el tiempo de ejecución nunca cambia.

* **O(n)**

    La complejidad es O(n) porque el método recorre todos los elementos del arreglo una sola vez. A medida que aumenta la cantidad de datos, aumenta proporcionalmente el número de iteraciones del ciclo.

* **O(n²)**

    La complejidad es O(n²) porque utiliza dos ciclos anidados que dependen del tamaño del arreglo. Por cada elemento del primer ciclo, se ejecuta completo el segundo, generando n × n operaciones.

* **O(log n)**

    La complejidad es O(log n) porque en cada iteración el valor se reduce a la mitad. No es necesario procesar todos los datos, y la cantidad de pasos crece muy lentamente incluso si el valor inicial es grande.

* **O(n log n)**

    La complejidad es O(n log n) porque el problema se divide repetidamente en mitades (comportamiento logarítmico) y, a lo largo de ese proceso, se trabajan datos de tamaño n. La combinación genera un crecimiento n × log n, más eficiente que O(n²).
---

# **Conclusiones**


**Nicolás Andres Cornejo Solís**: Al finalizar la práctica se obtuvo una comprensión más clara sobre la importancia del análisis de complejidad en los algoritmos. No basta con verificar que una solución funcione; su eficiencia resulta determinante cuando el tamaño de los datos aumenta. La comparación entre complejidades lineales y cuadráticas permitió evidenciar cómo el tiempo de ejecución puede incrementarse de forma considerable, lo que vuelve ciertos enfoques poco viables en escenarios reales. Esto demuestra que el rendimiento depende principalmente del diseño del algoritmo y no únicamente del hardware disponible.

Asimismo, se logró diferenciar entre el análisis teórico y las pruebas experimentales, entendiendo que ambos enfoques se complementan para evaluar el comportamiento de un algoritmo con mayor precisión. En conjunto, la práctica refuerza la necesidad de desarrollar soluciones eficientes, escalables y bien estructuradas, capaces de mantener un desempeño adecuado a medida que crecen las demandas computacionales.

**Edison Jahir Mendieta Armijos**: La teoria de la complejidad es una rama de la informatica que nos permite calcular la complejidad de un programa y saber la cantidad de recursos que consume el programa ya sea en tiempo o en espacio de memoria, se usan varias notaciones para representar su complejidad y el
el aumento de complejidad segun el numero de entradas que tenga.

Tambien se tomaro en cuenta otros factores como la eficiencia del codigo o factores externos como el hardware, el lenguaje de programación la compilación, el sistema operativo, etc.

---

