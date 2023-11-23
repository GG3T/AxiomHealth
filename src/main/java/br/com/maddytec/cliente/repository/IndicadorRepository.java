package br.com.maddytec.cliente.repository;

import br.com.maddytec.cliente.entity.Indicador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndicadorRepository extends JpaRepository<Indicador, String> {


}