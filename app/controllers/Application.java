package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.message;

public class Application extends Controller {

    public static Result index() {
        //return ok("Your new application is ready.");
       //return ok( "Hello, Play!" );
       return ok(index.render( ));
       //return ok(message.render.( ));
    }
    
    public static Result message() {
       //return ok(message.render( ));
       //return ok(message.render());
       return ok(message.render());  
    }
}