@tag
Feature: Celulares


  @tag1
  Scenario Outline: consultar celular y validar precios
    Given que ingreso a la pagina falabella <Pagina>
    When consulto un celular "<Consulta>"
    And lo agrego al carro de compras
    Then valido los precios
    Examples:
      | Pagina  | Consulta |
      |Falabella|Celulares |


