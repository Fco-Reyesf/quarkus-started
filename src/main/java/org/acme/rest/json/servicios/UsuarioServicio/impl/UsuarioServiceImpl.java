package org.acme.rest.json.servicios.UsuarioServicio.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.acme.rest.json.entidades.Usuario;
import org.acme.rest.json.servicios.UsuarioServicio.UsuarioService;

/*
 Stateful -->  peticion dura hasta que se salga de la maquina
 Stateless --> hace peticion a cada rato
 Singleton --> la peticion queda en memoria del servidor
*/ 
@ApplicationScoped
public class UsuarioServiceImpl implements UsuarioService {
    
    // corta conexion con la BD
    @PersistenceContext
    private EntityManager em;

    //insertar
    @Override
    @Transactional
    public void insertUsuario(Usuario usuario)
    {
        em.persist(usuario);
    }
}
