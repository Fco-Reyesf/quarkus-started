package org.acme.rest.json.controladores;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.rest.json.entidades.Usuario;
import org.acme.rest.json.servicios.UsuarioServicio.UsuarioService;

@Path("/usuario")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioControlador
{
    @Inject
    UsuarioService usuarioservice;

    @POST
    public Response crearUsuario(Usuario usuario)
    {
        usuarioservice.insertUsuario(usuario);
        return Response.status(201).build();
    }
}
