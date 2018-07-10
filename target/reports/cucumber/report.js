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
  "name": "Se consulta el estado de un proyecto que se encuentra en revision",
  "description": "",
  "id": "se-consulta-los-atributos-de-un-proyecto;se-consulta-el-estado-de-un-proyecto-que-se-encuentra-en-revision",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "un proyecto con id 1, el cual cuenta con 3 tareas de 2 hs de duracion estimadas. cada una",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "el recurso \"pablo\" realiza las tareas con id 1, 2 y 3 en 2 hs cada una",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "el estado del proyecto con id 1, es cambiado a \"revision\" por el lider de proyecto",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 19
    },
    {
      "val": "3",
      "offset": 41
    },
    {
      "val": "2",
      "offset": 53
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.un_proyecto_con_id_el_cual_cuenta_con_tareas_de_hs_de_duracion_estimadas_cada_una(Integer,Integer,Integer)"
});
formatter.result({
  "duration": 249420071,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pablo",
      "offset": 12
    },
    {
      "val": "1",
      "offset": 45
    },
    {
      "val": "2",
      "offset": 48
    },
    {
      "val": "3",
      "offset": 52
    },
    {
      "val": "2",
      "offset": 57
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.el_recurso_realiza_las_tareas_con_id_y_en_hs_cada_una(String,Integer,Integer,Integer,Integer)"
});
formatter.result({
  "duration": 2557229,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    },
    {
      "val": "revision",
      "offset": 48
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.el_estado_del_proyecto_con_id_es_cambiado_a_por_el_lider_de_proyecto(Integer,String)"
});
formatter.result({
  "duration": 2594573,
  "status": "passed"
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
  "name": "el recurso \"alex\" realiza las tareas con id 4 y 5, en 1 hora cada uno",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "el tiempo consumido por el proyecto con id 2 es de 2 hs y el tiempo estimado restante es de 4 hs",
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
  "location": "ConsultarAtributosDeProyectoSteps.que_se_crea_un_proyecto_con_tareas_de_horas_cada_una(Integer,Integer)"
});
formatter.result({
  "duration": 210601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alex",
      "offset": 12
    },
    {
      "val": "4",
      "offset": 44
    },
    {
      "val": "5",
      "offset": 48
    },
    {
      "val": "1",
      "offset": 54
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.el_recurso_realiza_las_tareas_con_id_y_en_hora_cada_uno(String,Integer,Integer,Integer)"
});
formatter.result({
  "duration": 1126021,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 43
    },
    {
      "val": "2",
      "offset": 51
    },
    {
      "val": "4",
      "offset": 92
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.el_tiempo_consumido_por_el_proyecto_con_id_es_de_hs_y_el_tiempo_estimado_restante_es_de_hs(Integer,Integer,Integer)"
});
formatter.result({
  "duration": 402612,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Se quiere consultar el estado de un proyecto seteado con parametros invalidos",
  "description": "",
  "id": "se-consulta-los-atributos-de-un-proyecto;se-quiere-consultar-el-estado-de-un-proyecto-seteado-con-parametros-invalidos",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 15,
  "name": "que se crea un proyecto, aun sin tareas",
  "keyword": "Dado "
});
formatter.step({
  "line": 16,
  "name": "se quiere setear el tiempo estimado del proyecto en meses, con un valor de \"-3\"",
  "keyword": "Cuando "
});
formatter.step({
  "line": 17,
  "name": "el atributo de tiempo estimado del proyecto sigue teniendo el valor por default, es decir 0",
  "keyword": "Entonces "
});
formatter.match({
  "location": "ConsultarAtributosDeProyectoSteps.que_se_crea_un_proyecto_aun_sin_tareas()"
});
formatter.result({
  "duration": 84580,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-3",
      "offset": 76
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.se_quiere_setear_el_tiempo_estimado_del_proyecto_en_meses_con_un_valor_de(String)"
});
formatter.result({
  "duration": 225846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 90
    }
  ],
  "location": "ConsultarAtributosDeProyectoSteps.el_atributo_de_tiempo_estimado_del_proyecto_sigue_teniendo_el_valor_por_default_es_decir(Integer)"
});
formatter.result({
  "duration": 148750,
  "status": "passed"
});
formatter.uri("consultarGastosPorProyecto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    }
  ],
  "line": 2,
  "name": "Se consulta la cantidad de dinero que consumio un proyecto",
  "description": "",
  "id": "se-consulta-la-cantidad-de-dinero-que-consumio-un-proyecto",
  "keyword": "Característica"
});
formatter.scenario({
  "line": 4,
  "name": "Se consulta la cantidad de dinero que consumio un proyecto",
  "description": "",
  "id": "se-consulta-la-cantidad-de-dinero-que-consumio-un-proyecto;se-consulta-la-cantidad-de-dinero-que-consumio-un-proyecto",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 5,
  "name": "un proyecto de 2 meses de duracion",
  "keyword": "Dado "
});
formatter.step({
  "line": 6,
  "name": "a dicho proyecto, se asignan los recursos \"pablo\" y \"alex\" con salarios 12000 y 18000, respectivamente",
  "keyword": "Cuando "
});
formatter.step({
  "line": 7,
  "name": "el costo estimado del proyecto es 2 x (12000 + 18000) \u003d 60000",
  "keyword": "Entonces "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 15
    }
  ],
  "location": "ConsultarGastosPorProyectoSteps.un_proyecto_de_meses_de_duracion(Integer)"
});
formatter.result({
  "duration": 210851,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pablo",
      "offset": 43
    },
    {
      "val": "alex",
      "offset": 53
    },
    {
      "val": "12000",
      "offset": 72
    },
    {
      "val": "18000",
      "offset": 80
    }
  ],
  "location": "ConsultarGastosPorProyectoSteps.a_dicho_proyecto_se_asignan_los_recursos_y_con_salarios_y_respectivamente(String,String,Integer,Integer)"
});
formatter.result({
  "duration": 346319,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 34
    },
    {
      "val": "12000",
      "offset": 39
    },
    {
      "val": "18000",
      "offset": 47
    },
    {
      "val": "60000",
      "offset": 56
    }
  ],
  "location": "ConsultarGastosPorProyectoSteps.el_costo_del_proyecto_es_x(Integer,Integer,Integer,Integer)"
});
formatter.result({
  "duration": 382763,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Se consulta la cantidad de dinero que consumio un proyecto en desarrollo",
  "description": "",
  "id": "se-consulta-la-cantidad-de-dinero-que-consumio-un-proyecto;se-consulta-la-cantidad-de-dinero-que-consumio-un-proyecto-en-desarrollo",
  "type": "scenario",
  "keyword": "Escenario"
});
formatter.step({
  "line": 10,
  "name": "un proyecto de 3 meses de duracion estimada, y 2 mes consumido",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "a dicho proyecto, se asigna el recurso \"pablo\" con un salario de 14000",
  "keyword": "Cuando "
});
formatter.step({
  "line": 12,
  "name": "el costo del proyecto es 2 x 14000 \u003d 28000",
  "keyword": "Entonces "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});