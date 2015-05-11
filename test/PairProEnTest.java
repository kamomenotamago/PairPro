import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class PairProEnTest {

	@Test
	public void Ç¢ÇøÇ©ÇÁone() {
		IntoToEng en = new IntoToEng();
		String expected = "one";
		String actual = en.translateEng(1);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void Ç∂Ç„Ç§Ç©ÇÁten() {
		IntoToEng en = new IntoToEng();
		String expected = "ten";
		String actual = en.translateEng(10);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void Ç…Ç∂Ç„Ç§Ç©ÇÁtwenty() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty";
		String actual = en.translateEng(20);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void Ç∂Ç„Ç§Ç≥ÇÒÇ©ÇÁtwenty_three() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty three";
		String actual = en.translateEng(23);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void Ç≥ÇÒÇ∂Ç„Ç§Ç©ÇÁtwenty_three() {
		IntoToEng en = new IntoToEng();
		String expected = "thirty";
		String actual = en.translateEng(30);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void Ç≤Ç∂Ç„Ç§ÇÕÇøÇ©ÇÁfifty_eight() {
		IntoToEng en = new IntoToEng();
		String expected = "fifty eight";
		String actual = en.translateEng(58);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void Ç´Ç„Ç§Ç∂Ç„Ç§Ç´Ç„Ç§Ç©ÇÁninety_nine() {
		IntoToEng en = new IntoToEng();
		String expected = "ninety nine";
		String actual = en.translateEng(99);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void Ç–Ç·Ç≠Ç©ÇÁone_hunderd() {
		IntoToEng en = new IntoToEng();
		String expected = "one hundred";
		String actual = en.translateEng(100);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void Ç´Ç„Ç§Ç–Ç·Ç≠Ç©ÇÁÇ≥ÇÒ() {
		IntoToEng en = new IntoToEng();
		String expected = "nine hundred thirteen";
		String actual = en.translateEng(913);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ÇπÇÒÇ…Ç∂Ç„Ç§Ç´Ç„Ç§() {
		IntoToEng en = new IntoToEng();
		String expected = "one thousand twenty nine";
		String actual = en.translateEng(1029);
		assertThat(actual,is(expected));
	}
	@Test
	public void ã„êÁã„ïSã„è\ã„() {
		IntoToEng en = new IntoToEng();
		String expected = "nine thousand nine hundred ninety nine";
		String actual = en.translateEng(9999);
		assertThat(actual,is(expected));
	}
	@Test
	public void àÍñú() {
		IntoToEng en = new IntoToEng();
		String expected = "ten thousand";
		String actual = en.translateEng(10000);
		assertThat(actual,is(expected));
	}
}
