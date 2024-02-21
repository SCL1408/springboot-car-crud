package app.service;

import org.springframework.stereotype.Service;

import app.entity.Carro;

@Service
public class CarroService {
	
	public String save(Carro carro) {
		return carro.getNome() + " foi salvo com sucesso!";
	}
}
