@buzz
Feature: Tester le bouton Buzz
  ETQ utilisateur je souhaite tester le bouton Buzz

  Background: 
    Given Je me connecte sur l'application OrangeHRM
    When Je saisie le Username "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton Login

  @update_status
  Scenario: Tester le bouton - Buzz
    When Je clique sur le bouton Buzz
    And Je saisie le statut "Bonjour"
    And Je clique sur le bouton post
    Then Mon statut sera affiché "Bonjour"