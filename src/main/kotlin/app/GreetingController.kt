package app

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

	companion object {
		val LOGGER = LoggerFactory.getLogger(GreetingController::class.java.name)!!
	}

	val counter = AtomicLong()

	@GetMapping("/greeting")
	fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
		val greeting = Greeting(counter.incrementAndGet(), "Hello, $name")
		LOGGER.info("Going to return greeting $greeting")
		return greeting
	}

}