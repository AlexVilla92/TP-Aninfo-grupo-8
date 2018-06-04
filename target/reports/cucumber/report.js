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