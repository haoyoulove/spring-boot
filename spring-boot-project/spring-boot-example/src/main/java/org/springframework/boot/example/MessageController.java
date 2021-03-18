//package org.springframework.boot.example;
//
//import org.springframework.boot.example.bo.Message;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import reactor.core.publisher.Flux;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author yangjing
// */
//
//@Controller
//@RequestMapping
//public class MessageController {
//
//
//	@GetMapping
//	public Flux<Message> allMessages(){
//		return Flux.just(
//				Message.builder().body("hello Spring 5").build(),
//				Message.builder().body("hello Spring Boot 2").build()
//		);
//	}
//
//
//}
