package app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Carro;
import app.service.CarroService;

@RestController
@RequestMapping("/api/carro")
public class CarroController {
	
	@Autowired
	private CarroService carroService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Carro carro) {
		try {
			String mensagem = this.carroService.save(carro);
			return new ResponseEntity<String>(mensagem, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Houve o erro: "+e, HttpStatus.BAD_REQUEST);
		}
	}
	
}