package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Usuario;

@Service
public interface IUsuarioService{
	public void crear(Usuario usuario);
	public void guardarUsu(Usuario usuario);
	public List<Usuario> listarUsu();
	public Usuario FindById(Long id);
	public Usuario modUsuario(Usuario usuario);
	public void eliminarUsuario(Long id);
}
