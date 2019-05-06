package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorrisServiceImpl implements ChuckNorrisService {
    @Override
    public String getRandomQuote() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
