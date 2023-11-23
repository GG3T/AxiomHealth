package br.com.maddytec.cliente.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Metas_Indicadores")
@Data
public class MetaIndicador {
    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "meta_id", referencedColumnName = "id")
    private Meta meta;

    @ManyToOne
    @JoinColumn(name = "indicador_id", referencedColumnName = "indicador_id")
    private Indicador indicador;
}