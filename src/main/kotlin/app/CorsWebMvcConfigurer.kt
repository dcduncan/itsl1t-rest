package app

import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

class CorsWebMvcConfigurer : WebMvcConfigurer {

	override fun addCorsMappings(registry: CorsRegistry?) {
		registry?.addMapping("/**")?.allowedOrigins("http://localhost:3000", "https://itsl1t.herokuapp.com")
	}
}