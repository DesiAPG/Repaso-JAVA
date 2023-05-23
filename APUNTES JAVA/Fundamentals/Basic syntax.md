---
creation date: 2023-05-22 21:49
modification date: Monday 22nd May 2023 21:49:01
---

<< [[2023-05-21]] | [[2023-05-23]] >>

# Basic syntax

## Terminologías básicas 

### Clases 

Una clase es un plano donde se pueden sacar moldes (objetos), se podría llamar plantilla.

* *Ejemplo:* Una casa es una clase, un auto es una clase, un animal, etc.

### Objetos

Como se mencionó antes, un objeto es una instancia de una clase, o como se entendería mejor, es un molde que se extrae de un plano.

- *Ejemplo:* Un gato, perro, etc. Son objetos de una "clase" Animal.
- *Comportamiento (métodos):* Correr, sentarse, caminar, etc.

### Métodos

Un método en programación es una función o para que se entienda mejor sería los comportamientos del objeto.

-*Ejemplo:* El indicador de gasolina en un auto es un comportamiento.

### Variables de instancias

Todos los objetos tienen sus propias variables de instancias.

**Ejemplo**

```java
import java.util.*
public class Main{
	public static void main(String[] args){
		System.out.println("Hello world");
	}
}
```

**Salida**

```
Hello world 
```

## Syntax

### Comentarios

Hay tres tipos de comentarios:

#### Comentarios de una sola línea

```Java
// System.out.println("Esto es un comentario");
```

#### Comentarios multilínea

```Java
/* 
System.out.println("Esto es un comentario");
System.out.println("Esto es un comentario");
*/
```

#### Comentarios de documentación

```Java
/** documentacion */
System.out.println("Esto es un comentario");
```

### Extensión de archivos

Todos los archivos de java van a tener una extensión .java es lo único que no debe cambiar en un documento para poder ser reconocido como una clase en este lenguaje.

### Es sensible a mayúsculas y minúsculas

Java es un lenguaje sensible a mayúsculas y minúsculas, por lo que hay que tener cuidado al nombrar variables, llamar objetos, etc.

**Ejemplo**

```Java
System.out.println("Duvan Marin"); // Syntax valida
system.out.println("Duvan marin"); // Syntax invalida porque las clases en general deben empezar en mayusculas, por cierto, el string en las dos lineas es distinto
```

### Nombres de clases 

**Todas** las clases de java deben empezar con una mayúscula 

**Ejemplo**

```Java
class MyJavaProgram    // sintaxis válida
class 1Program         // sintaxis inválida
class My1Program       // sintaxis válida
class $Program         // sintaxis válida, pero desaconsejada
class My$Program       // sintaxis válida, pero desaconsejada (clase interna Program dentro de la clase My)
class myJavaProgram    // sintaxis válida, pero desaconsejada
```



| Column 1   | Column 2   | Column 3   | Column 4   |
|------------|------------|------------|------------|
| abstract   | assert     | boolean    | break      |
| byte       | case       | catch      | char       |
| class      | const      | continue   | default    |
| do         | double     | else       | enum       |
| extends    | final      | finally    | float      |
| for        | goto       | if         | implements |
| import     | instanceof | int        | interface  |
| long       | native     | new        | package    |
| private    | protected  | public     | return     |
| short      | static     | strictfp   | super      |
| switch     | synchronized | this      | throw      |
| throws     | transient  | try        | void       |
| volatile   | while      |            |            |

