package com.api.spring.model.Mapper.app.estudo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.model.Mapper.app.estudo.dto.ModelMapperDto;
import com.api.spring.model.Mapper.app.estudo.entity.ModelMapperEntity;
import com.api.spring.model.Mapper.app.estudo.service.ModelMapperService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@RequestMapping("/api/model-mapper/")
@Tag(name = "Model Mapper Controller", description = "Model Mapper controller API")
@Validated
@RestController
public class ModelMapperController {

	@Autowired
	private ModelMapperService modelMapperService;

	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" 
			+ " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out."
			+ " <br />responseCode = 509, Conflito de dados.")})
	@Operation(summary = "busca pelo Id sem boilerplate", description = "busca pelo Id sem boilerplate", tags = {"busca pelo Id sem boilerplate"})
	@GetMapping(value = "/sem/boilerplate/id/{id}")
	public  ResponseEntity<ModelMapperDto>idSemboilerplate(@Parameter(description = "Nome.", required = true) @PathVariable long id) {

		return new ResponseEntity<ModelMapperDto> (modelMapperService.buscaIdSemboilerplate(id) , HttpStatus.OK);
	}

	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" 
			+ " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out."
			+ " <br />responseCode = 509, Conflito de dados.")})
	@Operation(summary = "busca pelo Id com boilerplate", description = "busca pelo Id com boilerplate", tags = {"busca pelo Id com boilerplate"})
	@GetMapping(value = "/com/boilerplate/id/{id}")
	public  ResponseEntity<ModelMapperDto>idComboilerplate(@Parameter(description = "Nome.", required = true) @PathVariable long id) {

		return new ResponseEntity<ModelMapperDto> (modelMapperService.buscaIdComboilerplate(id), HttpStatus.OK);
	}

	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" 
			+ " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out."
			+ " <br />responseCode = 509, Conflito de dados.") })
	@Operation(summary = "Busca todos lista todos sem boilerplate", description = "Busca todos lista todos sem boilerplate", tags = {"Busca todos lista todos sem boilerplate"})
	@GetMapping(value = "/sem/boilerplate/lista/todos")
	public ResponseEntity<List<ModelMapperDto>>  listaTodosSemboilerplate() {

		return new ResponseEntity<List<ModelMapperDto>>(modelMapperService.listaTodosSemboilerplate(),HttpStatus.OK);

	}

	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" 
			+ " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out."
			+ " <br />responseCode = 509, Conflito de dados.") })
	@Operation(summary = "Busca todos lista todos com boilerplate", description = "Busca todos lista todos com boilerplate", tags = {"Busca todos lista todos com boilerplate"})
	@GetMapping(value = "/com/boilerplate/lista/todos")
	public ResponseEntity<List<ModelMapperDto>>  listaTodosComboilerplate() {		

		return new ResponseEntity<List<ModelMapperDto>>(modelMapperService.listaTodosComboilerplate(),HttpStatus.OK);
	}

	@ApiResponses(value = { @ApiResponse(responseCode = "", description = ""
			+ " <br />responseCode = 200, Encontrado com sucesso"
			+ " <br />responseCode = 400, Erro processar a requisição" 
			+ " <br />responseCode = 401, Não autorizado."
			+ " <br />responseCode = 404, Não encontrado."
			+ " <br />responseCode = 500, Erro interno sem causa mapeada."
			+ " <br />responseCode = 504, Gateway Time-Out."
			+ " <br />responseCode = 509, Conflito de dados.") })
	@Operation(summary = "cadastrar", description = "cadastrar no banco de dados", tags = {"cadastrar"})
	@PutMapping(value = "cadastrar/nome{nome}/endereco{endereco}/ telefone{telefone}/idade{idade}")
	public ResponseEntity<ModelMapperEntity>  cadastro(
			@Parameter(description = "Nome.", required = true) @PathVariable String nome,
			@Parameter(description = "Endereco.", required = true) @PathVariable String endereco,
			@Parameter(description = "Telefone.", required = true) @PathVariable String telefone,
			@Parameter(description = "Idade.", required = true) @PathVariable int idade) {

		return new ResponseEntity<ModelMapperEntity> (modelMapperService.inserir(nome, endereco, telefone, idade), HttpStatus.OK);

	}
}
