#language: en
Feature: Busqueda de contenido en la app de Shein

  Scenario: Busqueda exitosa
    Given que el usuario se encuentra en la app shein
    When desee ver productos
    Then usara la barra de busqueda para encontrar los productos deseados