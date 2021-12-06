@authentication
Feature: Tester la page connexion
  ETQ utilisateur je souhaite tester la page connexion

  @cnx
  Scenario: Tester la page connexion - OrangeHRM
    Given Je me connecte sur l'application OrangeHRM
    When Je saisie le Username
    And Je saisie le mot de passe
    And Je clique sur le bouton Login
    Then Je me redirige vers la page Home