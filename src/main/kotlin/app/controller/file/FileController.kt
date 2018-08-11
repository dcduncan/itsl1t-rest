package app.controller.file

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
class FileController {

	companion object {
		val LOGGER = LoggerFactory.getLogger(FileController::class.java.name)!!
	}

	@PostMapping("/upload/image")
	fun uploadImage(@RequestParam("image") images: MultipartFile): String {

		if (images.isEmpty) {
			LOGGER.info("Image was empty")
			return "437"
		}

		LOGGER.info("""
			Content type is: ${images.contentType}
			Number of bytes are ${images.bytes}
			""".trimIndent()
		)

		return "200"
	}
}