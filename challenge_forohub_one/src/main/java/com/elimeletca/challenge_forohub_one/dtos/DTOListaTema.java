package com.elimeletca.challenge_forohub_one.dtos;

import com.elimeletca.challenge_forohub_one.models.Curso;
import com.elimeletca.challenge_forohub_one.models.Tema;

public record DTOListaTema(
        Long id,
        String titulo,
        String mensaje,
        Curso curso
) {

    public DTOListaTema(Tema tema) {
        this(tema.getId(), tema.getTitulo(), tema.getMensaje(), tema.getCurso());
    }

}
