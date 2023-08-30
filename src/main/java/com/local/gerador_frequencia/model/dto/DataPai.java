package com.local.gerador_frequencia.model.dto;

public abstract class DataPai {

    private String nome;
    private String matricula;
    private String cargo;
    private String funcao;
    private String lotacao;
    private String setor;
    private String chefia;
    private String cargoChefia;
    private String mes;
    private String ano;
    private Integer jornada;

    public DataPai() {
    }

    public DataPai(DataDTO dataDto) {
        this.nome = dataDto.getNome();
        this.matricula = dataDto.getMatricula();
        this.cargo = dataDto.getCargo();
        this.funcao = dataDto.getFuncao();
        this.lotacao = dataDto.getLotacao();
        this.setor = dataDto.getSetor();
        this.chefia = dataDto.getChefia();
        this.cargoChefia = dataDto.getCargoChefia();
        this.mes = dataDto.getMes();
        this.ano = dataDto.getAno();
        this.jornada = dataDto.getJornada();
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

    public String getChefia() {
        return chefia;
    }

    public void setChefia(String chefia) {
        this.chefia = chefia;
    }

    public String getCargoChefia() {
        return cargoChefia;
    }

    public void setCargoChefia(String cargoChefia) {
        this.cargoChefia = cargoChefia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Integer getJornada() {
        return jornada;
    }

    public void setJornada(Integer jornada) {
        this.jornada = jornada;
    }
    
}

