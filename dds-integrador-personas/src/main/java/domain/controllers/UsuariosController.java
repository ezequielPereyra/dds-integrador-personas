package domain.controllers;

import domain.Usuario;
import domain.repositories.Repositorio;
import domain.repositories.factories.FactoryRepositorio;
import jdk.nashorn.internal.ir.RuntimeNode;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;


public class UsuariosController {
    private Repositorio<Usuario> repositorio;

    public UsuariosController(){
        this.repositorio = FactoryRepositorio.get(Usuario.class);
    }

    public String saludar(Request request, Response response){
        return "hola";
    }

    public ModelAndView mostrarTodos(Request request, Response response){
        return new ModelAndView(new HashMap<>(),"home.hbs");
    }

    public ModelAndView actualizarFoto(Request request, Response response) {
        return new ModelAndView(new HashMap<>(),"actualizarfoto.hbs");
    }
    public ModelAndView actualizarDato(Request request, Response response) {
        return new ModelAndView(new HashMap<>(),"actualizarDatos.hbs");
    }
    public ModelAndView menuUsuario(Request request, Response response) {
        return new ModelAndView(new HashMap<>(),"menuUsuario.hbs");
    }
    public ModelAndView iniciarSesion(Request request, Response response) {
        return new ModelAndView(new HashMap<>(),"iniciarSesion.hbs");
    }
    public ModelAndView registrarse(Request request, Response response) {
        return new ModelAndView(new HashMap<>(),"registrarse.hbs");
    }

}
