package com.programmer.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GenericAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public <T, U> U toModel(T entity, Class<U> modelClass) {
		return modelMapper.map(entity, modelClass);
	}

	public <T, U> List<U> toCollectionModel(List<T> entities, Class<U> modelClass) {
		return entities.stream().map(entity -> toModel(entity, modelClass)).collect(Collectors.toList());
	}

	public <T, U> U toEntity(T input, Class<U> entityClass) {
		return modelMapper.map(input, entityClass);
	}
}