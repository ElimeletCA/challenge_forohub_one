package com.elimeletca.challenge_forohub_one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elimeletca.challenge_forohub_one.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername (String username);

}
