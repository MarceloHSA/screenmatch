package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.services.ConsumoAPI;
import br.com.alura.screenmatch.services.ConversorDados;
import br.com.alura.screenmatch.services.RObterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// CONSUMO API
		ConsumoAPI consumoAPI = new ConsumoAPI();
		String teste = consumoAPI.obterDados("https://www.omdbapi.com/?t=the+walking+dead&apikey=69188ef8");
		System.out.println(teste);

		ConversorDados conversor = new ConversorDados();
		System.out.println(conversor.converteDados(teste, RObterDados.class));
	}
}
