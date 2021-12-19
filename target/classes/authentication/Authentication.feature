@authentication
Feature: Tester la page connexion
  ETQ utilisateur je souhaite tester la page connexion

  Background: 
    Given Je me connecte sur l'application OrangeHRM

  @cnx
  Scenario: Tester la page connexion - OrangeHRM
    When Je saisie le Username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page Home "Welcome"

  @logout
  Scenario: Tester la deconnexion - OrangeHRM
    When Je clique sur l'icone bonhomme
    When Je clique sur le bouton Logout
