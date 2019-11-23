package br.edu.ifsp.scl.calculadorasdmkt.model

interface ConfiguracaoDAO {
    //CRUD, exceto Delete no nosso exemplo
    fun createOrUpdateConfiguracao(configuracao: Configuracao)
    fun readConfiguracao(): Configuracao
}