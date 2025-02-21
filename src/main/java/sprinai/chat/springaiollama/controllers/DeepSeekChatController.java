package sprinai.chat.springaiollama.controllers;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DeepSeekChatController {

    private final   OllamaChatModel  chatModel;
    @Autowired
    public DeepSeekChatController(OllamaChatModel ollamaChatModel) {
        this.chatModel = ollamaChatModel;
    }

    @GetMapping("/ai/generate")
    public Map<String,String> generate(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message) {
        return Map.of("generation", this.chatModel.call(message));
    }

}
