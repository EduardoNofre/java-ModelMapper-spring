package com.api.spring.model.Mapper.app.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.spring.model.Mapper.app.estudo.entity.ModelMapperEntity;

@Repository
public interface ModelMapperRepository extends JpaRepository<ModelMapperEntity, Long>{

}
