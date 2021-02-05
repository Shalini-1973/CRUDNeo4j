package com.shalini.paynav.config;
import org.neo4j.driver.Driver;
import org.neo4j.driver.internal.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.core.transaction.Neo4jTransactionManager;
/*import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableNeo4jRepositories(basePackages="com.shalini.paynav.repo")
@EnableTransactionManagement
public class Neo4jConfig {
	
	@Bean
	public org.neo4j.ogm.config.Configuration configuration(){
		org.neo4j.ogm.config.Configuration configuration=new org.neo4j.ogm.config.Configuration();
				configuration.uri("bolt://localhost:7687");
				configuration.credentials("neo4j","root");
				configuration.autoIndex("none");
				configuration.build();
		      return configuration;
	}
	
	
	@Bean
	private SessionFactory sessionFactory() {
	
		return new SessionFactory(configuration(),"com.shalini.paynav.entity");
	}

	
	*//*
	@Bean
	public Neo4jTransactionManager transactionManager() {
		return new Neo4jTransactionManager(sessionFactory());
	}

	
}
*/
