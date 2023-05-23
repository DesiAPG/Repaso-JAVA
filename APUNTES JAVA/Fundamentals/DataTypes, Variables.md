---
creation date: 2023-05-23 11:39
modification date: Tuesday 23rd May 2023 11:39:50
---

<< [[2023-05-22]] | [[2023-05-24]] >>

# DataTypes and Variables


Una variable es un contenedor que almacena los valores de los datos mientras la ejecución del programa. Cada variable es asignada mediante el tipo de dato que queremos almacenar.

Para usar una variable, solo se requieren dos pasos:

- Declarar la variable
- Inicializar la variable

## Declarar la variable

Para declarar la [[Basic syntax|variable]] lo único que se necesita es especificar el tipo de variable y el nombre que le queremos dar:

![[Pasted image 20230523142729.png]]

**Ejemplo** 

```Java
int a,b,c;
float pi;
double d;
char a;
```

## Inicializar la variable

Para inicializar la variable, lo único que se debe hacer es, asignarle un valor.


![[Pasted image 20230523143451.png]]


```Java
pi =3.14f;
do =20.22d;
a=’v’;
```


Pero también se pueden hacer los dos pasos en una línea de código, por ejemplo, para declarar e inicializar una variable en una línea de código se haría de la siguiente forma.

```Java
int a = 2,b = 1,c = 3;
float pi = 3.14f;
double do = 20.22d;
char a = ’v’;
```


## Tipos de #Variables 

En java existen los siguientes tipos de variables.

- Variables locales
- Variables de instancia
- Variables estáticas

1)  **Variables locales** 
	 Las variables locales son una variable que se declara dentro del cuerpo de un método.
 
2) **Variables de instancia** 
	 Las variables de instancia se definen sin la palabra clave STATIC. Se definen fuera de una declaración de método. Son específicos de objetos y se conocen como variables de instancia.

3) **Variables estáticas** 
	Las variables estáticas se inicializan una sola vez, al inicio de la ejecución del programa. Estas variables deben inicializarse primero, antes de la inicialización de cualquier variable de instancia.

```Java
class DataTypes {
    static int a = 1; //static variable  
    int data = 99; //instance variable  
    void method() {
        int b = 90; //local variable  
    }
}
```

## Tipos de datos en java

Los tipos de variables en java se dividen en dos:

- **Primitivos**
- **No primitivos**


![[Pasted image 20230523150815.png]]

### Primitivos

Los datos primitivos de java son los que están predefinidos en el lenguaje, los que java los reconoce directamente sin compartir el estado con otros valores primitivos, dentro de estos tipos de datos se encuentran:

- Booleanos
- Char
- Bytes
- Shorts
- Ints
- Longs
- Floats
- Doubles
![[Pasted image 20230523151206.png]]

### Casteo de variables y conversión

Una variable de un tipo, puede recibir un valor de otro tipo de dato, hay dos casos que podemos presentar:

1) Una variable de menor tamaño es asignada con un valor mayor que la capacidad del tipo de variable.

```Java
double d;
int i = 10;
d = i
```

Para este caso el proceso que hace por detrás java se llama conversión.

2) Cuando una variable de mayor capacidad es asignada a otra variable de menor capacidad.

```Java
double d = 10;
int i;
i = (int) d
```

En estos casos necesitamos decirle a java explícitamente mediante '()' el tipo de dato que vamos a 'castear'.

Con ese ejemplo se puede ver bastante bien como funciona el cast:

```Java
class Demo {
 public static void main(String args[]) {
  byte x;
  int a = 270;
  double b = 128.128;
  System.out.println("int converted to byte");
  x = (byte) a;
  System.out.println("a and x " + a + " " + x);
  System.out.println("double converted to int");
  a = (int) b;
  System.out.println("b and a " + b + " " + a);
  System.out.println("\ndouble converted to byte");
  x = (byte)b;
  System.out.println("b and x " + b + " " + x);
 }
}
```