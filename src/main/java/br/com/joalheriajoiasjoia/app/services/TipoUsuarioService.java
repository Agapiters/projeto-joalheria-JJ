package br.com.joalheriajoiasjoia.app.services;

import br.com.joalheriajoiasjoia.app.entities.TipoUsuario;
import br.com.joalheriajoiasjoia.app.repositories.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;

    public List<TipoUsuario> listarTodos() {
        return tipoUsuarioRepository.findAll();
    }

    public Optional<TipoUsuario> buscarPorId(Long id) {
        return tipoUsuarioRepository.findById(id);
    }

    public TipoUsuario salvar(TipoUsuario tipoUsuario) {
        return tipoUsuarioRepository.save(tipoUsuario);
    }

    public void deletar(Long id) {
        tipoUsuarioRepository.deleteById(id);
    }
}
