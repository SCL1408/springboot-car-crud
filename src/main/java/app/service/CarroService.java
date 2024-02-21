package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Carro;

@Service
public class CarroService {
	
	private List<Carro> listaCarros;
	
	public CarroService() {
		Carro carroAleatorio = new Carro();
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("Voyage");
		carroAleatorio.setMarca("Volkswagen");
		carroAleatorio.setModelo("Sedan");
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("Civic");
		carroAleatorio.setMarca("Honda");
		carroAleatorio.setModelo("Sedan");
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("Corolla");
		carroAleatorio.setMarca("Toyota");
		carroAleatorio.setModelo("Sedan");
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("Golf");
		carroAleatorio.setMarca("Volkswagen");
		carroAleatorio.setModelo("Hatch");
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("Focus");
		carroAleatorio.setMarca("Ford");
		carroAleatorio.setModelo("Hatch");
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("Fusion");
		carroAleatorio.setMarca("Ford");
		carroAleatorio.setModelo("Sedan");
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("Cruze");
		carroAleatorio.setMarca("Chevrolet");
		carroAleatorio.setModelo("Sedan");
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("Onix");
		carroAleatorio.setMarca("Chevrolet");
		carroAleatorio.setModelo("Hatch");
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("HB20");
		carroAleatorio.setMarca("Hyundai");
		carroAleatorio.setModelo("Hatch");
		this.listaCarros.add(carroAleatorio);
		carroAleatorio.setNome("Creta");
		carroAleatorio.setMarca("Hyundai");
		carroAleatorio.setModelo("SUV");
		this.listaCarros.add(carroAleatorio);
	}
	
	public String save(Carro carro) {
		return carro.getNome() + " foi salvo com sucesso!";
	}
	
	public List<Carro> listAll(){
		
		return this.listaCarros;
	}
}
