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


A diferencia de C, C++ que tienen un compilador que saca todo en componentes, por ejemplo, si tenemos una clase con dos métodos, el compilador arrojará 3 archivos, uno que es la clase, y los otros dos con los métodos correspondientes por separado, esto después mediante un enlace se unen los tres archivos compilados y nos da el .exe final. Pero con Java ocurre algo diferente, tenemos también un compilador, pero a diferencia de el de C, este nos arroja los archivos .class en bytecode, en este paso no hay ningún tipo de enlace, sino que es la JVM la que entra y lee los tres archivos para hacer el output.

