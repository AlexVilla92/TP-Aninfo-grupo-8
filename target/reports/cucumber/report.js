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
  "name": "Se consulta el estado y la fecha cambientes de un proyecto",
  "description": "",
  "id": "se-consulta-los-atributos-de-un-proyecto;se-consulta-el-estado-y-la-fecha-cambientes-de-un-proyecto",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "que se crea el proyecto con los parametros correctos",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "se cambia el estado del proyecto  y la fecha final a \"12/12/18\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "el valor de dichos atributos cambian",
  "keyword": "Entonces "
});
formatter.match({
  "location": "ConsultarAtributosDeProyectoSteps.que_se_crea_el_proyecto_con_los_parametros_correctos()"
});
formatter.result({
  "duration": 211099692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12/12/18",
      "offset": 54
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.se_cambia_el_estado_del_proyecto_y_la_fecha_final_a(String)"
});
formatter.result({
  "duration": 9360621,
  "status": "passed"
});
formatter.match({
  "location": "ConsultarAtributosDeProyectoSteps.el_valor_de_dichos_atributos_cambian()"
});
formatter.result({
  "duration": 50381,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Se quiere consultar el estado de un proyecto con parametros incorrectos",
  "description": "",
  "id": "se-consulta-los-atributos-de-un-proyecto;se-quiere-consultar-el-estado-de-un-proyecto-con-parametros-incorrectos",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "que se crea un proyecto",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "se quiere setear las horas con \"-3\", se lanza una excepcion",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "los atributos siguen siendo por default",
  "keyword": "Entonces "
});
formatter.match({
  "location": "ConsultarAtributosDeProyectoSteps.que_se_crea_un_proyecto()"
});
formatter.result({
  "duration": 91338,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-3",
      "offset": 32
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.se_quiere_setear_las_horas_con_se_lanza_una_excepcion(String)"
});
formatter.result({
  "duration": 168068,
  "status": "passed"
});
formatter.match({
  "location": "ConsultarAtributosDeProyectoSteps.los_atributos_siguen_siendo_por_default()"
});
formatter.result({
  "duration": 49888,
  "status": "passed"
});
formatter.uri("horas.features.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "Desarrollador carga horas al sistema",
  "description": "",
  "id": "desarrollador-carga-horas-al-sistema",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Desarrollador con id existente en el sistema",
  "description": "",
  "id": "desarrollador-carga-horas-al-sistema;desarrollador-con-id-existente-en-el-sistema",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "que el desarrollador tiene una cantidad de horas cargadas de \"0\"",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "carga \"8\" horas en el sistema",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "el estado de los atributos del proyecto cambian",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 62
    }
  ],
  "location": "HorasSteps.que_el_desarrollador_tiene_una_cantidad_de_horas_cargadas_de(String)"
});
formatter.result({
  "duration": 15380979,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 7
    }
  ],
  "location": "HorasSteps.carga_horas_en_el_sistema(String)"
});
formatter.result({
  "duration": 125430,
  "status": "passed"
});
formatter.match({
  "location": "ConsultarAtributosDeProyectoSteps.el_estado_de_los_atributos_del_proyecto_cambian()"
});
formatter.result({
  "duration": 380512,
  "status": "passed"
});
});