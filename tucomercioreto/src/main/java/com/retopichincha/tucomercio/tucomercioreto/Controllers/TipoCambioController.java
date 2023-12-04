package com.retopichincha.tucomercio.tucomercioreto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retopichincha.tucomercio.tucomercioreto.Repository.TipoCambioRepository;

@RestController
@RequestMapping("/api/tipo-cambio")
public class TipoCambioController {
    @Autowired
    private TipoCambioRepository tipoCambioRepository;
    
}
