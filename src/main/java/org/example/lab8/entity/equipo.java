package org.example.lab8.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "equipos")
public class equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "El nombre del equipo debe ser único")
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull(message = "El tag debe ser único y tener entre 2 y 5 caracteres")
    @Column(name = "tag_equipo", nullable = false)
    private String tag_equipo;

    @NotBlank(message = "La cantidad de jugadores debe estar entre 5 y 1")
    @Column(name = "cantidad_jugadores", nullable = false, unique = true)
    private String cantidad_jugadores;

    @NotBlank(message = "El correo debe tener un formato válido")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @NotBlank(message = "El teléfono debe contener 9 dígitos")
    @Column(name = "telefono", nullable = false, unique = true)
    private String telefono;

}
