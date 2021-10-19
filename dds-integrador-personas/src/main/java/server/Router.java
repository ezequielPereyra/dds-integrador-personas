package server;

import domain.controllers.UsuariosController;
import spark.ResponseTransformer;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.utils.BooleanHelper;
import spark.utils.HandlebarsTemplateEngineBuilder;

public class Router {
    private static HandlebarsTemplateEngine engine;

    private static void initEngine() {
        Router.engine = HandlebarsTemplateEngineBuilder
                .create()
                .withDefaultHelpers()
                .withHelper("isTrue", BooleanHelper.isTrue)
                .build();
    }

    public static void init() {
        Router.initEngine();
        Spark.staticFileLocation("/public");
        Router.configure();
    }

    private static void configure(){

        UsuariosController controller = new UsuariosController();
        Spark.get("/home", controller::mostrarTodos,Router.engine);
        Spark.get("/actualizarFoto", controller::actualizarFoto,Router.engine);
        Spark.get("/actualizarDato", controller::actualizarDato,Router.engine);
        Spark.get("/iniciarSesion", controller::iniciarSesion,Router.engine);
        Spark.get("/registrarse", controller::registrarse,Router.engine);
        Spark.get("/menuUsuario", controller::menuUsuario,Router.engine);
    }
}