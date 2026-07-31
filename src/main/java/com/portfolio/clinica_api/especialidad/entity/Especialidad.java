package com.portfolio.clinica_api.especialidad.entity;

import com.portfolio.clinica_api.shared.audit.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "especialidades")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Especialidad extends BaseEntity {

    @NotBlank(message = "El nombre de la especialidad es obligatorio.")
    @Size(max = 100, message = "La especialidad no debe superar los 100 caracteres.")
    @Column(nullable = false, unique = true, length = 100)
    private String nombre;
}
