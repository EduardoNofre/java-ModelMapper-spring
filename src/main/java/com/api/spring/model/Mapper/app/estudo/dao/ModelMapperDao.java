package com.api.spring.model.Mapper.app.estudo.dao;

import com.api.spring.model.Mapper.app.estudo.entity.ModelMapperEntity;

public interface ModelMapperDao {

	ModelMapperEntity buscaPorIdSemboilerplate(Long id);
	
	ModelMapperEntity buscaPorIdComboilerplate(Long id);
	
	ModelMapperEntity cadastro(ModelMapperEntity modelMapperEntity);
	
}
