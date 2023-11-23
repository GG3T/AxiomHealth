package br.com.maddytec.cliente.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "ods")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "codigo", nullable = false, length = 255)
    private String codigo;

    @Column(name = "regiao", length = 255)
    private String regiao;

    @Column(name = "ano", nullable = false)
    private Integer ano;

    @Column(name = "taxa", nullable = false, length = 380)
    private String taxa;

    @Column(name = "parametro", length = 255)
    private String parametro;

    // Construtores, getters e setters
}
