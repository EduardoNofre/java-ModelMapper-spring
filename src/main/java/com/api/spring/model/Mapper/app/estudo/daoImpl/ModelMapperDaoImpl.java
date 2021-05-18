package com.api.spring.model.Mapper.app.estudo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.spring.model.Mapper.app.estudo.dao.ModelMapperDao;
import com.api.spring.model.Mapper.app.estudo.entity.ModelMapperEntity;
import com.api.spring.model.Mapper.app.estudo.repository.ModelMapperRepository;

@Component
public class ModelMapperDaoImpl implements ModelMapperDao {

	@Autowired
	private ModelMapperRepository modelMapperRepository;

	@Override
	public ModelMapperEntity buscaPorIdSemboilerplate(Long id) {

		return modelMapperRepository.findById(id).get();
	}

	@Override
	public ModelMapperEntity buscaPorIdComboilerplate(Long id) {

		return modelMapperRepository.findById(id).get();
	}

	@Override
	public ModelMapperEntity cadastro(ModelMapperEntity modelMapperEntity) {

		return modelMapperRepository.save(modelMapperEntity);
	}

	@Override
	public List<ModelMapperEntity> buscaTodos() {

		return modelMapperRepository.findAll();

	}

}
