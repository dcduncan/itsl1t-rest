package app

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

	val counter = AtomicLong()

	@CrossOrigin(origins = ["http://localhost:3000", "https://itsl1t.herokuapp.com"])
	@GetMapping("/greeting")
	fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
		return Greeting(counter.incrementAndGet(), "Hello, $name")
	}

}