#language:pt
  @simulacao
  Funcionalidade: Simulação de emprestimo e credito

    @SerieA
    Esquema do Cenario: Realizar simulacao com <identificacao>
      Dado  que estou na pagina de simulacao
      Quando passo o valor de mil reais e no prazo de seis meses.
      Entao devo vizualizar o <quantidadeDeParcela> e <valorDaParcela>

      Exemplos:
      |identificacao      |quantidadeDeParcela|valorDaParcela  |
      |R$ 1.000 em 6 vezes|"6x"               |"R$ 271,27"     |

    @SerieA
    Esquema do Cenario: Realizar simulacao com <identificacao>
      Dado  que estou na pagina de simulacao
      Quando passo o valor de R$ quatro mil reais e o prazo de doze mes.
      Entao devo vizualizar o <quantidadeDeParcela> e <valorDaParcela>

      Exemplos:
        |identificacao       |quantidadeDeParcela|valorDaParcela      |
        |R$ 4.000 em 12 vezes|"12x"              |"R$ 478,49"         |
    @SerieA
    Esquema do Cenario: Realizar simulacao com <identificacao>
      Dado  que estou na pagina de simulacao
      Quando passo o valor de seis mil  e o prazo de vinte e quatro vezes.
      Entao devo vizualizar o <quantidadeDeParcela> e <valorDaParcela>

      Exemplos:
        |identificacao       |quantidadeDeParcela|valorDaParcela      |
        |R$ 6.000 em 24 vezes|"24x"              |"R$ 387,89"         |