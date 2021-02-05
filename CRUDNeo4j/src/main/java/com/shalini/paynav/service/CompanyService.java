package com.shalini.paynav.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shalini.paynav.entity.Company;
import com.shalini.paynav.entity.person;
import com.shalini.paynav.repo.CompanyRepository;
import com.shalini.paynav.repo.PersonRepository;
import com.sun.el.stream.Optional;

@Service
public class CompanyService {
     @Autowired
     private CompanyRepository companyrepository;
     @Autowired PersonRepository personrepository;
	
     public Company saveCompany(Company company) {
		return	companyrepository.save(company);
		 
	}

	public List<Company> getCompanies() {
		return (List<Company>)companyrepository.findAll();
		 
	}

	public Company updateCompany(Company company) {
		Company comp = companyrepository.findById(company.getEntityId()).get();
		comp.setLocation(company.getLocation());
		comp.setName(company.getName());
		comp.setPersons(company.getPersons());
		return companyrepository.save(comp);
	
	}

	public Company deleteCompany(Long id) {
		/*Company company=companyrepository.findById(id).get();
		companyrepository.deleteById(id);
		
		Set<person> persons=company.getPersons();
		persons.forEach(person->{
			personrepository.deleteById(person.getEntityId());
		});
		//companyrepository.deleteById(id);
		return  company;*/
		
		
		java.util.Optional<Company> company = companyrepository.findById(id);
		companyrepository.deleteById(id);
		Set<person> persons = company.get().getPersons();
		persons.forEach(person -> {
			personrepository.deleteById(person.getEntityId());
		});
		return company.get();
		
		
		
		
	}

	public Company getCompanyById(Long id) {
		Company company=companyrepository.findById(id).get();
		return company;
	}	
	
	public Company updateCompany(Long id, Company company) {
		java.util.Optional<Company> companyopt=companyrepository.findById(id);
		Company companyEntity = companyopt.get();
		updateCompanyEntity(company, companyEntity);
		return companyrepository.save(companyEntity);
	}

	private void updateCompanyEntity(Company request, Company companyEntity) {
		if(request.getName() != null && !request.getName().isEmpty())
			companyEntity.setName(request.getName());
		if(request.getLocation() != null && !request.getLocation().isEmpty())
			companyEntity.setLocation(request.getLocation());
		if(request.getPersons() != null && !request.getPersons().isEmpty()){
			Set<person> persons = new HashSet<>();
			persons.addAll(companyEntity.getPersons());
			persons.addAll(request.getPersons());
			companyEntity.setPersons(persons);
		}
	}

}


