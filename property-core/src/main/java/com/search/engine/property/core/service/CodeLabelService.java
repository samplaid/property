package com.search.engine.property.core.service;

import java.util.List;

import com.search.engine.property.ws.rest.model.CodeLabel;

public interface CodeLabelService {

	List<CodeLabel> getCodeLabels(String code);
}
