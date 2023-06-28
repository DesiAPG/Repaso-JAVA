---
creation date: 2023-06-21 22:33
modification date: Wednesday 21st June 2023 22:33:29
---

<< [[2023-06-20]] | [[2023-06-22]] >>

# Spring Teminology

Spring Core es la base de Spring Framework, que proporciona un modelo completo de programación y configuración para aplicaciones basadas en Java.  Estos son algunos términos y conceptos clave relacionados con Spring Core:

- **Beans:** en Spring, un "bean" es un objeto Java que es administrado por el contenedor Spring.  Los beans generalmente se definen mediante metadatos de configuración, que se pueden especificar en XML, anotaciones Java o código Java.
- **Inversión de control (IoC):** uno de los principios fundamentales de Spring es la inversión de control (IoC), lo que significa que el contenedor Spring es responsable de administrar el ciclo de vida de los beans e inyectar sus dependencias.
- **Inyección de dependencia (DI):** Spring usa Inyección de dependencia (DI) para administrar las dependencias entre beans.  En DI, el contenedor proporciona las dependencias de un objeto, en lugar de que el objeto cree o busque sus propias dependencias.
- **Contenedor:** el contenedor Spring es la parte central de Spring Framework, que crea y administra beans y sus dependencias.
- **ApplicationContext:** un ApplicationContext es una implementación del contenedor Spring.  Es responsable de cargar y administrar los metadatos de configuración y crear los beans definidos en esos metadatos.
- **Programación orientada a aspectos (AOP):** Spring admite la programación orientada a aspectos (AOP), que le permite separar las preocupaciones transversales, como el registro o la seguridad, de la lógica comercial de su aplicación.
- **Eventos:** Spring proporciona un modelo de eventos que permite que los beans envíen y reciban eventos.  Esto se usa para desacoplar los beans entre sí, lo que hace que la aplicación se acople más libremente.
- **ApplicationEvent y listener:** Spring admite el modelo de publicación y suscripción para el manejo de eventos, ApplicationEvent define el objeto del evento y el listener es una clase que implementa la interfaz ApplicationListener, escucha el evento específico y toma la acción necesaria.
- **Acceso a datos:** Spring proporciona una abstracción consistente y de alto nivel para el acceso a datos utilizando varios marcos como JDBC, Hibernate, JPA.
- **Transacciones:** Spring proporciona una forma flexible, consistente y fácil de administrar transacciones de forma declarativa con diferentes tecnologías subyacentes, como JPA, JDBC e Hibernate.
- **Ejecución y programación de tareas:** Spring proporciona TaskExecutor y TaskScheduler, lo que brinda una forma conveniente de ejecutar tareas simultáneamente, de forma programada o asíncrona.


# Arquitectura

Spring Boot sigue una arquitectura en capas en la que cada capa se comunica con la capa directamente debajo o encima (estructura jerárquica). Hay cuatro capas en Spring Boot que son las siguientes:

- **Capa de presentación**: maneja las solicitudes HTTP, traduce el parámetro JSON a objeto, autentica la solicitud y la transfiere a la capa de negocio.
- **Business Layer**: La capa de negocio maneja toda la lógica de negocio. Consiste en clases de servicio y utiliza servicios proporcionados por capas de acceso a datos. También realiza autorización y validación.
- **Capa de persistencia**: La capa de persistencia contiene toda la lógica de almacenamiento y traduce los objetos de negocio desde y hacia las filas de la base de datos.
- **Capa de base de datos**: En la capa de base de datos, se realizan operaciones CRUD (crear, recuperar, actualizar, eliminar).

![[1 sd0a5jrfn8lyYCXzimLB5Q.webp]]

![[1 q9aWC1rxS55WUSEOAnvEdw.webp]]



