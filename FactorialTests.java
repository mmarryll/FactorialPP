package com.example.factorial;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactorialTests {

    @Test
    void fact() {
        var controller = new UserController();
        long n=6;
        var result=controller.fact(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.OK, resultStatusCode);
    }
    @Test
    void fact1() {
        var controller = new UserController();
        long n=0;
        var result=controller.fact(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.OK, resultStatusCode);
    }
    @Test
    void fact2() {
        var controller = new UserController();
        long n=-1;
        var result=controller.fact(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.BAD_REQUEST, resultStatusCode);
    }


    @Test
    void facts() {
        var controller = new UserController();
        long n=6;
        var result=controller.facts(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.OK, resultStatusCode);

    }
    @Test
    void facts1() {
        var controller = new UserController();
        long n=1;
        var result=controller.facts(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.OK, resultStatusCode);

    }
    @Test
    void facts2() {
        var controller = new UserController();
        long n=0;
        var result=controller.facts(n);
        var resultStatusCode=result.getStatusCode();
        assertEquals(HttpStatus.BAD_REQUEST, resultStatusCode);

    }
}
