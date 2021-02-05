package com.shalini.paynav.entity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import lombok.EqualsAndHashCode;

@Node
@EqualsAndHashCode(exclude = "entityId")
public class person {
	@Id
	@GeneratedValue
	private Long entityId;
	private String name;

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public person() {
		
	}

	public person(Long entityId, String name) {
		super();
		this.entityId = entityId;
		this.name = name;
	}

	 
	}


