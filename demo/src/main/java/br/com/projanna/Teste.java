package br.com.projanna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {
	
	private static String template = "Hello, %s!";
	private long counter = 0L;
	
	@GetMapping("/teste")
	public Olars teste(@RequestParam(value = "name", defaultValue = "World") String name){
		this.counter++;
		return new Olars(this.counter, String.format(template, name));
	}
}
