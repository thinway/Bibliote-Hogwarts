# Enunciado del ejercicio

El profesor Dumbledore nos ha encargado el desarrollo de una aplicación para gestionar los préstamos de la biblioteca del Castillo de Hogwarts. Como bien sabrás este mágico lugar está lleno de secretos y artefactos sorprendentes. No obstante, el servicio de préstamo gestionado por nuestra aplicación estará limitado en su primera versión a libros, pergaminos, diarios y mapas.

Todos los objetos disponibles en la biblioteca para uso de los estudiantes tienen un código, título y año de publicación. De todos los tipos de artículos de la biblioteca solo los libros y diarios se dan en préstamo. Los pergaminos y mapas, más frágiles y en muchos casos hechizados, no se pueden sacar del propio castillo por cuestiones de seguridad y solo se pueden pedir para ser revisados en las zonas habilitadas para ello dentro de las propias instalaciones de Hogwarts.

Cuando un estudiante solicite un artículo en préstamo los bibliotecarios se lo facilitarán guardando la fecha y el tiempo de duración del préstamo (en días). Tras su uso el usuario procederá a su devolución a la biblioteca y se debe controlar si el préstamo se ha realizado en tiempo correcto o se ha excedido del límite legal.

Los artículos solo disponibles para ser revisados deben ser solicitados por los estudiantes, facilitando la sala ([Lugares de Hogwarts](http://es.harrypotter.wikia.com/wiki/Categor%C3%ADa:Lugares_de_Hogwarts)) donde serán consultados y el profesor que le ha mandado revisar el documento ([Profesores de Hogwarts](http://es.harrypotter.wikia.com/wiki/Profesores_de_Hogwarts)). Cuando el estudiante termine su tarea de consulta deberá comunicarlo al personal de la biblioteca que darán órdenes para la retirada de la sala y el traslado a las estacias de conservación.

Obviamente, cuando cualquiera de las obras se encuentren en préstamo, el sistema debe avisar que la obra no se puede facilitar por encontrarse en ese momento en uso por otro estudiante o profesor.

Realizar una aplicación en Java que ayude a los empleados de la biblioteca en el trabajo diario según se ha explicado en este enunciado.
