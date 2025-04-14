package com.Annotation.AnnRelations;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonCurd extends JpaRepository<PersonEntity, Integer>
{
	
	public abstract List<PersonEntity>findByPname(String pname);

}
