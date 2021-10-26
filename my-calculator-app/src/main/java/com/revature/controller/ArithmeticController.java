package com.revature.controller;

import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.Handler;


public class ArithmeticController {

	public ArithmeticService arithmeticService;

	public ArithmeticController(ArithmeticService arithmeticService) {
		this.arithmeticService = arithmeticService;
	}

	public Handler add = (ctx) -> {
		//ctx.result("add lambda invoked");
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		ctx.result(arithmeticService.doAddition(number1String, number2String));
	};
	public Handler subtract = (ctx) -> {
		//ctx.result("subtract lambda invoked");
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		ctx.result(arithmeticService.doSubtract(number1String, number2String));
	};
	public Handler multiply = (ctx) -> {
		//ctx.result("multiply lambda invoked");
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		ctx.result(arithmeticService.doMultiply(number1String, number2String));
	};
	public Handler divide = (ctx) -> {
		//ctx.result("divide lambda invoked");
		String number1String = ctx.formParam("number1");
		String number2String = ctx.formParam("number2");
		ctx.result(arithmeticService.doDivide(number1String, number2String));
	};

	public void registerEndpoint(Javalin app) {
		app.post("/add", add);
		app.post("/subtract", subtract);
		app.post("/multiply", multiply);
		app.post("/divide", divide);
	}

}
