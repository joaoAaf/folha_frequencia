package com.local.gerador_frequencia.model.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import com.local.gerador_frequencia.model.dto.DataDTO;
import com.local.gerador_frequencia.model.entities.Data;

@Service
public class DataService {

    public Data DTOForData(DataDTO dataDto) {
        String[] horarios = dataDto.getHorarios().split(",");
        LocalDateTime[] dia = new LocalDateTime[4];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-M-yyyyHH:mmss");

        for (int i = 0; i < 4; i++) {
            String diaString = "01" + "-" + dataDto.getMes() + "-" + dataDto.getAno() + horarios[i] + "00";
            dia[i] = LocalDateTime.parse(diaString, formatter);
        }
        Data data = new Data(dataDto.getNome(), dataDto.getMatricula(), dataDto.getCargo(), dataDto.getFuncao(),
                dataDto.getLotacao(), dataDto.getSetor(), dataDto.getChefia(), dataDto.getCargoChefia(),
                dataDto.getJornada(), dataDto.getRepetir(), dataDto.getAleatorio(), dia);
        return data;
    }

}
