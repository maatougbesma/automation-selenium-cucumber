$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentication/Authentication.feature");
formatter.feature({
  "line": 2,
  "name": "Tester la page connexion",
  "description": "ETQ utilisateur je souhaite tester la page connexion",
  "id": "tester-la-page-connexion",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@authentication"
    }
  ]
});
formatter.before({
  "duration": 3217196100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Tester la page connexion - OrangeHRM",
  "description": "",
  "id": "tester-la-page-connexion;tester-la-page-connexion---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Je me connecte sur l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le Username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie le mot de passe",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le bouton Login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je me redirige vers la page Home",
  "keyword": "Then "
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1613389300,
  "status": "passed"
});
});