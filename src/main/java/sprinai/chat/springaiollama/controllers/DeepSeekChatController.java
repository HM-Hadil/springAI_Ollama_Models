package sprinai.chat.springaiollama.controllers;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeepSeekChatController {

    private final   OllamaChatModel  ollamaChatModel;
    @Autowired
    public DeepSeekChatController(OllamaChatModel ollamaChatModel) {
        this.ollamaChatModel = ollamaChatModel;
    }
}
