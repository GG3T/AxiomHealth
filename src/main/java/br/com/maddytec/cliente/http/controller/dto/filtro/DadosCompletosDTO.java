package br.com.maddytec.cliente.http.controller.dto.filtro;

import br.com.maddytec.cliente.entity.Indicador;
import br.com.maddytec.cliente.entity.Meta;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DadosCompletosDTO {
    private String id;
    private Meta objetivo;
    private List<Indicador> indicadores;
}