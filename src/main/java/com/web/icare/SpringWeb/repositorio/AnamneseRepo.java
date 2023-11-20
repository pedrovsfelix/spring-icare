package com.web.icare.SpringWeb.repositorio;

import com.web.icare.SpringWeb.models.Anamnese;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AnamneseRepo extends CrudRepository<Anamnese, Integer> {
    @Query(value = "select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END  from anamnese where id = :id", nativeQuery = true)
    public boolean exist(int id);

}
