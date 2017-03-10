package com.search.engine.property.core.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.search.engine.property.core.persistence.entity.CodeLabelEntity;
import com.search.engine.property.ws.rest.model.CodeLabel;

@Mapper
public interface CodeLabelMapper {

	CodeLabelMapper INSTANCE = Mappers.getMapper(CodeLabelMapper.class);

	CodeLabel asCodeLabel(CodeLabelEntity in);

	List<CodeLabel> asCodeLabels(List<CodeLabelEntity> in);

}
