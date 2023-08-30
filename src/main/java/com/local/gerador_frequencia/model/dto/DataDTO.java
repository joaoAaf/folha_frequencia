package com.local.gerador_frequencia.model.dto;

public class DataDTO extends DataPai {

    private String horarios;
    private Boolean repetir;
    private Boolean aleatorio;
    private Boolean salvar;

    public DataDTO() {
    }

    public String getHorarios() {
        return horarios;
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

    public Boolean getSalvar() {
        return salvar;
    }

    public void setSalvar(Boolean salvar) {
        this.salvar = salvar;
    }
    
}

