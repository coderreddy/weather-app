package com.myproject.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseWrapper {
	
	public Location location;
	
	public Current current;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}

}
