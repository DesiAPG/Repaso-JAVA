---
creation date: 2023-05-25 19:30
modification date: Thursday 25th May 2023 19:30:20
---

<< [[2023-05-24]] | [[2023-05-26]] >>

# Loops

Los loops o bucles en java son declaraciones que hacemos para repetir una tarea o cierta parte de código.

Empezando por el bucle más simple está:

## For

El bucle for se compone de una declaración, inicialización, condición y finalmente un incremento o decrecimiento como la economía de Colombia.

```Java
for(inicializacion;condicion;incremento/decrecimiento)
```

![[forloop.png|center]]

Por **ejemplo:**

```Java
package loops;  
  
public class ForLoop {  
    public static void main(String[] args) {  
        for (int i = 0; i < 10; i++) {  
            System.out.println("Under 10");  
        }  
    }  
}
```

En este ejemplo se inicializa una variable, luego de esto se pone la condición de que si la variable es menor de 10 la variable se incrementa en una unidad, esto dará como resultado lo siguiente.

```Shell
Under 10
Under 10
Under 10
Under 10
Under 10
Under 10
Under 10
Under 10
Under 10
Under 10
```

### For anidado

Al igual que los [[Conditionals|condicionales]] los bucles se pueden anidar, un ejemplo de esto es el siguiente:

```Java
package loops;  
  
public class NestFor {  
    public static void main(String[] args) {  
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 3; j++) {  
                System.out.println(i + " " + j);  
            }  
        }  
    }  
}
```

En este ejemplo hacemos que nos pinte por consola dos variables inicializadas en cada 'for' y que cada iteración aumente en uno el valor, por lo que nos daría este resultado.

```Java
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
```

En el siguiente ejemplo podemos apreciar como podemos recorrer un [[DataTypes, Variables|arreglo]] de números, con la declaración for each.

```Java
package loops;  
  
public class ForEach {  
    public static void main(String[] args) {  
        int[] numbers = {1, 6, 2, 87};  
        for (int i : numbers  
        ) {  
            System.out.println(i);  
        }  
    }  
}
```


| Comparación | Bucle for                                              | Bucle while                                             | Bucle do-while                                            |
|-------------|--------------------------------------------------------|--------------------------------------------------------|-----------------------------------------------------------|
| Introducción | El bucle for de Java es una instrucción de flujo de control que itera una parte del programa múltiples veces. | El bucle while de Java es una instrucción de flujo de control que ejecuta una parte del programa repetidamente en función de una condición booleana dada. | El bucle do-while de Java es una instrucción de flujo de control que ejecuta una parte del programa al menos una vez y la ejecución adicional depende de la condición booleana dada. |
| Cuándo usarlo | Si el número de iteraciones es fijo, se recomienda usar el bucle for. | Si el número de iteraciones no es fijo, se recomienda usar el bucle while. | Si el número de iteraciones no es fijo y debes ejecutar el bucle al menos una vez, se recomienda usar el bucle do-while. |
| Sintaxis| for(inicialización; condición; incremento/decremento){...} | while(condición){...} | do{...}while(condición); |
| Ejemplo     | // bucle for <br> for(int i=1; i<=10; i++){<br>     System.out.println(i);<br>} | // bucle while <br> int i=1; <br> while(i<=10){<br>     System.out.println(i);<br>     i++;<br>} | // bucle do-while <br> int i=1; <br> do{<br>     System.out.println(i);<br>     i++;<br>}while(i<=10); |
| Sintaxis para bucle infinito | for(;;){...} | while(true){...} | do{...}while(true); |