package cl.nisum.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.nisum.models.entity.Usuario;
import cl.nisum.models.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	
	@Autowired
	private UsuarioRepository repo;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuario> findAll() {
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findById(Long id) {
		return repo.findById(id);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repo.deleteById(id);		
	}

}
