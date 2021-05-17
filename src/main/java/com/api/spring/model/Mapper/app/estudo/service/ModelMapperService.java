package com.api.spring.model.Mapper.app.estudo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.spring.model.Mapper.app.estudo.dao.ModelMapperDao;
import com.api.spring.model.Mapper.app.estudo.entity.ModelMapperEntity;

@Service
public class ModelMapperService {

	@Autowired
	private ModelMapperDao modelMapperDao;

	public ModelMapperEntity buscaIdSemboilerplate(long id) {

		return modelMapperDao.buscaPorIdSemboilerplate(id);
	}

	public ModelMapperEntity buscaIdComboilerplate(long id) {

		return modelMapperDao.buscaPorIdComboilerplate(id);
	}

	public ModelMapperEntity inserir(String nome, String endereco, String telefone, int idade) {

		ModelMapperEntity modelMapperEntity = new ModelMapperEntity();

		modelMapperEntity.setNome(nome);
		modelMapperEntity.setEndereco(endereco);
		modelMapperEntity.setTelefone(telefone);
		modelMapperEntity.setIdade(idade);

		return modelMapperDao.cadastro(modelMapperEntity);

	}
}
