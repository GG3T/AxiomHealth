package br.com.maddytec.cliente.repository;

import br.com.maddytec.cliente.entity.Meta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetaRepository extends JpaRepository<Meta, String> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}