package radoslaw.slowinski.videotoaudio

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class VideotoaudioApplication

fun main(args: Array<String>) {
    runApplication<VideotoaudioApplication>(*args)
}
