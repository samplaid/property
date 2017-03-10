package com.search.engine.property.core.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.search.engine.property.core.persistence.entity.CodeLabelEntity;

public interface CodeLabelRepository extends JpaRepository<CodeLabelEntity, String> {

	@Query("SELECT c FROM CodeLabelEntity c WHERE LOWER(c.code) = LOWER(:code)")
	public List<CodeLabelEntity> findByCode(@Param("code") String code);
}
