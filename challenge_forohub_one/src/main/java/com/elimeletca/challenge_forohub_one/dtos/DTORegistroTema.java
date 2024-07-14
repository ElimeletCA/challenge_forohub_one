package com.elimeletca.challenge_forohub_one.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.elimeletca.challenge_forohub_one.models.Curso;

public record DTORegistroTema(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull @Valid
        Curso curso
) {
}