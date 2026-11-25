# 💡 Ejemplo 01 — Definición y mapa de palabras

## 🌍 Contexto

En el Módulo 01 viste que cada token se convierte en números que lo ubican en un "mapa de significado". Ahora vamos a mirar ese mapa de cerca.

## 🧠 Concepto

Un **embedding** es un **vector** (una lista de números) que representa el **significado** de una palabra, una frase o un documento.

🔗 **Analogía**: es como dar las **coordenadas** de una ciudad: con dos números sabes dónde está y qué tiene cerca.

## 🧭 Explicación paso a paso

**1. Un mapa de dos números**

| Palabra | Vector (ilustrativo) |
|---|---|
| perro | (2, 8) |
| gato | (3, 8) |
| caballo | (4, 7) |
| auto | (8, 2) |
| bicicleta | (7, 3) |
| avión | (9, 1) |

```text
        ↑ eje B
   10 |
    8 |  perro gato
    7 |        caballo
    3 |                   bicicleta
    2 |                         auto
    1 |                              avión
      +------------------------------→ eje A
         0   2   4   6   8   10
```

**2. Leer el mapa**

- *perro* y *gato* están **cerca** → significados parecidos (animales domésticos).
- *perro* y *avión* están **lejos** → significados distintos.
- Los **ejes no tienen un nombre claro**: en un modelo real nadie sabe qué significa cada eje. Lo importante es **la cercanía**.

**3. ¿Por qué números?**

Una máquina no puede comparar "perro" con "gato" como letras: solo **calcula con números**. El embedding traduce el sentido a coordenadas que sí se pueden medir y comparar.

**4. En la realidad**

Los vectores de un modelo real tienen **cientos o miles de números** en vez de dos. No se pueden dibujar, pero la idea es la misma.

## ✅ Resultado esperado

El estudiante define embedding con sus palabras, explica por qué se necesitan números y lee un mapa de dos ejes diciendo qué palabras son cercanas.

## 🎲 Dinámica: Mapa de palabras

Cada equipo recibe una palabra y el grupo se ubica en el aula (o en la cuadrícula impresa) de modo que **las parecidas queden cerca**. Luego se compara con las coordenadas de la tabla.
