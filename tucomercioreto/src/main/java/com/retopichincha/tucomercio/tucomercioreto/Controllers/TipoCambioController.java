package com.retopichincha.tucomercio.tucomercioreto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retopichincha.tucomercio.tucomercioreto.Repository.TipoCambioRepository;
import com.retopichincha.tucomercio.tucomercioreto.Service.TipoCambioService;
import com.retopichincha.tucomercio.tucomercioreto.modal.TipoCambio;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/tipo-cambio")
public class TipoCambioController {
    
    private TipoCambioService tipoCambioService;

    @Autowired
    public TipoCambioController(TipoCambioService tipoCambioService){
        this.tipoCambioService = tipoCambioService;
    }

    @PostMapping("/registrar")
    public Mono<TipoCambio> registrarTipoCambio(@RequestBody TipoCambio tipoCambio) {
        return tipoCambioService.registrarTipoCambio(tipoCambio);
    }

    @GetMapping("/todos")
    public Flux<TipoCambio> obtenerTodos() {
        return tipoCambioService.obtenerTodos();
    }

    @GetMapping("/buscar")
    public Flux<TipoCambio> obtenerPorMonedas(@RequestParam String monedaOrigen, @RequestParam String monedaDestino) {
        return tipoCambioService.obtenerPorMonedas(monedaOrigen, monedaDestino);
    }    
}
