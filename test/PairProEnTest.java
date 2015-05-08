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
	
	@Test
	public void ‚¶‚ã‚¤‚©‚çten() {
		IntoToEng en = new IntoToEng();
		String expected = "ten";
		String actual = en.translateEng(10);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚É‚¶‚ã‚¤‚©‚çtwenty() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty";
		String actual = en.translateEng(20);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚¶‚ã‚¤‚³‚ñ‚©‚çtwenty_three() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty three";
		String actual = en.translateEng(23);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚³‚ñ‚¶‚ã‚¤‚©‚çtwenty_three() {
		IntoToEng en = new IntoToEng();
		String expected = "thirty";
		String actual = en.translateEng(30);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚²‚¶‚ã‚¤‚Í‚¿‚©‚çfifty_eight() {
		IntoToEng en = new IntoToEng();
		String expected = "fifty eight";
		String actual = en.translateEng(58);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚«‚ã‚¤‚¶‚ã‚¤‚«‚ã‚¤‚©‚çninety_nine() {
		IntoToEng en = new IntoToEng();
		String expected = "ninety nine";
		String actual = en.translateEng(99);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚Ð‚á‚­‚©‚çone_hunderd() {
		IntoToEng en = new IntoToEng();
		String expected = "one hundred";
		String actual = en.translateEng(100);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚«‚ã‚¤‚Ð‚á‚­‚©‚ç‚³‚ñ() {
		IntoToEng en = new IntoToEng();
		String expected = "nine hundred thirteen";
		String actual = en.translateEng(913);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ‚¹‚ñ‚É‚¶‚ã‚¤‚«‚ã‚¤() {
		IntoToEng en = new IntoToEng();
		String expected = "one thousand twenty nine";
		String actual = en.translateEng(1029);
		assertThat(actual,is(expected));
	}
}
