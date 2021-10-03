# Ejercicio integrador de Diseño de Sistemas

## Enunciado:

Se nos ha encargado el diseño e implementación de un software para el Área de Relacionamiento del Registro de las Personas. Esta área es la responsable de llevar registro de las personas físicas existentes en la Provincia y las delegaciones/autorizaciones para operar. 

Una delegación es la autorización que una persona realiza a otra para operar en su nombre; por ejemplo, si A desea autorizar a B para que opere digitalmente en su nombre deben estar registrados tanto A como B en el sistema informático, A debe ingresar a la plataforma y autorizar a B y, finalmente, B debe aceptar esa delegación.

El sistema tiene como información de ingreso un JSON con el listado de personas existentes, con su DNI, nombre y apellido. Estos datos no pueden ser modificados por nuestro software ya que son actualizados por sistemas externos.

El alcance del sistema informático que nos fue asignado ha sido el siguiente:
  1.	Registro de nuevo usuario para aquellas personas habilitadas (o sea, existentes en el JSON)
  2.	Ingreso al sistema con usuario y password
  3.	Actualización de datos de la persona: fecha de nacimiento, ciudad y localidad de residencia, foto.
  4.	Autorización de una persona a otra para operar en su nombre. La autorización queda En Espera hasta que dicha delegación es aceptada.
  5.	Aceptación de la autorización del ítem anterior
  6.	Revocación de la autorización del ítem 4
  7.	Revocación de la aceptación del ítem 5
  8.	Reporte de listado de personas 
  9.	Reporte de listado de delegaciones
  10.	Los ítems del punto 8 y 9 sólo podrán ser accedidos por un usuario administrador, cuyo permiso como usuario administrador es cargado directamente desde la base de datos
  11.	Los ítems 3 a 10 sólo puede ser llevados a cabo por personas que hubieran ingresado según ítem 2
  12.	Se debe permitir realizar logout del sistema

Sobre el alcance y requerimientos definidos se solicita:

###	Parte 1
  -	Modelar el Diagrama de Casos de Uso
  -	Modelar el Diagrama de Clases
  -	Modelar el Diagrama de Entidad Relación
  -	Mockup de las interfaces de usuario requeridas para el cumplimiento de los requerimientos

###	Parte 2
  -	Realizar la implementación de software y base de datos, considerando el uso de ORM y Spark, Spring o similar, generando los JSON para la vista

###	Parte 3
  -	Realizar la implementación de interfaces de usuario con HTML y CSS
  -	Estas interfaces de usuario son independientes de la parte 2; por el momento no guardan relación en la implementación entre ellas.

