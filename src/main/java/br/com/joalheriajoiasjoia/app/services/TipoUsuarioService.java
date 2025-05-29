package br.com.joalheriajoiasjoia.app.services;

import br.com.joalheriajoiasjoia.app.entities.TipoUsuario;
import br.com.joalheriajoiasjoia.app.repositories.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;

    public TipoUsuario saveTipoUsuario(TipoUsuario tipoUsuario) {
        return tipoUsuarioRepository.save(tipoUsuario);
    }

    public List<TipoUsuario> listarTodos() {
        return tipoUsuarioRepository.findAll();
    }

    // Buscar por ID (sem Optional)
    public TipoUsuario getTipoUsuarioById(Long id) {
        return tipoUsuarioRepository.findById(id).orElse(null);
    }

    public TipoUsuario salvar(TipoUsuario tipoUsuario) {
        return tipoUsuarioRepository.save(tipoUsuario);
    }

    public void deletar(Long id) {
        tipoUsuarioRepository.deleteById(id);
    }
}
