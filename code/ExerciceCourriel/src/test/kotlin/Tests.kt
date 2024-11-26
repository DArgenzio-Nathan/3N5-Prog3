import org.dargenzio.isValidEmail
import org.junit.jupiter.api.Test

class Tests {
    @Test
    fun testIsValidEmailMin() {
        assert(isValidEmail("bob@smith.org"))
    }
    @Test
    fun testIsValidEmailMaj() {
        assert(isValidEmail("BOB@SMITH.ORG"))
    }

    @Test
    fun testIsValidEmailAdditional() {
        assert(isValidEmail("bob@smith.org"))
        assert(isValidEmail("a.b.c@pipo.com"))
        assert(isValidEmail("Rodgere.Federer@tennis.info"))
    }

    @Test
    fun testIsInValidEmailAdditional() {
        assert(!isValidEmail("bob@smith"))
        assert(!isValidEmail("a..b@popi.org"))
        assert(!isValidEmail("john.doe@.com"))
        assert(!isValidEmail("john.doe@plop.c"))
    }
}

