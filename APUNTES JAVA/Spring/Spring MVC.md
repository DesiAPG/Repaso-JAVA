---
creation date: 2023-07-04 17:33
modification date: Tuesday 4th July 2023 17:33:50
---

<< [[2023-07-03]] | [[2023-07-05]] >>

# Spring MVC

En esta sección no voy a dar muchas explicaciones, va a ser más como un informe de laboratorio, voy a dar una pequeña introducción y después hago un proyecto desde 0.



![[Pasted image 20230704173604.png]]


Spring MVC es un framework de desarrollo web que sigue el patrón de diseño Model-View-Controller (MVC). Proporciona una estructura modular y escalable para construir aplicaciones web basadas en Java. Spring MVC se basa en el principio de [[Dependency injection||inversión de control (IoC)]] y se integra con otros componentes de Spring Framework, como la inyección de dependencias, la gestión transaccional y la seguridad.

El patrón de diseño MVC utilizado por Spring MVC divide la aplicación web en tres componentes principales:

1. Model (Modelo): Representa los datos de la aplicación y las reglas de negocio asociadas. El modelo en Spring MVC puede ser implementado como clases POJO (Plain Old Java Object) o utilizando otros enfoques, como entidades JPA.
2. View (Vista): Es responsable de la presentación de los datos al usuario. En Spring MVC, las vistas generalmente son plantillas (templates) basadas en tecnologías como JSP (JavaServer Pages), Thymeleaf o FreeMarker. Las vistas son responsables de mostrar los datos del modelo y proporcionar una interfaz de usuario adecuada.  
3. Controller (Controlador): Es el componente que maneja las solicitudes del usuario y coordina la interacción entre el modelo y la vista. En Spring MVC, los controladores se implementan como clases anotadas con `@Controller` que manejan las solicitudes HTTP y definen los métodos para procesarlas. Los controladores pueden acceder al modelo, interactuar con servicios y repositorios, y seleccionar la vista apropiada para mostrar los resultados.

Spring MVC se basa en el enfoque de configuración declarativa, lo que permite definir fácilmente rutas, enlaces entre vistas y controladores, y realizar validaciones de entrada. Además, proporciona características como la gestión de formularios, la internacionalización, la subida de archivos y el manejo de excepciones.

## Proyecto

Primero claramente vamos a crear el proyecto
![[Pasted image 20230704173857.png]]

Aquí definimos el nombre y continuación los plug-ins a utilizar:

![[Pasted image 20230704174005.png]]

Luego de esto configuré la base de datos de PostgreSQL directamente desde IntelliJ:

![[Pasted image 20230704174101.png]]

Luego de esto tuve que crear una base de datos en posgre, y lo hice de la siguiente manera:

![[Pasted image 20230704174209.png]]

Como se puede ver en la siguiente imagen
![[Pasted image 20230704175128.png]]

Luego de crear la base de datos, procedí a conectarla a Spring, lo primero que hice fue cambiar la extensión de `Application.properties` a `Applcation.yml` por gusto personal, después de esto puse el código para conectar y configurar Postgres:

![[Pasted image 20230705054424.png]]

Ese código le dice al contenedor de Spring que vamos a ejecutarlo en el puerto 8081, que la fuente de datos va a ser la URL de postgres, con el endpoint de la base de datos que acabo de crear, le especifico mi nombre de usuario y mi contraseña y el driver que voy a usar, por el lado de jpa, le digo que el ddl va a actualizar cuando corramos la aplicación, si hay un cambio al momento de correr la app, se va a actualizar los cambios que se hayan hecho, por otro lado, puse que mostrara el código SQL que se va a ejecutar en la consola, y por último el dialecto que se ajuste al de PostgreSQL15.

Y la aplicación corre correctamente, viéndose que toma en cuenta el `Application.yml` ejecutándose en el puerto 8081.

![[Pasted image 20230705055429.png]]

## Modelo

En este proyecto empiezo por definir y poner en práctica la sección de MVC por modelo. Un modelo en java se podría definir por un simple POJO.

![[Pasted image 20230705060203.png]]

Este es la estructura de directorio que usé para almacenar mi POJO, y en esta voy a empezar a poblarla con datos.

![[Pasted image 20230705061100.png]]

En este código usé las funcionalidades de lombok para evitar boilerplate code o código repetitivo, esto para evitar poner los getters, setters y contructors. Luego con la anotación @Id de Jakarta le digo al persistir los datos, esa variable se va a tener en cuenta como el identificador. En esta imagen también se puede ver como no hay ninguna tabla en nuestra base de datos, por lo que al ejecutarse debería aparecer la tabla 'clubs' como lo especifique en el código.

![[Pasted image 20230705061520.png]]

Ahora continuo con el repositorio, que es una interfaz que me va a proporcionar varios métodos de tipo CRUD e incluso la posibilidad de crear métodos personalizados. Extiendo de JpaRepository y mediante genéricos, le especifico la clase POJO de la app y el tipo de dato que tiene el identificador.

![[Pasted image 20230705063157.png]]

Luego de esto creé la clase ClubDTO con el código muy parecido a la clase POJO. 

![[Pasted image 20230705063528.png]]




