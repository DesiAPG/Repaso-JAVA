---
creation date: 2023-06-23 21:47
modification date: Friday 23rd June 2023 21:47:32
---

<< [[2023-06-22]] | [[2023-06-24]] >>

# Dependency injection 

# ¿Qué es la inyección de dependencias?

==La inyección de dependencias es la capacidad de un objeto para suplir dependencias de otro objeto.

Ahora, estoy bastante seguro, es posible que no haya entendido nada por la definición técnica anterior. Entonces, déjame aclarar la confusión para ti.

Cuando escuchas el término dependencia, ¿qué te viene a la mente?

Obviamente, algo que depende de otra cosa para obtener apoyo, ¿verdad?

Bueno, eso es lo mismo, en el caso de la programación también.

La dependencia en la programación es un enfoque en el que una clase utiliza funcionalidades específicas de otra clase. Entonces, por ejemplo, si considera dos clases A y B, y dice que la clase A usa funcionalidades de la clase B, entonces está implícito que la clase A tiene una dependencia de la clase B. Ahora, si está codificando en Java, debe saber que debe crear una instancia de clase B antes de que los objetos sean utilizados por la clase A.

Entonces, si ahora tengo que definir Inyección de dependencias para usted, entonces el proceso de crear un objeto para alguna otra clase y dejar que la clase use directamente la dependencia se llama Inyección de dependencias. Principalmente tiene tres clases involucradas:

![[1 muhJboMa1mrwDDjRiTopAQ.webp]]

- **Clase de cliente:** Esta es la clase dependiente y depende de la clase Service.
- **Clase de servicio:** Esta clase proporciona un servicio a la clase de cliente.
- **Injector Class:** Esta clase es responsable de insertar el objeto de clase de servicio en la clase de cliente

Ahora que ha entendido qué es la inyección de dependencia, permítame llevarlo a través del principio en el que se basa la inyección de dependencia.

# Inversión de control

Como he mencionado anteriormente, la inversión de control es un principio basado en el cual, se realiza la inyección de dependencias. Además, como su nombre indica, la inversión de control se usa básicamente para invertir diferentes tipos de responsabilidades adicionales de una clase en lugar de la responsabilidad principal.

Si tengo que explicarte en términos más simples, entonces considera un ejemplo, en el que tienes la capacidad de cocinar. De acuerdo con el principio de IoC, puede invertir el control, por lo que en lugar de cocinar alimentos, puede ordenar directamente desde afuera, donde recibe alimentos en su puerta. Por lo tanto, el proceso de comida que se le entrega en su puerta se llama Inversión de Control.

No tiene que cocinar usted mismo, en cambio, puede pedir la comida y dejar que un ejecutivo de entrega le entregue la comida. De esta manera, no tiene que ocuparse de las responsabilidades adicionales y solo concentrarse en el trabajo principal.

Ahora que conoces el principio detrás de la inyección de dependencia, déjame llevarte a través de los tipos de inyección de dependencia.

# Tipos de inyección de dependencias

Hay principalmente tres tipos de inyección de dependencia:

- **Inyección constructor:** En este tipo de inyección, el inyector proporciona dependencia a través del constructor de clase cliente.
- **Inyección de setter / Inyección de propiedades:** En este tipo de inyección, el método inyector inyecta la dependencia al método setter expuesto por el cliente.
- **Inyección de interfaz:** En este tipo de inyección, el inyector utiliza Interface para proporcionar dependencia a la clase de cliente. Los clientes deben implementar una interfaz que exponga un método setter que acepte la dependencia.

Hasta ahora, espero que haya entendido el hecho de que la inyección de dependencias es responsable de crear objetos, comprender qué clases requieren esos objetos y, finalmente, proporcionar esas clases con los objetos. Entonces, en ese sentido, veamos a continuación los beneficios de la inyección de dependencia.




