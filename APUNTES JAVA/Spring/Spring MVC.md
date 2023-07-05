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