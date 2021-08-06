package cl.nisum.services;

import java.util.Optional;

import cl.nisum.models.entity.Usuario;

public interface UsuarioService {
	
	public Iterable<Usuario> findAll();
	
	public Optional<Usuario> findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void deleteById(Long id);

}
