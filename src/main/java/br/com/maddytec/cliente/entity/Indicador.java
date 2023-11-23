package br.com.maddytec.cliente.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Indicadores")
@Data
public class Indicador {
    @Id
    @Column(name = "indicador_id")
    private String id;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;
}