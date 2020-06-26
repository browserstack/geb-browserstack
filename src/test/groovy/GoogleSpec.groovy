import spock.lang.*
import geb.*
import geb.spock.*
import org.openqa.selenium.Keys

class GoogleSpec extends GebReportingSpec {

    def "Search BrowserStack on Google"() {
        when:
        to GoogleHomePage

        and:
        def q = $("input", name: "q")
        q << "BrowserStack"
        q << Keys.ENTER

        then:
        waitFor { at GoogleResultsPage }

        //and:
        //firstResultLink.text() == "Wikipedia"

        //when:
        //firstResultLink.click()

        //then:
        //waitFor { at WikipediaPage }
    }

}