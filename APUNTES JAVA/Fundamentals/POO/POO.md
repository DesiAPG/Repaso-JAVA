---
creation date: 2023-06-01 22:41
modification date: Thursday 1st June 2023 22:41:49
---

<< [[2023-05-31]] | [[2023-06-02]] >>

# Programación Orientada a Objetos

Como sugiere el nombre, la programación orientada a objetos o POO se refiere a lenguajes que usan objetos en la programación, usan objetos como fuente principal para implementar lo que sucederá en el código.  Los objetos son vistos por el espectador o usuario, realizando tareas asignadas por usted.  La programación orientada a objetos tiene como objetivo implementar entidades del mundo real como herencia, ocultación, polimorfismo, etc. en la programación.  El objetivo principal de POO es unir los datos y las funciones que operan en ellos para que ninguna otra parte del código pueda acceder a estos datos, excepto esa función.

Para declarar un [[Methods|método]] que ya pudimos ver en un apunte dedicado a ello, de igual forma acá estan los 6 componentes para hacerlo:

- **Modificador de acceso:** define el tipo de acceso del método, es decir, desde dónde se puede acceder en su aplicación.  En Java, hay 4 tipos de especificadores de acceso: 

	- *public:* Accesible en todas las clases en su aplicación.
	- *protected:* Accesible dentro del paquete en el que se define y en su(s) subclase(s) (incluidas las subclases declaradas fuera del paquete).
	- *Privado:* Accesible solo dentro de la clase en la que está definido.
	- *Predeterminado (declarado/definido sin usar ningún modificador):* Accesible dentro de la misma clase y paquete dentro del cual se define su clase.

- **El tipo de devolución:** el tipo de datos del valor devuelto por el método o nulo si no devuelve un valor.
- **Nombre del método:** las reglas para los nombres de los campos también se aplican a los nombres de los métodos, pero la convención es un poco diferente.
- **Lista de parámetros:** lista separada por comas de los parámetros de entrada que se definen, precedidos por su tipo de datos, entre paréntesis adjuntos.  Si no hay parámetros, debe usar paréntesis vacíos ().
- **Lista de excepciones:** las excepciones que espera que arroje el método.  Puede especificar estas excepciones.
- **Cuerpo del método:** es el bloque de código, encerrado entre llaves, que debe ejecutar para realizar las operaciones previstas.








