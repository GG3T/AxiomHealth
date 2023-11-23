package br.com.maddytec.cliente.repository;

import br.com.maddytec.cliente.entity.Ods;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OdsRepository extends JpaRepository<Ods, Integer> {
    List<Ods> findByCodigo(String codigo);
}
