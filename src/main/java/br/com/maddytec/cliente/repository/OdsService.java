package br.com.maddytec.cliente.repository;

import br.com.maddytec.cliente.entity.Ods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OdsService {

    private final OdsRepository odsRepository;

    @Autowired
    public OdsService(OdsRepository odsRepository) {
        this.odsRepository = odsRepository;
    }

    // Outros métodos...

    public List<Ods> findOdsByCodigo(String codigo) {
        return odsRepository.findByCodigo(codigo);
    }
}
