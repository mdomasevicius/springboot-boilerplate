package lt.yourpackage

import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@CompileStatic
class App {

    static void main(String[] args) {
        SpringApplication.run(App, args)
    }

}
