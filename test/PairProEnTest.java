import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class PairProEnTest {

	@Test
	public void ��������one() {
		IntoToEng en = new IntoToEng();
		String expected = "one";
		String actual = en.translateEng(1);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ���イ����ten() {
		IntoToEng en = new IntoToEng();
		String expected = "ten";
		String actual = en.translateEng(10);
		assertThat(actual,is(expected));
	}
}
