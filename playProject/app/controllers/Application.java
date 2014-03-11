package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public static Result product() {
    	return ok(product.render("A product"));
    }
    public static Result products() {
    	return ok(products.render("My products"));
    }
    
    public static Result category() {
    	return ok(category.render("A Category"));
    }
    
    public static Result shoppingBasket() {
    	return ok(shoppingBasket.render("A shopping Basket"));
    }
    
    

}
