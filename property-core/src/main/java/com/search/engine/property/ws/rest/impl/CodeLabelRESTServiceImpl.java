package com.search.engine.property.ws.rest.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.search.engine.property.core.service.CodeLabelService;
import com.search.engine.property.ws.rest.CodeLabelRESTService;
import com.search.engine.property.ws.rest.model.CodeLabel;

@Component
public class CodeLabelRESTServiceImpl implements CodeLabelRESTService {

	@Autowired
	private CodeLabelService codeLabelService;

	@Override
	public Response getCodeLabels(String code) {
		List<CodeLabel> codeLabels = codeLabelService.getCodeLabels(code);
		return Response.ok(codeLabels).build();
	}
}
