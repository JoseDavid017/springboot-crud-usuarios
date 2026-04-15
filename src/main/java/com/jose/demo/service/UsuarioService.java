/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.demo.service;

/**
 *
 * @author JoseAriza12
 */
import com.jose.demo.model.Usuario;
import com.jose.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public Usuario guardar(Usuario u) {
        return repo.save(u);
    }

    public List<Usuario> listar() {
        return repo.findAll();
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }

    public Usuario actualizar(Long id, Usuario nuevo) {
        Usuario u = repo.findById(id).orElse(null);
        if (u != null) {
            u.setNombre(nuevo.getNombre());
            u.setCorreo(nuevo.getCorreo());
            return repo.save(u);
        }
        return null;
    }
}
