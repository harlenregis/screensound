package br.com.alura.screensound.service;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class ConsultaGemini {
    public static String obterInformacao(String texto) {

        ChatLanguageModel gemini = GoogleAiGeminiChatModel.builder()
                .apiKey(System.getenv("API_KEY_GEMINI"))
                .modelName("gemini-1.5-flash")
                .build();

        String response = gemini.generate("Me fale sobre o artista: " + texto);
        return response;
    }
}
