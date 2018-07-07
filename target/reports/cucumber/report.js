$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("consultarAtributosDeProyecto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "Se consulta los atributos de un proyecto",
  "description": "",
  "id": "se-consulta-los-atributos-de-un-proyecto",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Se consulta el estado de un proyecto que se encuentra suspendido",
  "description": "",
  "id": "se-consulta-los-atributos-de-un-proyecto;se-consulta-el-estado-de-un-proyecto-que-se-encuentra-suspendido",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "un proyecto con 3 tareas",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "el recurso \"pablo\" realiza las tareas con id 1, 2 y 3",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "el estado del proyecto es cambiado a \"revision\" por el pl",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 16
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.un_proyecto_con_tareas(Integer)"
});
formatter.result({
  "duration": 288489539,
  "error_message": "java.lang.NullPointerException\n\tat fiuba.RegistroDeHoras.agregarRegistroProyecto(RegistroDeHoras.java:17)\n\tat fiuba.ConsultarAtributosDeProyectoSteps.un_proyecto_con_tareas(ConsultarAtributosDeProyectoSteps.java:48)\n\tat ✽.Dado un proyecto con 3 tareas(consultarAtributosDeProyecto.feature:5)\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "revision",
      "offset": 38
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.el_estado_del_proyecto_es_cambiado_a_por_el_pl(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 9,
  "name": "Se consulta la cantidad de horas que consumio un proyecto",
  "description": "",
  "id": "se-consulta-los-atributos-de-un-proyecto;se-consulta-la-cantidad-de-horas-que-consumio-un-proyecto",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "que se crea un proyecto con 3 tareas de 2 horas cada una",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "el recurso \"alex\" realiza dos tareas en 1 hora cada uno",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "el tiempo consumido del proyecto es 2 y el tiempo restante es 4",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 28
    },
    {
      "val": "2",
      "offset": 40
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.que_se_crea_un_proyecto_con_tareas_de_horas_cada_una(int,int)"
});
formatter.result({
  "duration": 812342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alex",
      "offset": 12
    },
    {
      "val": "1",
      "offset": 40
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.el_recurso_realiza_dos_tareas_en_hora_cada_uno(String,int)"
});
formatter.result({
  "duration": 1450338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 36
    },
    {
      "val": "4",
      "offset": 62
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.el_tiempo_consumido_del_proyecto_es_y_el_tiempo_restante_es(int,int)"
});
formatter.result({
  "duration": 169128,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Se quiere consultar el estado de un proyecto con parametros incorrectos",
  "description": "",
  "id": "se-consulta-los-atributos-de-un-proyecto;se-quiere-consultar-el-estado-de-un-proyecto-con-parametros-incorrectos",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 15,
  "name": "que se crea un proyecto",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "se quiere setear la cantidad de meses estimados con \"-3\", se lanza una excepcion",
  "keyword": "Cuando "
});
formatter.step({
  "line": 17,
  "name": "los atributos siguen siendo por default",
  "keyword": "Entonces "
});
formatter.match({
  "location": "ConsultarAtributosDeProyectoSteps.que_se_crea_un_proyecto()"
});
formatter.result({
  "duration": 57335,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ConsultarAtributosDeProyectoSteps.los_atributos_siguen_siendo_por_default()"
});
formatter.result({
  "status": "skipped"
});
});