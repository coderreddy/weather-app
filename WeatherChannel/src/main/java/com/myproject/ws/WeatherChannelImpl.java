package com.myproject.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.myproject.WeatherChannel", serviceName = "weatherChannelWS")
public class WeatherChannelImpl implements WeatherChannel{

	@Override
	public String getWeatherByLocation() {
		return "Today is snowing";
	}
	
	

}
