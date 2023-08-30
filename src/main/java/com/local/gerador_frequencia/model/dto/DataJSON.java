package com.local.gerador_frequencia.model.dto;

public class DataJSON extends DataPai {

    private String[] horarios;

    public DataJSON(DataDTO dataDto) {
        super(dataDto);
        this.horarios = setHorarios(dataDto);
    }

    public String[] setHorarios(DataDTO dataDto) {
        String[] horarios = dataDto.getHorarios().split(",");
        return horarios;
    }

    public String[] getHorarios() {
        return horarios;
    }
    
}

