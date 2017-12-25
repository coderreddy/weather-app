package com.myproject.messages;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Location {
	
	public String name;
	
	public String region;
	
	public String country;
	
	public int lat;
	
	public int lon;
	
	public String tz_id;
	
	public int localtime_epoch;
	
	public String localtime;
	
	public Location()
	{
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getLat() {
		return lat;
	}

	public void setLat(int lat) {
		this.lat = lat;
	}

	public int getLon() {
		return lon;
	}

	public void setLon(int lon) {
		this.lon = lon;
	}

	public String getTz_id() {
		return tz_id;
	}

	public void setTz_id(String tz_id) {
		this.tz_id = tz_id;
	}

	public int getLocaltime_epoch() {
		return localtime_epoch;
	}

	public void setLocaltime_epoch(int localtime_epoch) {
		this.localtime_epoch = localtime_epoch;
	}

	public String getLocaltime() {
		return localtime;
	}

	public void setLocaltime(String localtime) {
		this.localtime = localtime;
	}

	/*@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("name").append(name);
		sb.append("/nregion: ").append(region);
		sb.append("/ncountry: ").append(country);
		sb.append("/ntz_id: ").append(tz_id);
		sb.append("/nlocaltime: ").append(localtime);
		return sb.toString();
	}*/
	
}
