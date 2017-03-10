package com.search.engine.property.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.search.engine.property.core.mapper.CodeLabelMapper;
import com.search.engine.property.core.persistence.entity.CodeLabelEntity;
import com.search.engine.property.core.persistence.repository.CodeLabelRepository;
import com.search.engine.property.core.service.CodeLabelService;
import com.search.engine.property.ws.rest.model.CodeLabel;

@Service
@Transactional
public class CodeLabelServiceImpl implements CodeLabelService {

	@Autowired
	private CodeLabelRepository codeLabelRepository;

	@Override
	public List<CodeLabel> getCodeLabels(String code) {
		List<CodeLabelEntity> codeLabelEntities = codeLabelRepository.findByCode(code);

		return CodeLabelMapper.INSTANCE.asCodeLabels(codeLabelEntities);
	}
}
