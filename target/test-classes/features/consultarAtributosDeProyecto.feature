# language: es
Característica: Se consulta los atributos de un proyecto

  Escenario: Se consulta el estado de un proyecto que se encuentra en revision
    Dado un proyecto con id 1, el cual cuenta con 3 tareas de 2 hs de duracion estimadas. cada una
    Cuando el recurso "pablo" realiza las tareas con id 1, 2 y 3 en 2 hs cada una
    Entonces el estado del proyecto con id 1, es cambiado a "revision" por el lider de proyecto

  Escenario: Se consulta la cantidad de horas que consumio un proyecto
    Dado que se crea un proyecto con 3 tareas de 2 horas cada una
    Cuando el recurso "alex" realiza las tareas con id 4 y 5, en 1 hora cada uno
    Entonces el tiempo consumido por el proyecto con id 2 es de 2 hs y el tiempo estimado restante es de 4 hs

  Escenario: Se quiere consultar el estado de un proyecto seteado con parametros invalidos
    Dado que se crea un proyecto, aun sin tareas
    Cuando se quiere setear el tiempo estimado del proyecto en meses, con un valor de "-3"
    Entonces el atributo de tiempo estimado del proyecto sigue teniendo el valor por default, es decir 0



