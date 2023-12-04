package com.retopichincha.tucomercio.tucomercioreto.Repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.retopichincha.tucomercio.tucomercioreto.modal.TipoCambio;

public interface TipoCambioRepository extends ReactiveCrudRepository<TipoCambio, Long>{
    Flux<TipoCambio> findByMonedaOrigen(String monedaOrigen);
}
