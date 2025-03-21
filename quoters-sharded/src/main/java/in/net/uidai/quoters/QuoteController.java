/*
 * Copyright 2014-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package in.net.uidai.quoters;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

	private final static Quote NONE = new Quote(0L, "None");
	private final static Random RANDOMIZER = new Random();

	private final QuoteRepository repository;

	public QuoteController(QuoteRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/quote")
	public List<QuoteResource> getAll() {

		return repository.findAll().stream().map(quote -> new QuoteResource(quote, "success"))
				.collect(Collectors.toList());
	}

	@GetMapping("/quote/{id}")
	public QuoteResource getOne(@PathVariable Long id) {
		String key = String.valueOf(id).substring(0, 1);
		return switch (Integer.valueOf(key)) {
			case 1 -> shared1(id);
			case 2 -> shared2(id);
			case 3 -> shared3(id);
			case 4 -> shared4(id);
			case 5 -> shared5(id);
			case 6 -> shared6(id);
			case 7 -> shared7(id);
			case 8 -> shared8(id);
			case 9 -> shared9(id);
			default -> new QuoteResource(NONE, "Quote " + id + " does not exist");
		};

	}

	@GetMapping("/quote/random")
	public QuoteResource getRandomOne() {
		return getOne(nextLong(1, repository.count() + 1));
	}

	private long nextLong(long lowerRange, long upperRange) {
		return (long) (RANDOMIZER.nextDouble() * (upperRange - lowerRange)) + lowerRange;
	}

	private QuoteResource shared1(Long id) {
		// Add validation for id to be in range
		return repository.findById(id).map(quote -> new QuoteResource(quote, "success"))
				.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

	private QuoteResource shared2(Long id) {
		// Add validation for id to be in range
		return repository.findById(id).map(quote -> new QuoteResource(quote, "success"))
				.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

	private QuoteResource shared3(Long id) {
		// Add validation for id to be in range
		return repository.findById(id).map(quote -> new QuoteResource(quote, "success"))
				.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

	private QuoteResource shared4(Long id) {
		// Add validation for id to be in range
		return repository.findById(id).map(quote -> new QuoteResource(quote, "success"))
				.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

	private QuoteResource shared5(Long id) {
		// Add validation for id to be in range
		return repository.findById(id).map(quote -> new QuoteResource(quote, "success"))
				.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

	private QuoteResource shared6(Long id) {
		// Add validation for id to be in range
		return repository.findById(id).map(quote -> new QuoteResource(quote, "success"))
				.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

	private QuoteResource shared7(Long id) {
		// Add validation for id to be in range
		return repository.findById(id).map(quote -> new QuoteResource(quote, "success"))
				.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

	private QuoteResource shared8(Long id) {
		// Add validation for id to be in range
		return repository.findById(id).map(quote -> new QuoteResource(quote, "success"))
				.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

	private QuoteResource shared9(Long id) {
		// Add validation for id to be in range
		return repository.findById(id).map(quote -> new QuoteResource(quote, "success"))
				.orElse(new QuoteResource(NONE, "Quote " + id + " does not exist"));
	}

}
