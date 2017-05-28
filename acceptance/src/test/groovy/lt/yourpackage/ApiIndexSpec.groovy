package lt.yourpackage

import lt.yourpackage.client.FluentRestClient
import spock.lang.Shared
import spock.lang.Specification

class ApiIndexSpec extends Specification {

    @Shared
    def rest = FluentRestClient.defaultRestClient()

    def 'api index welcomes you'() {
        when:
            def response = rest.get('/api')
        then:
            response.status == 200
            response.body.message == 'Welcome!'
    }

}
