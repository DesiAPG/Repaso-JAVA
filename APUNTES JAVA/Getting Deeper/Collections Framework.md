---
creation date: 2023-06-08 14:22
modification date: Thursday 8th June 2023 14:22:56
---

<< [[2023-06-07]] | [[2023-06-09]] >>

# Collections

La API de java nos entrega un framework de colecciones, esto nos permite usar diferentes estructuras de datos. Estas colecciones no forman parte del lenguaje, sino que son clases definidas en el paquete java.util.

Básicamente, nos facilita el trabajo de usar estructuras de datos antiguas.

![[java-collection-hierarchy.png]]


Al ser un #framework por definición nos entrega diferentes clases y métodos, los cuales podemos usar de la siguiente forma: 

```Java
package collections.lists;  
  
import java.util.*;  
  
public class TestLists {  
    public static void main(String[] args) {  
        List<Integer> list = new ArrayList<>();  
        list.add(12);  
        list.add(1243);  
        list.add(123);  
        System.out.println(list);  
    }  
}
```

En el código anterior se puede ver como creamos una #variable de tipo List (List es una clase del framework Collections) y seguido por un #generico que son los '< * >' que se usan para especificar qué tipo de dato vamos a colocar en la lista, seguido de esto instanciamos la clase y creamos un nuevo ArrayList, esto quiere decir que vamos a tener un #arreglo. 

## Métodos comunes para los ArrayLists

Algunos métodos que podemos encontrar en esta clase como por ejemplo el que está en el código anterior .add(), hay muchos otros como lo son:

```Java
add() - // Añade
remove() - // Elimina
Size() - // Tamaño, equivale a .lenght
get(position) - // Nos da la posicion de un elemento o index
indexOf() - // Nos trae el index o la posición de un elemento
clear() - // Elimina todos lo elementos dentro de la lista
isEmpty() - // Retorna un bool y nos indica si esta vacia la lista
sort() - // Nos ordena la lista
reverse() - // Nos da la vuelta a la lista (orden)
max() - // Nos trae el mayor elemento (Solo funciona con numeros)
min() - // Nos trae el menor elemento
```

### **Ejemplo**

```Java
package collections.lists;  
  
import java.util.*;  
  
public class TestLists {  
    public static void main(String[] args) {  
        List<Integer> list = new ArrayList<>();  
        list.add(12);  
        list.add(1243);  
        list.add(123);  
        System.out.println(list.size());  
        System.out.println(list.isEmpty());  
        System.out.println(list.indexOf(123));  
        System.out.println(list.get(1));  
    }  
}
```

En este ejemplo podemos ver algunos métodos de la clase ArrayList, como output tenemos: 

```
3
false
2
1243
```

