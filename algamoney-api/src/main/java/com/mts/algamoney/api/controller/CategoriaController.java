package com.mts.algamoney.api.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mts.algamoney.api.model.Categoria;
import com.mts.algamoney.api.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}
	/*
	 * melhorando o método retornando header
	 * 
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void criar(@RequestBody Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	*/
	
	@PostMapping
	//@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Categoria> criar(@Valid @RequestBody Categoria categoria, HttpServletResponse response) {
		Categoria categoriaSalva = categoriaRepository.save(categoria);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(categoriaSalva.getCodigo()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(categoriaSalva);
	}
	
	@GetMapping("/{codigo}")
	public Optional<Categoria> buscarPeloCodigo(@PathVariable Long codigo) {
		return categoriaRepository.findById(codigo);
	}
}









