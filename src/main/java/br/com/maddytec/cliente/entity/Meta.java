package br.com.maddytec.cliente.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Metas")
@Data
@JsonIgnoreProperties("id")
public class Meta {
    @Id
    private String id;

    @Column(name = "objetivo_global", columnDefinition = "TEXT")
    private String global;

    @Column(name = "objetivo_brasil", columnDefinition = "TEXT")
    private String brasil;
}