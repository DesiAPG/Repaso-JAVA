---
creation date: 2023-05-29 15:04
modification date: Monday 29th May 2023 15:04:10
---

<< [[2023-05-28]] | [[2023-05-30]] >>

# Methods

Un método, o como se conoce normalmente, una función, es una serie de declaraciones que realizan cierto tipo de tareas que normalmente retorna algún resultado cuando es llamado.

## Sintax del método


```Shell
<modificador_de_acceso> <tipo_retorno> <nombre_metodo>( lista_de_parametros)
{
    //body
}
```

**Firma del método:** cada método tiene una firma de método.  Es una parte de la declaración del método.  Incluye el nombre del método y la lista de parámetros.

**Especificador de acceso:** El especificador o modificador de acceso es el tipo de acceso del método.  Especifica la visibilidad del método.  Java proporciona cuatro tipos de especificadores de acceso:

- *Público:* el método es accesible para todas las clases cuando usamos el especificador público en nuestra aplicación.
- *Privado:* cuando usamos un especificador de acceso privado, el método es accesible solo en las clases en las que está definido.
- *Protegido:* cuando usamos el especificador de acceso protegido, se puede acceder al método dentro del mismo paquete o subclases en un paquete diferente.
- *Predeterminado:* cuando no usamos ningún especificador de acceso en la declaración del método, Java usa el especificador de acceso predeterminado de forma predeterminada.  Solo es visible desde el mismo paquete.

**Tipo de devolución:** el tipo de devolución es un tipo de datos que devuelve el método.  Puede tener un tipo de datos primitivo, objeto, colección, vacío, etc. Si el método no devuelve nada, usamos la palabra clave void.

**Nombre del método:** es un nombre único que se utiliza para definir el nombre de un método.  Debe corresponder a la funcionalidad del método.  Supongamos que si estamos creando un método para restar dos números, el nombre del método debe ser resta().  Un método es invocado por su nombre.

**Lista de Parámetros:** Es la lista de parámetros separados por una coma y encerrados entre paréntesis.  Contiene el tipo de datos y el nombre de la variable.  Si el método no tiene ningún parámetro, deje los paréntesis en blanco.

**Cuerpo del método:** Es una parte de la declaración del método.  Contiene todas las acciones a realizar.  Está encerrado dentro del par de llaves.


## Ventajas de un método

- Es reutilizable
- Es óptimo al escribir código

![[methods-in-java.png]]


## Ventajas de usar métodos en java

- **Reutilización:** los métodos le permiten escribir código una vez y usarlo muchas veces, lo que hace que su código sea más modular y más fácil de mantener.
- **Abstracción:** los métodos le permiten abstraer la lógica compleja y proporcionar una interfaz simple para que otros la usen.  Esto hace que su código sea más legible y más fácil de entender.
- **Legibilidad mejorada:** al dividir su código en métodos más pequeños y mejor nombrados, puede hacer que su código sea más legible y más fácil de entender.
- **Encapsulación:** los métodos le permiten encapsular lógica y datos complejos, lo que facilita su administración y mantenimiento.
- **Separación de preocupaciones:** al usar métodos, puede separar diferentes partes de su código y asignar diferentes responsabilidades a diferentes métodos, mejorando la estructura y organización de su código.
- **Modularidad mejorada:** los métodos le permiten dividir su código en unidades más pequeñas y manejables, lo que mejora la modularidad de su código.
- **Capacidad de prueba mejorada:** al dividir su código en unidades más pequeñas y manejables, puede hacer que sea más fácil probar y depurar su código.
- **Rendimiento mejorado:** al organizar su código en métodos bien estructurados, puede mejorar el rendimiento al reducir la cantidad de código que debe ejecutarse y al facilitar el almacenamiento en caché y la optimización de su código.


Breve ejemplo de los métodos:  

```Java
package methods;  
  
public class BasicMethodEx {  
    public static void main(String[] args) {  
        System.out.println(operation(4, 8));  
    }  
  
    public static int operation(int a, int b) {  
        int result = a + b;  
        return result;  
    }  
}
```

Este código lo que hace es, dentro de la clase hay dos métodos, uno main y el otro llamado operación, lo que hace es que el método main llama al método operación pasándole dos parámetros y este método los sumara y retornara un resultado, lo que hacemos es pintar por pantalla el número que retorne.