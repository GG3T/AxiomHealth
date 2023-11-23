package br.com.maddytec.cliente.http.controller;

import br.com.maddytec.cliente.entity.Indicador;
import br.com.maddytec.cliente.entity.Meta;
import br.com.maddytec.cliente.entity.MetaIndicador;
import br.com.maddytec.cliente.exception.ApiResponse;
import br.com.maddytec.cliente.http.controller.dto.filtro.DadosCompletosDTO;
import br.com.maddytec.cliente.repository.IndicadorRepository;
import br.com.maddytec.cliente.repository.MetaIndicadorRepository;
import br.com.maddytec.cliente.repository.MetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class ApiController {

    @Autowired
    private MetaRepository metaRepository;

    @Autowired
    private IndicadorRepository indicadorRepository;

    @Autowired
    private MetaIndicadorRepository metaIndicadorRepository;

    @GetMapping("/objetivos")
    public ResponseEntity<?> getAllData() {
        List<DadosCompletosDTO> dadosCompletos = new ArrayList<>();
        List<Meta> metas = metaRepository.findAll();
        List<MetaIndicador> metaIndicadores = metaIndicadorRepository.findAll();
        try {
            if (metas.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(new ApiResponse("Objetivos não encontrados."));
            }
            for (Meta meta : metas) {
                DadosCompletosDTO dados = new DadosCompletosDTO();
                dados.setId(meta.getId());
                Meta metaSemId = new Meta();
                metaSemId.setGlobal(meta.getGlobal());
                metaSemId.setBrasil(meta.getBrasil());

                dados.setObjetivo(metaSemId);
                List<Indicador> indicadoresRelacionados = new ArrayList<>();
                for (MetaIndicador mi : metaIndicadores) {
                    if (mi.getMeta().getId().equals(meta.getId())) {
                        indicadoresRelacionados.add(mi.getIndicador());
                    }
                }
                dados.setIndicadores(indicadoresRelacionados);
                dadosCompletos.add(dados);
            }
            return new ResponseEntity<>(dadosCompletos, HttpStatus.OK);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse("Erro interno do servidor."));
        }
    }

}
