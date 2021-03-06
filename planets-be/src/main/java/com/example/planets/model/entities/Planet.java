package com.example.planets.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="planets")
public class Planet implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private String planet_name;
	private Integer diameter;
	private Double mean_temp;
	private Integer number_visits;
	private String id;

	public String getPlanet_name() {
		return planet_name;
	}

	public void setPlanet_name(String planet_name) {
		this.planet_name = planet_name;
	}

	public Integer getDiameter() {
		return diameter;
	}

	public void setDiameter(Integer diameter) {
		this.diameter = diameter;
	}

	public Double getMean_temp() {
		return mean_temp;
	}

	public void setMean_temp(Double mean_temp) {
		this.mean_temp = mean_temp;
	}

	public Integer getNumber_visits() {
		return number_visits;
	}

	public void setNumber_visits(Integer number_visits) {
		this.number_visits = number_visits;
	}


	public void setId(String id) {
		this.id = id;
	}

	@Id
	public String getId() {
		return id;
	}
}
