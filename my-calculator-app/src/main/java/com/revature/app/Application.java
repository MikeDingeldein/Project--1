package com.revature.app;

import com.revature.controller.ArithmeticController;
import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Javalin app = Javalin.create(config -> { // using static create method from javalin
			// this gives us a handle on the Jetty webserver
			config.addStaticFiles("/", Location.CLASSPATH);
		});

		ArithmeticController controller1 = new ArithmeticController(new ArithmeticService());
		controller1.registerEndpoint(app);

		app.start(8080);// start server on 8080, 
		//remember to set postman to http://localhost:8080/

	}

}
