package com.ejecutar_rentas.controlador;
import org.springframework.web.bind.annotation.GetMapping;

public class DocumentosController {

    @GetMapping("/documentos")
    public String rentas() {
        return "/SolicitudDocumentos/Documentos";
    }
}
