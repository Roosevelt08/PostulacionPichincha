package com.retopichincha.tucomercio.tucomercioreto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.retopichincha.tucomercio.tucomercioreto.Repository.TipoCambioRepository;
import com.retopichincha.tucomercio.tucomercioreto.modal.TipoCambio;

@Service
public class TipoCambioService {

    public final TipoCambioRepository tipoCambioRepository;

    @Autowired
    public TipoCambioService(TipoCambioRepository tipoCambioRepository){
    this.tipoCambioRepository = tipoCambioRepository;
    }
    public Mono<TipoCambio> registrarTipoCambio(TipoCambio tipoCambio){
        return tipoCambioRepository.save(tipoCambio);
    }
    public Flux<TipoCambio> obtenerTodos() {
        return tipoCambioRepository.findAll();
    }

    public Flux<TipoCambio> obtenerPorMonedas(String monedaOrigen, String monedaDestino) {
        return tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(monedaOrigen, monedaDestino);
    }
}
