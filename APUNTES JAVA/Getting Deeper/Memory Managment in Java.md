---
creation date: 2023-06-07 15:33
modification date: Wednesday 7th June 2023 15:33:00
---

<< [[2023-06-06]] | [[2023-06-08]] >>

# Memory Managment in Java


## Gestión de memoria en Java

 En Java, la gestión de memoria es el proceso de asignación y des asignación de objetos, denominado gestión de memoria.  
 Java gestiona la memoria automáticamente.  Java utiliza un sistema de gestión de memoria automático llamado recolector de basura.  Por lo tanto, no estamos obligados a implementar la lógica de gestión de memoria en nuestra aplicación.  La gestión de memoria de Java se divide en dos partes principales:

- Estructura de memoria JVM
- Funcionamiento del recolector de basura

## Estructura de memoria JVM

 JVM crea varias áreas de datos de tiempo de ejecución en un montón.  Estas áreas se utilizan durante la ejecución del programa.  Las áreas de memoria se destruyen cuando sale JVM, mientras que las áreas de datos se destruyen cuando sale el subproceso.

![[memory-management-in-java.png]]

