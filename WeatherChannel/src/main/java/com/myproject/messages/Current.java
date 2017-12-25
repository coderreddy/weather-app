package com.myproject.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Current {
	
	public int last_updated_epoch;
	
	public String last_updated;
	
	public int temp_c;
	
	public int temp_f;
	
	public int is_day;
	
	public Condition condition;
	
	public int wind_mph;
	
	public int wind_kph;
	
	public int wind_degree;
	
	public String wind_dir;
	
	public int pressure_mb;
	
	public int pressure_in;
	
	public int precip_mm;
	
	public int precip_in;
	
	public int humidity;
	
	public int cloud;
	
	public int feelslike_c;
	
	public int feelslike_f;
	
	public int vis_km;
	
	public int vis_miles;

	public int getLast_updated_epoch() {
		return last_updated_epoch;
	}

	public void setLast_updated_epoch(int last_updated_epoch) {
		this.last_updated_epoch = last_updated_epoch;
	}

	public String getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}

	public int getTemp_c() {
		return temp_c;
	}

	public void setTemp_c(int temp_c) {
		this.temp_c = temp_c;
	}

	public int getTemp_f() {
		return temp_f;
	}

	public void setTemp_f(int temp_f) {
		this.temp_f = temp_f;
	}

	public int getIs_day() {
		return is_day;
	}

	public void setIs_day(int is_day) {
		this.is_day = is_day;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public int getWind_mph() {
		return wind_mph;
	}

	public void setWind_mph(int wind_mph) {
		this.wind_mph = wind_mph;
	}

	public int getWind_kph() {
		return wind_kph;
	}

	public void setWind_kph(int wind_kph) {
		this.wind_kph = wind_kph;
	}

	public int getWind_degree() {
		return wind_degree;
	}

	public void setWind_degree(int wind_degree) {
		this.wind_degree = wind_degree;
	}

	public String getWind_dir() {
		return wind_dir;
	}

	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}

	public int getPressure_mb() {
		return pressure_mb;
	}

	public void setPressure_mb(int pressure_mb) {
		this.pressure_mb = pressure_mb;
	}

	public int getPressure_in() {
		return pressure_in;
	}

	public void setPressure_in(int pressure_in) {
		this.pressure_in = pressure_in;
	}

	public int getPrecip_mm() {
		return precip_mm;
	}

	public void setPrecip_mm(int precip_mm) {
		this.precip_mm = precip_mm;
	}

	public int getPrecip_in() {
		return precip_in;
	}

	public void setPrecip_in(int precip_in) {
		this.precip_in = precip_in;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getCloud() {
		return cloud;
	}

	public void setCloud(int cloud) {
		this.cloud = cloud;
	}

	public int getFeelslike_c() {
		return feelslike_c;
	}

	public void setFeelslike_c(int feelslike_c) {
		this.feelslike_c = feelslike_c;
	}

	public int getFeelslike_f() {
		return feelslike_f;
	}

	public void setFeelslike_f(int feelslike_f) {
		this.feelslike_f = feelslike_f;
	}

	public int getVis_km() {
		return vis_km;
	}

	public void setVis_km(int vis_km) {
		this.vis_km = vis_km;
	}

	public int getVis_miles() {
		return vis_miles;
	}

	public void setVis_miles(int vis_miles) {
		this.vis_miles = vis_miles;
	}

}
