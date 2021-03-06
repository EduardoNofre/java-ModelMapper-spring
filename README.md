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

### Exemplo com boilerplate.

````
// Entity 
ModelMapperEntity boilerplateEntity = modelMapperService.buscaIdComboilerplate(id);

// Transformando Entity em DTO
ModelMapperDto boilerplateDto = new ModelMapperDto();
boilerplateDto.setId(boilerplateEntity.getId());
boilerplateDto.setEndereco(boilerplateEntity.getEndereco());
boilerplateDto.setIdade(boilerplateEntity.getIdade());
boilerplateDto.setNome(boilerplateEntity.getNome());
boilerplateDto.setTelefone(boilerplateEntity.getTelefone());

// Retorna um DTO
return boilerplateDto;
````

### Exemplo sem boilerplate utilizando o ModelMapper;
````
// Entity 
ModelMapperEntity boilerplateEntity = modelMapperService.buscaIdComboilerplate(id);
// Retorna um DTO
return modelMapper.map(modelMapperService.buscaIdSemboilerplate(id), ModelMapperDto.class);

muito mais simples sem aquela preocupação de set mais ou menos o proprio ModelMapper trata isso de forma abstrata.
````

Com o ModelMapper podemos conveter um Dto para Entity e um Entity para Dto.

creditos: </br>
[Algaworks](https://www.linkedin.com/feed/hashtag/?keywords=modelmapper&highlightedUpdateUrns=urn%3Ali%3Aactivity%3A6799318021534978048) </br>
[Documentação Model Mapper](http://modelmapper.org/getting-started/) </br>
