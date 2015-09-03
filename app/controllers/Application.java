package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public Result index1() {
        return ok(test.render("teste"));
    }
    
    public Result showRequest() {
        return ok("Got Request"+ request() +" !!");
    }
    
    public Result displayName(String name) {
        return ok("Got Name "+ name +" !!");
    }
    
    public Result redirectToShowRequest() {
        return redirect("/showRequest");
    }

}
