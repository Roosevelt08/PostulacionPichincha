package com.retopichincha.tucomercio.tucomercioreto.modal;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoCambio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    private String monedaOrigen;
    private String monedaDestino;
    private BigDecimal monto;
    private BigDecimal tipoCambio;
}
