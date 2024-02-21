package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Carro;

@Service
public class CarroService {
	
	public String save(Carro carro) {
		return carro.getNome() + " foi salvo com sucesso!";
	}
	
	public List<Carro> listAll(){
		List<Carro> listaCarro = new ArrayList<Carro>();
		Carro carroAleatorio = new Carro("Palio", "Fiat", "Hatch");
		listaCarro.add(carroAleatorio);
		carroAleatorio.setNome("Voyage");
		carroAleatorio.setMarca("Volkswagen");
		carroAleatorio.setModelo("Sedan");
		listaCarro.add(carroAleatorio);
		carroAleatorio.setNome("Civic");
		carroAleatorio.setMarca("Honda");
		carroAleatorio.setModelo("Sedan");
		listaCarro.add(carroAleatorio);

		carroAleatorio.setNome("Corolla");
		carroAleatorio.setMarca("Toyota");
		carroAleatorio.setModelo("Sedan");
		listaCarro.add(carroAleatorio);

		carroAleatorio.setNome("Golf");
		carroAleatorio.setMarca("Volkswagen");
		carroAleatorio.setModelo("Hatch");
		listaCarro.add(carroAleatorio);

		carroAleatorio.setNome("Focus");
		carroAleatorio.setMarca("Ford");
		carroAleatorio.setModelo("Hatch");
		listaCarro.add(carroAleatorio);

		carroAleatorio.setNome("Fusion");
		carroAleatorio.setMarca("Ford");
		carroAleatorio.setModelo("Sedan");
		listaCarro.add(carroAleatorio);

		carroAleatorio.setNome("Cruze");
		carroAleatorio.setMarca("Chevrolet");
		carroAleatorio.setModelo("Sedan");
		listaCarro.add(carroAleatorio);

		carroAleatorio.setNome("Onix");
		carroAleatorio.setMarca("Chevrolet");
		carroAleatorio.setModelo("Hatch");
		listaCarro.add(carroAleatorio);

		carroAleatorio.setNome("HB20");
		carroAleatorio.setMarca("Hyundai");
		carroAleatorio.setModelo("Hatch");
		listaCarro.add(carroAleatorio);

		carroAleatorio.setNome("Creta");
		carroAleatorio.setMarca("Hyundai");
		carroAleatorio.setModelo("SUV");
		listaCarro.add(carroAleatorio);
		
		return listaCarro;
	}
}
