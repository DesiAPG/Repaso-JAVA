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


### Public static void main(String[] args)

El método main() es el punto principal de nuestra aplicación, donde el proceso empieza y se ejecuta.

### Nombres de métodos

- **Todos** los métodos deben empezar por minúscula como buena práctica.
- Si el método se compone de dos o más palabras, desde la segunda empezaría en mayúsculas cada palabra. 

```Java
public void employeeRecords(){} // Sintaxis valida
public void EmployeeRecords(){} // Sintaxis valida, pero desaconsejada
```

### [[DataTypes, Variables|Identificadores]]

Los identificadores son los nombres de las [[DataTypes, Variables|variables]] en general, como #Variables variables locales, instancias de clases, paquetes, módulos y métodos.

- Se puede empezar en minúscula (case sensitive), por guion bajo o signo de dólar (**$**), no se puede empezar por números o guiones (**-**)

```Java
Legal identifiers: MinNumber, total, ak74, hello_world, $amount, _under_value
Illegal identifiers: 74ak, -amount
```

### Espacios en blanco

Cada línea en blanco que hacemos posiblemente en los comentarios o que simplemente no escribimos nada, java lo va a ignorar.

### Modificadores de acceso

- **Modificadores de acceso:** default, public, protected, private.
- **No son modificadores de acceso:** final, abstract, static, transient, synchronized, volatile, native.


| Modificador de Acceso | Dentro de la Clase | Dentro del Paquete | Fuera del Paquete solo por subclase | Fuera del Paquete |
|----------------------|--------------------|--------------------|------------------------------------|-------------------|
| Private              | Sí                 | No                 | No                                 | No                |
| Default              | Sí                 | Sí                 | No                                 | No                |
| Protected            | Sí                 | Sí                 | Sí                                 | No                |
| Public               | Sí                 | Sí                 | Sí                                 | Sí                |


### Palabras reservadas

Aquí una tabla de las palabras reservadas que tiene java.

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

