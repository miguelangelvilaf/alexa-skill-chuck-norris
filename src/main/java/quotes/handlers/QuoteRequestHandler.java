package quotes.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import quotes.Quote;
import quotes.QuoteService;
import quotes.QuotesStreamHandler;

import java.util.Optional;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuoteRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("QuoteIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        Quote q = QuoteService.randomQuote();

        List<String> RESPUESTAS = Arrays.asList(
            "Aquí tienes una frase que define a la perfección a Chuck Norris: \"" + q.getText() + "\".",
            "A ver que te parece ésta: \"" + q.getText() + "\".",
            "Ésta frase me gusta mucho: \"" + q.getText() + "\".",
            "Aquí tienes una: \"" + q.getText() + "\".",
            "\"" + q.getText() + "\""
        );
        Collections.shuffle(RESPUESTAS);
        String speechText = RESPUESTAS.get(0);
        //String speechText = "Aquí tienes una frase que define a Chuck Norris: \"" + q.getText() + "\".";
        //String speechText = q.getText();
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(QuotesStreamHandler.SKILL_TITLE, speechText)
                .withShouldEndSession(false)
                .build();
    }
}
