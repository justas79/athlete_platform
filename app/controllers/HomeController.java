package controllers;

import models.HammerWomen;
import play.Logger;
import play.mvc.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(Http.Request req) {
        Logger.of(this.getClass().getName()).debug("-===== INDEX ====--");
        List<HammerWomen> listAll = HammerWomen.find.all();
        return ok(views.html.index.render(req, listAll));
    }

    public Result men(Http.Request req) {
        return ok(views.html.index.render(req, new ArrayList<>()));
    }

    public Result women() {
        return ok(views.html.women.render());
    }
    
    public Result toplist() {
        return ok(views.html.tutorial.render());
    }

}
