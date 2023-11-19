package com.web.tornese.SpringWeb.repositorio;

import com.web.tornese.SpringWeb.models.Anamnese;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AnamneseRepo extends CrudRepository<Anamnese, Integer> {
    @Query(value = "select CASE WHEN count(1) > 0 THEN 'true' ELSE 'false' END  from anamnese where id = :id", nativeQuery = true)
    public boolean exist(int id);

}
