package com.shalini.paynav.entity;

import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class Company {
	@Id
	@GeneratedValue
	private Long entityId;
	private String name;
	private String location;
	@Relationship(type = "works_for", direction = Relationship.Direction.INCOMING)
	private Set<person> persons;

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public Set<person> getPersons() {
		return persons;
	}

	public Company() {

	}

	public void setPersons(Set<person> persons) {
		this.persons = persons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Company(Long entityId, String name, String location, Set<person> persons) {
		super();
		this.entityId = entityId;
		this.name = name;
		this.location = location;
		this.persons = persons;
	}

	
}
