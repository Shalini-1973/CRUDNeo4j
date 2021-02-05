package com.shalini.paynav.repo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.shalini.paynav.entity.Company;

public interface CompanyRepository  extends Neo4jRepository<Company,Long> {


}
