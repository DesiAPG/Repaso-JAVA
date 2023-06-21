---
creation date: 2023-06-20 21:46
modification date: Tuesday 20th June 2023 21:46:08
---

<< [[2023-06-19]] | [[2023-06-21]] >>

# What is and architecture


## Arquitectura Spring

En Spring Boot, no hay requisitos para la configuración XML (descriptor de implementación).  Utiliza la convención sobre el paradigma de diseño de software de configuración, lo que significa que disminuye el esfuerzo del desarrollador.

El objetivo principal de Spring Boot es reducir el tiempo de desarrollo, prueba unitaria y prueba de integración y aprovechar las siguientes características:

- Cree aplicaciones Spring independientes
- Incruste Tomcat, Jetty o Undertow directamente (no es necesario implementar archivos WAR)
- Proporcione POM de 'inicio' obstinados para simplificar su configuración de Maven
- Configurar Spring automáticamente siempre que sea posible
- Proporcione funciones listas para producción, como métricas, controles de estado y configuración externalizada
- Absolutamente sin generación de código y sin requisitos para la configuración XML

Spring Boot sigue una arquitectura en capas en la que cada capa se comunica con la capa directamente debajo o encima (estructura jerárquica) de ella.  El siguiente diagrama demuestra que cada capa de una aplicación Spring Boot se comunica directamente con la capa justo debajo o encima debido al flujo de trabajo.


