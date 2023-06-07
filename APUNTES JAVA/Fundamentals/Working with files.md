---
creation date: 2023-06-07 14:26
modification date: Wednesday 7th June 2023 14:26:31
---

<< [[2023-06-06]] | [[2023-06-08]] >>

# Working with files


## API de archivos de Java

Java tiene dos API de archivos.

- La API java.io.File original, disponible desde Java 1.0 (1996).

- La nueva API java.nio.file.Path, disponible desde Java 1.7 (2011).

*¿Cuál es la diferencia entre las API de archivo y ruta?*

La antigua API de archivo se usa en una tonelada de proyectos, marcos y bibliotecas más antiguos.  A pesar de su antigüedad, no está en desuso (y probablemente nunca lo estará) y aún puede usarlo con cualquiera de las últimas versiones de Java.

Sin embargo, java.nio.file.Path hace todo lo que java.io.File puede hacer, pero generalmente de mejor manera y más.  Algunos ejemplos:

- **Características del archivo:** las nuevas clases admiten enlaces simbólicos, atributos de archivo adecuados y soporte de metadatos (PosixFileAttributes), ACL y más.

- **Mejor uso:** por ejemplo, al eliminar un archivo, obtiene una excepción con un mensaje de error significativo (no existe tal archivo, archivo bloqueado, etc.), en lugar de un simple booleano que dice falso.

- **Desacoplamiento:** habilitación del soporte para sistemas de archivos en memoria, que veremos más adelante.




