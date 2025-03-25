package com.examples;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "state")
public class State {

	@Id
	@Column(name = "state_id")
	private String stateId;
	
	@Column(name = "state_name")
	private String stateName;

	
	// one to many mappings which allows to get all the city objects based on the state
	
	@OneToMany
	@JoinTable(name = "state_city_ref", joinColumns = @JoinColumn(name = "state_ref"), 
	inverseJoinColumns = @JoinColumn(name = "city_ref"))
	private List<City> cities;
	
	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + "]";
	}
	
	
}
