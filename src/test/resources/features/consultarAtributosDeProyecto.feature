# language: es
Característica: Se consulta los atributos de un proyecto

  Escenario: Se consulta el estado y la fecha cambientes de un proyecto
    Dado que se crea el proyecto con los parametros correctos
    Cuando se cambia el estado del proyecto  y la fecha final a "12/12/18"
    Entonces el valor de dichos atributos cambian

  Escenario: Se quiere consultar el estado de un proyecto con parametros incorrectos
    Dado que se crea un proyecto
    Cuando se quiere setear las horas con "-3", se lanza una excepcion
    Entonces los atributos siguen siendo por default

