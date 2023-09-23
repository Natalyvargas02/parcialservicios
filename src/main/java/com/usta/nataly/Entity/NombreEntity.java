package com.usta.nataly.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "nombre")
public class NombreEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Long idpersona;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
}
