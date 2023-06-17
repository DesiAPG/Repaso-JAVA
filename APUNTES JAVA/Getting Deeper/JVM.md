---
creation date: 2023-06-16 22:25
modification date: Friday 16th June 2023 22:25:58
---

<< [[2023-06-15]] | [[2023-06-17]] >>

# Java Virtual Machine

Arquitectura JVM (Java Virtual Machine)

máquina virtual de Java
Arquitectura interna de JVM

JVM (Java Virtual Machine) es una máquina abstracta.  Es una especificación que proporciona un entorno de tiempo de ejecución en el que se puede ejecutar el código de bytes de Java.

Las JVM están disponibles para muchas plataformas de hardware y software (es decir, la JVM depende de la plataforma).

## ¿Qué es JVM?

Es:

- Una especificación donde se especifica el funcionamiento de Java Virtual Machine.  Pero el proveedor de implementación es independiente para elegir el algoritmo.  Su implementación ha corrido a cargo de Oracle y otras empresas.
- Una implementación Su implementación se conoce como JRE (Java Runtime Environment).
- Instancia de tiempo de ejecución Cada vez que escribe un comando java en el símbolo del sistema para ejecutar la clase java, se crea una instancia de JVM.

## Que hace

### La JVM realiza la siguiente operación:

- Código de cargas
- Verifica el código
- Ejecuta código
- Proporciona un entorno de tiempo de ejecución

### JVM proporciona definiciones para:

- Área de memoria
- formato de archivo de clase
- Conjunto de registro
- Montón de basura recolectada
- Informes de errores fatales, etc.

### Arquitectura JVM

Comprendamos la arquitectura interna de JVM.  Contiene cargador de clases, área de memoria, motor de ejecución, etc.

![[jvm-architecture.png]]




