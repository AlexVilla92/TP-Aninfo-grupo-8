$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("horas.features.feature");
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
  "name": "la cantidad total de horas trabajadas para ese desarrollador son \"8\" horas",
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
  "duration": 247538407,
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
  "duration": 132559,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 66
    }
  ],
  "location": "HorasSteps.la_cantidad_total_de_horas_trabajadas_para_ese_desarrollador_son_horas(String)"
});
formatter.result({
  "duration": 6246476,
  "status": "passed"
});
});