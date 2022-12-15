package br.com.waltercoan.appapidevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/converte-unidade")
public class APIConverteUnidadeController {
    //metodo que converte de km para milhas
    @GetMapping("/km-milhas/{km}")
    public double kmParaMilhas(@PathVariable double km) {
        return km * 0.621371;
    }
    //metodo que converte de milhas para km
    @GetMapping("/milhas-km/{milhas}")
    public double milhasParaKm(@PathVariable double milhas) {
        return milhas * 1.60934;
    }
}
