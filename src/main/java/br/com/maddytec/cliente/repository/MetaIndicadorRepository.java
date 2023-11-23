package br.com.maddytec.cliente.repository;

import br.com.maddytec.cliente.entity.MetaIndicador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaIndicadorRepository extends JpaRepository<MetaIndicador, String> {

}