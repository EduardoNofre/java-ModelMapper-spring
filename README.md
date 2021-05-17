# Converta entidades para dtos sem codigo boilerplate com ModelMapper

### java-ModelMapper-spring

Você vai querer refatorar o seu código depois de conhecer o projeto ModelMapper.
Se você já conhece ou já trabalha com o padrão DTO, sabe que pra converter um objeto de entidade em um DTO gera muito código boilerplate (aqueles códigos repetitivos).

### 1 - Primeiro passo é adicionar a dependência do ModelMapper mavem em seu projeto

````
<dependency>
  <groupId>org.modelmapper</groupId>
  <artifactId>modelmapper</artifactId>
  <version>2.4.2</version>
</dependency>
````


### O que é um boilerplate?
R: Neste meu caso e quando você converte uma entity para um DTO.

### exemplo boilerplate.


		// entity 
		ModelMapperEntity boilerplateEntity = modelMapperService.buscaIdComboilerplate(id);
		
		// DTO 
		ModelMapperDto boilerplateDto = new ModelMapperDto();
		boilerplateDto.setId(boilerplateEntity.getId());
		boilerplateDto.setEndereco(boilerplateEntity.getEndereco());
		boilerplateDto.setIdade(boilerplateEntity.getIdade());
		boilerplateDto.setNome(boilerplateEntity.getNome());
		boilerplateDto.setTelefone(boilerplateEntity.getTelefone());
    
    return boilerplateDto;


creditos: </br>
[Algaworks](https://www.linkedin.com/feed/hashtag/?keywords=modelmapper&highlightedUpdateUrns=urn%3Ali%3Aactivity%3A6799318021534978048) </br>
[Documentação Model Mapper](http://modelmapper.org/getting-started/) </br>
