# language: es
Característica: Desarrollador carga horas al sistema

  Escenario: Desarrollador con id existente en el sistema
    Dado que el desarrollador tiene una cantidad de horas cargadas de "0"
    Cuando carga "8" horas en el sistema
    Entonces el estado de los atributos del proyecto cambian