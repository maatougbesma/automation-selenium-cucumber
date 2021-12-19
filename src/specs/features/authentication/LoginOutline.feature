Feature: Tester la connexion avec un scenario outline
    ETQ utilisateur je souhaite tester la page connexion

  @loginoutline 
  Scenario Outline: Tester la connexion avec un scenario outline
    Given Je me connecte sur l'application OrangeHRM
    When Je saisie le username "<username>"
    And Je saisie le password "<password>"
    And Je clique sur le bouton Login

    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | Besma    | Besma123  |
      | Besmaa   | Besma1234 |
