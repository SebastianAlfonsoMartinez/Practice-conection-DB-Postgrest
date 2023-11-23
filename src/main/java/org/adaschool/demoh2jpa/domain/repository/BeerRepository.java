package org.adaschool.demoh2jpa.domain.repository;

import org.adaschool.demoh2jpa.domain.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Integer> {

  /**
   * Consultas JPQL
   *
   * Consultas SQL Nativas
   */
}
