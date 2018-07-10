# language: es
Característica: Se consulta la cantidad de dinero que consumio un proyecto

  Escenario: Se consulta la cantidad de dinero que consumio un proyecto
    Dado un proyecto de 2 meses de duracion
    Cuando a dicho proyecto, se asignan los recursos "pablo" y "alex" con salarios 12000 y 18000, respectivamente
    Entonces el costo estimado del proyecto es 2 x (12000 + 18000) = 60000

  Escenario: Se consulta la cantidad de dinero que consumio un proyecto en desarrollo
    Dado un proyecto de 3 meses de duracion estimada, y 2 mes consumido
    Cuando a dicho proyecto, se asigna el recurso "pablo" con un salario de 14000
    Entonces el costo del proyecto es 2 x 14000 = 28000