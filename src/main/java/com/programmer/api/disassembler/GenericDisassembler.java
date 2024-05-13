package br.gov.ce.sps.sqp.api.disassembler;

import br.gov.ce.sps.sqp.api.input.*;
import br.gov.ce.sps.sqp.domain.model.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GenericDisassembler {

	@Autowired
	private ModelMapper modelMapper;

	public <T, U> U toDomainObject(T entity, Class<U> modelClass) {
		return modelMapper.map(entity, modelClass);
	}
	public <T, U> void copyToDomainObject(T input, U domainObject) {

		modelMapper.map(input, domainObject);
	}
}
