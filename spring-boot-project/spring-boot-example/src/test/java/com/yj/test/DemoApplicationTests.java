// package com.yj.test;
//
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.example.MessageController;
// import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
// import org.springframework.test.context.junit4.SpringRunner;
// import org.springframework.test.web.reactive.server.WebTestClient;
//
/// **
// * @author yangjing
// *
// * 有可能是源码编译，所以测试用例一直都有问题
// *
// */
//
// @RunWith(SpringRunner.class)
// @WebFluxTest(controllers = MessageController.class)
// public class DemoApplicationTests {
//
// @Autowired
// WebTestClient client;
//
// @Test
// public void getAllMessagesShouldBeOk() {
// client.get().uri("/").exchange().expectStatus().isOk();
// }
//
// }
