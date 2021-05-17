package com.api.spring.model.Mapper.app.estudo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ModelMapperDto {

	private Long id;
	private String nome;
	private String endereco;
	private String telefone;
	private int idade;
}
