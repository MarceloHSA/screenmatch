package br.com.alura.screenmatch.services;

public interface ConversorJSON {
    <T> T converteDados(String json, Class<T> classe);
}
