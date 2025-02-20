package in.net.uidai.quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuoteController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/quote/{id}")
	public String greeting(@PathVariable String id) {
		
		String response = restTemplate.getForObject(
				"http://localhost:8080/quote/"+id, String.class);
		return response;
	}
}
