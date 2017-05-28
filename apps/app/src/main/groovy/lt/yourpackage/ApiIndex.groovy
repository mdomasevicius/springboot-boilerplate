package lt.yourpackage

import groovy.transform.CompileStatic
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping('/api')
@RestController
@CompileStatic
class ApiIndex {

    @GetMapping
    ResponseEntity<IndexResource> index() {
        return ResponseEntity.ok(
            new IndexResource(
                message: 'Welcome!'
            )
        )
    }

    @CompileStatic
    static class IndexResource {
        String message
    }

}
