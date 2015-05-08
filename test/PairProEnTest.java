import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class PairProEnTest {

	@Test
	public void ‚¢‚¿‚©‚çone() {
		IntoToEng en = new IntoToEng();
		String expected = "one";
		String actual = en.translateEng(1);
		assertThat(actual,is(expected));
	}

}
