package br.boralaviagens.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/todos_os_destinos")
    public String destino() {
        return "destino";
    }

    @GetMapping("/pacotes")
    public String pacotes() {
        return "pacotes";
    }

    @GetMapping("/promocoes")
    public String promocoes() {
        return "promocoes";
    }

    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }
}
