package com.servicosmsc.MSC.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/raiz_quadrado")
public class CalculoResource {
	@GetMapping()
	public String resultado() {
		return "REST está funcionado";
	}
}
