package com.portfolio.clinica_api.medico.entity;

import com.portfolio.clinica_api.especialidad.entity.Especialidad;
import com.portfolio.clinica_api.shared.audit.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "medicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medico extends BaseEntity {

    @NotBlank(message = "El nombre es obligatorio.")
    @Size(max = 100, message = "El nombre no puede superar los 100 caracteres.")
    @Column(nullable = false, length = 100)
    private String nombre;

    @NotBlank(message = "El apellido es obligatorio.")
    @Size(max = 100, message = "El apellido no puede superar los 100 caracteres.")
    @Column(nullable = false, length = 100)
    private String apellido;

    @NotBlank(message = "La matricula es obligatoria.")
    @Size(max = 30, message = "La matricula no puede superar los 30 caracteres.")
    @Column(nullable = false, unique = true, length = 30)
    private String matricula;

    @NotBlank(message = "El email es obligatorio.")
    @Email(message = "El email debe tener un formato valido.")
    @Size(max = 150, message = "El email no puede superar los 150 caracteres.")
    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @NotBlank(message = "El telefono es obligatorio.")
    @Size(max = 30, message = "El telefono no puede superar los 30 caracteres.")
    @Column(nullable = false, length = 30)
    private String telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "especialidad_id", nullable = false)
    private Especialidad especialidad;
    }

