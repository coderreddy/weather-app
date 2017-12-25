package com.myproject.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WeatherChannel {
	
	@WebMethod
	public String getWeatherByLocation();

}
