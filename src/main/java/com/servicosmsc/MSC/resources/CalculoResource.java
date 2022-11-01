package com.servicosmsc.MSC.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/raiz_quadrado")
public class CalculoResource {

  @GetMapping("/{valor}")
  public String resultado(@PathVariable double valor) {
    if (valor % 2 == 0) {
      valor = Math.sqrt(valor);
      return "A raiz desse número é: " + valor;
    }

    return "O quadrado desse número é: " + valor * valor;
  }
}
