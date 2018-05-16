package vn.poly.sof302.lesson01.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestSampleController {

	@GetMapping
	public Map<String, Object> index(@RequestParam String name) {
		
		Map<String, Object> result = new HashMap<>();
		
		result.put("text", "Welcome " + name);
		result.put("now", new Date());
		
		return result;
	}
}
