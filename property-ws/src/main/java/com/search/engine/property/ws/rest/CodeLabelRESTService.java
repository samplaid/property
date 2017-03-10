package com.search.engine.property.ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("codeLabel")
@Produces(MediaType.APPLICATION_JSON)
public interface CodeLabelRESTService {

	@GET
	@Path("{code}")
	Response getCodeLabels(@PathParam("code") String code);

}
