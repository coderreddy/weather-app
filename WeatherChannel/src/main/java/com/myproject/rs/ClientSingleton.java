package com.myproject.rs;

import com.sun.jersey.api.client.Client;

public class ClientSingleton {
	
	private static Client client;
	
	public static Client getClient()
	{
		client  = Client.create();
		return client;
	}

}
