package com.shalini.paynav.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.shalini.paynav.entity.person;

public interface PersonRepository extends Neo4jRepository<person,Long> {

}
