package com.api.spring.model.Mapper.app.estudo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.spring.model.Mapper.app.estudo.dao.ModelMapperDao;
import com.api.spring.model.Mapper.app.estudo.dto.ModelMapperDto;
import com.api.spring.model.Mapper.app.estudo.entity.ModelMapperEntity;

@Service
public class ModelMapperService {

	@Autowired
	private ModelMapperDao modelMapperDao;

	@Autowired
	private ModelMapper modelMapper;

	public ModelMapperDto buscaIdSemboilerplate(long id) {

		// Aqui neste exemplo não utilizamos o boilerplate e sim o ModelMapper.
		return converterToDto(modelMapperDao.buscaPorIdSemboilerplate(id));
	}

	public ModelMapperDto buscaIdComboilerplate(long id) {

		// entity
		ModelMapperEntity boilerplateEntity = modelMapperDao.buscaPorIdComboilerplate(id);

		// Aqui neste exemplo utilizamos o boilerplate.
		// O que boilerplate?
		// R: É transforma o objeto entity em um DTO como mostra o exemplo abaixo.

		// DTO aqui o boilerplate
		ModelMapperDto boilerplateDto = new ModelMapperDto();
		boilerplateDto.setId(boilerplateEntity.getId());
		boilerplateDto.setEndereco(boilerplateEntity.getEndereco());
		boilerplateDto.setIdade(boilerplateEntity.getIdade());
		boilerplateDto.setNome(boilerplateEntity.getNome());
		boilerplateDto.setTelefone(boilerplateEntity.getTelefone());

		return boilerplateDto;
	}

	public List<ModelMapperDto> listaTodosComboilerplate() {

		// Aqui neste exemplo utilizamos o boilerplate lista.
		// O que boilerplate?
		// R: É transforma o objeto entity em um DTO como mostra o exemplo abaixo.

		List<ModelMapperDto> modelMapperDtoLista = new ArrayList<ModelMapperDto>();

		List<ModelMapperEntity> todos = modelMapperDao.buscaTodos();

		for (ModelMapperEntity boilerplateEntity : todos) {

			// DTO aqui o boilerplate
			ModelMapperDto boilerplateDto = new ModelMapperDto();
			boilerplateDto.setId(boilerplateEntity.getId());
			boilerplateDto.setEndereco(boilerplateEntity.getEndereco());
			boilerplateDto.setIdade(boilerplateEntity.getIdade());
			boilerplateDto.setNome(boilerplateEntity.getNome());
			boilerplateDto.setTelefone(boilerplateEntity.getTelefone());
			modelMapperDtoLista.add(boilerplateDto);
		}

		return modelMapperDtoLista;
	}

	public List<ModelMapperDto> listaTodosSemboilerplate() {

		// Aqui neste exemplo de lista para simplificar utilizamos stream e não
		// utilizamos o boilerplate.
		return modelMapperDao.buscaTodos().stream().map(this::converterToDto).collect(Collectors.toList());
	}

	
	public ModelMapperEntity inserir(String nome, String endereco, String telefone, int idade) {

		ModelMapperDto modelMapperDto = new ModelMapperDto();

		modelMapperDto.setNome(nome);
		modelMapperDto.setEndereco(endereco);
		modelMapperDto.setTelefone(telefone);
		modelMapperDto.setIdade(idade);

		return modelMapperDao.cadastro(converterToEntity(modelMapperDto));
	}

	
	
	private ModelMapperDto converterToDto(ModelMapperEntity modelMapperEntity) {

		return modelMapper.map(modelMapperEntity, ModelMapperDto.class);

	}
	
	private ModelMapperEntity converterToEntity(ModelMapperDto modelMapperDto) {

		return modelMapper.map(modelMapperDto, ModelMapperEntity.class);

	}
}
