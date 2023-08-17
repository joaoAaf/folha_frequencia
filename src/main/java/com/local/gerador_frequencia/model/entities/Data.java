package com.local.gerador_frequencia.model.entities;

import java.time.LocalDateTime;

public class Data {

    private String nome;
    private String matricula;
    private String cargo;
    private String funcao;
    private String lotacao;
    private String setor;
    private String chefia;
    private String cargoChefia;
    private Integer jornada;
    private Boolean repetir;
    private Boolean aleatorio;
    private LocalDateTime[] dia;

    public Data(String nome, String matricula, String cargo, String funcao, String lotacao, String setor, String chefia,
            String cargoChefia, Integer jornada, Boolean repetir, Boolean aleatorio, LocalDateTime[] dia) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.funcao = funcao;
        this.lotacao = lotacao;
        this.setor = setor;
        this.chefia = chefia;
        this.cargoChefia = cargoChefia;
        this.jornada = jornada;
        this.repetir = repetir;
        this.aleatorio = aleatorio;
        this.dia = dia;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getLotacao() {
        return lotacao;
    }

    public String getSetor() {
        return setor;
    }

    public Integer getJornada() {
        return jornada;
    }

    public Boolean getRepetir() {
        return repetir;
    }

    public Boolean getAleatorio() {
        return aleatorio;
    }

    public LocalDateTime[] getDia() {
        return dia;
    }

    public String getChefia() {
        return chefia;
    }

    public String getCargoChefia() {
        return cargoChefia;
    }

}
