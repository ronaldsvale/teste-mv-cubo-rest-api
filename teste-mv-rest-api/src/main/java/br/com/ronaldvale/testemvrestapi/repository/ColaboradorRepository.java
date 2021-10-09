package br.com.ronaldvale.testemvrestapi.repository;

import br.com.ronaldvale.testemvrestapi.model.ColaboradorMV;
import org.springframework.data.repository.CrudRepository;

public interface ColaboradorRepository extends CrudRepository<ColaboradorMV, Integer> {
}
