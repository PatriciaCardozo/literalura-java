# literalura-java
Catálogo de libros en Java usando Spring Boot y API Gutendex
# LiterAlura 📚
Catálogo de libros en Java que utiliza la API Gutendex para obtener información sobre libros y autores.

## Descripción
Este proyecto permite buscar libros por título, listar libros y autores, y consultar autores vivos en un año determinado.  
Está diseñado para interactuar con el usuario mediante la consola y utiliza la API Gutendex para obtener datos en tiempo real.

## Funcionalidades
- Buscar libro por título y guardar en lista interna
- Listar todos los libros buscados
- Listar todos los autores de los libros
- Listar autores vivos en un año específico
- Menú interactivo para el usuario

## Uso de la API real
- La API utilizada es **Gutendex**, un catálogo de libros gratuitos del Project Gutenberg.
- No requiere clave de API.
- Las consultas se hacen usando `ApiClient.java`.

## Tecnologías utilizadas
- Java 17+
- HttpClient (para solicitudes HTTP)
- Jackson (para manejar JSON)
- Programación orientada a objetos
- GitHub

## Estructura del proyecto
src/
- `Main.java` → Punto de entrada del programa y menú
- `Libro.java` → Clase que representa los libros
- `Autor.java` → Clase que representa los autores
- `ApiClient.java` → Cliente HTTP para consultar la API

README.md → Documentación del proyecto  
.gitignore → Archivos ignorados  

## Autor
Patricia
