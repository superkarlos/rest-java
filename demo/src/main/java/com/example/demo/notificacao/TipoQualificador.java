package com.example.demo.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.enumerador.NivelUrgencia;

@Retention (RetentionPolicy.RUNTIME)
@Qualifier 
public @interface TipoQualificador {
    NivelUrgencia value();
}
