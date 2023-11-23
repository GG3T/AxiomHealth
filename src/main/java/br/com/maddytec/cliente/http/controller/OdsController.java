package br.com.maddytec.cliente.http.controller;

import br.com.maddytec.cliente.entity.Ods;
import br.com.maddytec.cliente.exception.ApiResponse;
import br.com.maddytec.cliente.repository.OdsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OdsController {

    private final OdsService odsService;

    public OdsController(OdsService odsService) {
        this.odsService = odsService;
    }

    @GetMapping("/indicador/{codigo}")
    public ResponseEntity<?> getOdsByCodigo(@PathVariable String codigo) {
        try {
            List<Ods> results = odsService.findOdsByCodigo(codigo);
            if (results.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(new ApiResponse("Não existe indicador para o código fornecido."));
            }
            return ResponseEntity.ok(results);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ApiResponse("Erro inesperado no servidor"));
        }
    }

}
