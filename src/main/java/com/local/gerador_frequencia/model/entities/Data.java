package com.local.gerador_frequencia.model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private String nome;
    private String matricula;
    private String cargo;
    private String funcao;
    private String lotacao;
    private String setor;
    private String mes;
    private String ano;
    private Integer jornada;
    private String horarios;
    private Boolean repetir;
    private Boolean aleatorio;
    private List<LocalDateTime> dia = new ArrayList<>();
    
    public Data() {
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

    public String getHorarios() {
        return horarios;
    }

    public String getHorario(int i) {
        String[] horarios = this.horarios.split(",");
        return horarios[i];
    }
    
    public void setHorarios(String horarios) {
        this.horarios = horarios;
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

    public List<LocalDateTime> getDia() {
        return dia;
    }

    public void setDia() {
        for (int i = 0; i < 4; i++) {
            String dia = this.mes+this.ano+getHorario(i);
            this.dia.add(LocalDateTime.parse(dia,DateTimeFormatter.ofPattern("MMyyyyHH:mm")));
        }
    }
    
}

