import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CamelCaseConversorTest {
	
	
	 private CamelCaseConverter camelCase;
	
	@Before
	public void setup(){
		 camelCase = new CamelCaseConverter();
	}
	
	
	@Test
	public void aplicarCamelCase() throws Exception {
		assertEquals("Ted", camelCase.converter("ted"));
	}
}
