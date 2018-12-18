package quotes.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import quotes.QuotesStreamHandler;

import java.util.Optional;


public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Bienvenido a \"Frases sobre Chuck Norris\". Me puedes pedir que te cite una frase que define a Chuck Norris como alguien único e irrepetible.";
        return input.getResponseBuilder()
                .withSimpleCard(QuotesStreamHandler.SKILL_TITLE, speechText)
                .withSpeech(speechText)
                .withReprompt(speechText)
                .build();
    }
}
