package com.learning.openai.openai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AiController {

    private OllamaChatModel chatClient;

//    private static final String prompt = "What is Java?";

    public AiController(OllamaChatModel chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/ ")
    public String promtResponse(@RequestParam String prompt){
        String response = chatClient.call(prompt);
        return response;
    }
}
