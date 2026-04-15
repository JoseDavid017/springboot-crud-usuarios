/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.demo.controller;

/**
 *
 * @author JoseAriza12
 */

import com.jose.demo.model.Usuario;
import com.jose.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired //Spring inyecta automaticamente esta clase
    private UsuarioService service;
    
    //ResponseEntity manera de responder http -devolver datos y controlar estado
    @PostMapping
    public ResponseEntity<Usuario> crear(@RequestBody Usuario u) {
        Usuario nuevo = service.guardar(u);
        return ResponseEntity.ok(nuevo);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.ok("Usuario eliminado");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody Usuario u) {
        Usuario actualizado = service.actualizar(id, u);

        if (actualizado == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(actualizado);
    }
}

