package com.elimeletca.challenge_forohub_one.dtos;

import java.time.LocalDateTime;
import com.elimeletca.challenge_forohub_one.models.Curso;
import com.elimeletca.challenge_forohub_one.models.Tema;

public record DTODetalleTema(
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Curso curso
) {

    public DTODetalleTema(Tema tema) {
        this(tema.getTitulo(), tema.getMensaje(), tema.getFecha_creacion(), tema.getCurso());
    }
}
