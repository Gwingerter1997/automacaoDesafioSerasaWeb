package br.com.dasafioSerasa.steps;

import br.com.dasafioSerasa.automacaoWeb.TesteWeb;
import br.com.dasafioSerasa.core.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.After;

import java.sql.SQLException;

import static java.sql.DriverManager.getDriver;

public class Simulacaosteps {
    TesteWeb Teste;
    Driver driver;

    @Dado("que estou na pagina de simulacao")
    public void que_estou_na_pagina_de_simulacao() throws SQLException {
        Teste = new TesteWeb();
        Teste.inicializarTeste();

    }
    @Quando("passo o valor de mil reais e no prazo de seis meses.")
    public void passo_o_valor_de_mil_reais_e_no_prazo_de_seis_meses() {
        Teste.slideValorDeMil();

    }


    @Entao("devo vizualizar o {string} e {string}")
    public void devo_vizualizar_o_e(String prazo, String valor) {
        Teste.validacaoparcela(prazo);
        Teste.validacaoValorParcela(valor);
    }

    @Quando("passo o valor de R$ quatro mil reais e o prazo de doze mes.")
    public void passo_o_valor_de_r$_quatro_mil_reais_e_o_prazo_de_doze_mes() {
        Teste.slideValorDeQuatroMil();
        Teste.slideParcelaDozeVezes();
    }
    @Quando("passo o valor de seis mil  e o prazo de vinte e quatro vezes.")
    public void passo_o_valor_de_seis_mil_e_o_prazo_de_vinte_e_quatro_vezes() {
        Teste.slideValorDeSeisMil();
        Teste.slideParcelaVinteEQuatroVezes();
    }

}
