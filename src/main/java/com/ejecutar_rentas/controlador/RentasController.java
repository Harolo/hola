package com.ejecutar_rentas.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RentasController {
//    @RequestMapping("/hola")
//    public String hola(Model modelo) {
//        modelo.addAttribute("mensaje","hola desde thymeleaf");
//        return "hola";
//    }

//    @GetMapping("/")
//    public String home() {
//        return "/hola";
//    }

    @GetMapping("/")
    public String rentas() {
        return "/Rentas/RentasTXT";
    }

    @GetMapping("/documentos")
    public String documentos() {
        return "/SolicitudDocumentos/Documentos";
    }
}
