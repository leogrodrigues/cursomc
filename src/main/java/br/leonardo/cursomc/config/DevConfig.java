package br.leonardo.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;



import br.leonardo.cursomc.services.BDService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private BDService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	
	@Bean
	public boolean instantiateDatabase() throws ParseException{
		
		//pega a configuração do DEVCONFIG para não recriar toda hora o BD
		if(!"create".equals(strategy)) {
			return false;
		}
		
		dbService.instantiateTestDatabase();
		return true;
	}
	
}
