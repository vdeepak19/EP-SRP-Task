import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author klu
 *
 */
class PrimeOrNotTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	PrimeOrNot pm = new PrimeOrNot();
	@Test
	void test1() {
		assertEquals(true, pm.isPrime(5));
	}
	
	
	@Test
	void test2() {
		assertEquals(false, pm.isPrime(20));
	}
	
	@Test
	void test3() {
		assertEquals(true, pm.isPrime(29));
	}
	@Test
	void test4() {
		assertEquals(false, pm.isPrime(87));
	}
	@Test
	void test5() {
		assertEquals(false, pm.isPrime(98));
	}
	@Test
	void test6() {
		assertEquals(true, pm.isPrime(71));
	}
}
