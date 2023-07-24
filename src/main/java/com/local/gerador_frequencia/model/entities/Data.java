package com.local.gerador_frequencia.model.entities;

import java.util.Date;

public class Data {

    private String nome;
    private String matricula;
    private String cargo;
    private String funcao;
    private String lotacao;
    private String setor;
    private Date mes;
    private Integer jornada;
    private Date horarioEntrada;
    private Date horarioSaida;
    private Boolean repetir;
    private Boolean aleatorio;

    public Data () {
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getLotacao() {
        return lotacao;
    }
    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public Date getMes() {
        return mes;
    }
    public void setMes(Date mes) {
        this.mes = mes;
    }
    public Integer getJornada() {
        return jornada;
    }
    public void setJornada(Integer jornada) {
        this.jornada = jornada;
    }
    public Date getHorarioEntrada() {
        return horarioEntrada;
    }
    public void setHorarioEntrada(Date horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }
    public Date getHorarioSaida() {
        return horarioSaida;
    }
    public void setHorarioSaida(Date horarioSaida) {
        this.horarioSaida = horarioSaida;
    }
    public Boolean getRepetir() {
        return repetir;
    }
    public void setRepetir(Boolean repetir) {
        this.repetir = repetir;
    }
    public Boolean getAleatorio() {
        return aleatorio;
    }
    public void setAleatorio(Boolean aleatorio) {
        this.aleatorio = aleatorio;
    }

    @Override
    public String toString() {
        return "Dados [nome=" + nome + ", matricula=" + matricula + ", cargo=" + cargo + ", funcao=" + funcao
                + ", lotacao=" + lotacao + ", setor=" + setor + ", mes=" + mes + ", jornada=" + jornada
                + ", horarioEntrada=" + horarioEntrada + ", horarioSaida=" + horarioSaida + ", repetir=" + repetir
                + ", aleatorio=" + aleatorio + "]";
    }

}

