package com.myproject.rs;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myproject.messages.ResponseWrapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Path("WeatherChannel/{city}/{key}")
public class WeatherResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseWrapper getWeather(
			@PathParam("city") String city,
			@PathParam("key") String key)
	{
		Client client = ClientSingleton.getClient();
		
		WebResource ws = client.resource("http://api.apixu.com/v1/current.json")
				.queryParam("key", key)
				.queryParam("q", city);
		
		String str = ws.get(String.class);
		
		ResponseWrapper bean = null;
		
		ObjectMapper objectMapper = new ObjectMapper();
	    try {
			bean = objectMapper.readValue(str, ResponseWrapper.class);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return bean;
	}

}
