package cl.nisum.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.nisum.models.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
