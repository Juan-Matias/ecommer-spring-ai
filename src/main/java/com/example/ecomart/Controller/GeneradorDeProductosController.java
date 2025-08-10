package com.example.ecomart.Controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generador")
public class GeneradorDeProductosController {

    private final ChatClient chatClient;

    // Constructor
    public GeneradorDeProductosController(ChatClient.Builder chatClienteBuilder) {
        this.chatClient = chatClienteBuilder.build();
    }

    @GetMapping("/ai")
    String generadorDeProductos() {
        var pregunta = "Genera 5 productos ecológicos";
        return this.chatClient.prompt()
                .user(pregunta)
                .call()
                .content();
    }
}


