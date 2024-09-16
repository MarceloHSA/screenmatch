package br.com.alura.screenmatch.services;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RObterDados(@JsonAlias("Year") String ano, @JsonAlias("Title") String titulo) {
}
