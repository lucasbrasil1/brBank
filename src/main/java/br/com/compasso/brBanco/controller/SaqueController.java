package br.com.compasso.brBanco.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.compasso.brBanco.controller.dto.SaqueDto;
import br.com.compasso.brBanco.controller.form.SaqueForm;
import br.com.compasso.brBanco.model.Saque;

@RestController
@RequestMapping("/saque")
public class SaqueController {

	@GetMapping
	public ResponseEntity<?> index(){
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("/{$id}")
	public ResponseEntity<?> index(@RequestBody String id){
		return ResponseEntity.badRequest().build();
	}
	
	@PostMapping
	public ResponseEntity<SaqueDto> saca(@RequestBody @Valid SaqueForm form, UriComponentsBuilder uriBuilder){
		Saque saque = form.converter();
		URI uri = uriBuilder.path("/saque/{$id}").buildAndExpand(saque.getId()).toUri();
		return ResponseEntity.created(uri).body(new SaqueDto(saque));
	}
	
	
}
