package com.api.spring.model.Mapper.app.estudo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ModelMapperEntity")
public class ModelMapperEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Schema(description = "Id.", example = "123", required = true)
	@Column(name="id", length = 2)
	private Long id;
	
	
	@Schema(description = "Nome.", example = "abc", required = true)
	@Size(max = 50)
	@NotNull(message = "O campo nome não pode está nulo.")
	@NotBlank(message = "O campo nome não pode esta em  branco.")
	@NotEmpty(message = "O campo nome não pode está vazio.")
	@Column(name="nome", length = 50)
	private String nome;
	
	
	@Schema(description = "endereco.", example = "abc", required = true)
	@Size(max = 100)
	@Column(name="endereco", length = 100)
	private String endereco;
	
	@Schema(description = "telefone.", example = "abc", required = false)
	@Size(max = 15)
	private String telefone;
	
	
	@Schema(description = "idade.", example = "123", required = true)
	@Size(max = 2)
	@Column(name="idade", length = 2)
	private int idade;

}
