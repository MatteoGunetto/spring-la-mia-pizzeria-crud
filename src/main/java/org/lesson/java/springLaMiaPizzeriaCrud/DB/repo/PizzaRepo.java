package org.lesson.java.springLaMiaPizzeriaCrud.DB.repo;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Pizze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepo extends JpaRepository<Pizze, Integer> {

}