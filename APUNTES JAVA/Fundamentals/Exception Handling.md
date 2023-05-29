---
creation date: 2023-05-27 22:27
modification date: Saturday 27th May 2023 22:27:05
---

<< [[2023-05-26]] | [[2023-05-28]] >>

# Exception Handling

El manejo de excepciones en Java es uno de los medios efectivos para manejar los errores de tiempo de ejecución para que se pueda preservar el flujo regular de la aplicación.  El manejo de excepciones de Java es un mecanismo para manejar errores de tiempo de ejecución como ClassNotFoundException, IOException, SQLException, RemoteException, etc.

Razones principales por las que ocurre una excepción:

- Entrada de usuario no válida
- Fallo del dispositivo
- Pérdida de conexión de red
- Limitaciones físicas (sin memoria de disco)
- Errores de código
- Abrir un archivo no disponible

## Tipos de excepciones


Las excepciones se pueden categorizar de dos maneras:
- Excepciones integradas 
	- Excepción marcada 
	- Excepción no verificada 
- Excepciones definidas por el usuario

![[Group21-660x330.jpg]]


Las **excepciones integradas** son las excepciones que están disponibles en las bibliotecas de Java.  

Estas excepciones son adecuadas para explicar ciertas situaciones de error.

- Excepciones verificadas: las excepciones verificadas se denominan excepciones en tiempo de compilación porque el compilador verifica estas excepciones en tiempo de compilación.
     
- Excepciones no verificadas: las excepciones no verificadas son justo lo contrario de las excepciones verificadas.  El compilador no verificará estas excepciones en tiempo de compilación.  En palabras simples, si un programa arroja una excepción no verificada, e incluso si no la manejamos ni la declaramos, el programa no generará un error de compilación.

**Excepciones definidas por el usuario**:

 A veces, las excepciones integradas en Java no pueden describir una situación determinada.  En tales casos, los usuarios también pueden crear excepciones, que se denominan 'Excepciones definidas por el usuario'. 

 Las ventajas del manejo de excepciones en Java son las siguientes:

- Provisión para Completar la Ejecución del Programa.
- Fácil identificación del código de programa y el código de manejo de errores.
- Propagación de errores.
- Informes de errores significativos.
- Identificación de tipos de errores.

Un ejemplo de manejo de excepciones puede ser esta simple demostración.

```Java
package Exceptions;  
  
public class ExHandling {  
    public static void main(String[] args) {  
        try {  
            int a = 13;  
            int b = 0;  
            System.out.println(a / b);  
        } catch (Exception e) {  
            System.out.println(e);  
        }  
    }  
}
```

En este ejemplo hacemos que nos dé una excepción en este caso aritmética, ya que un número no se puede dividir por 0 por lo que nos da como output:

```Shell
java.lang.ArithmeticException: / by zero
```


