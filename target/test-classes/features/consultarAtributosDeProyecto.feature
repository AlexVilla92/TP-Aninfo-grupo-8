# language: es
Característica: Se consulta los atributos de un proyecto

  Escenario: Se consulta el estado de un proyecto que se encuentra suspendido
    Dado un proyecto con 3 tareas
    Cuando el recurso "pablo" realiza las tareas con id 1, 2 y 3
    Entonces el estado del proyecto es cambiado a "revision" por el pl

  Escenario: Se consulta la cantidad de horas que consumio un proyecto
    Dado que se crea un proyecto con 3 tareas de 2 horas cada una
    Cuando el recurso "alex" realiza dos tareas en 1 hora cada uno
    Entonces el tiempo consumido del proyecto es 2 y el tiempo restante es 4

  Escenario: Se quiere consultar el estado de un proyecto con parametros incorrectos
    Dado que se crea un proyecto
    Cuando se quiere setear la cantidad de meses estimados con "-3", se lanza una excepcion
    Entonces los atributos siguen siendo por default



