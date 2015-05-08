import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class PairProEnTest {

	@Test
	public void いちからone() {
		IntoToEng en = new IntoToEng();
		String expected = "one";
		String actual = en.translateEng(1);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void じゅうからten() {
		IntoToEng en = new IntoToEng();
		String expected = "ten";
		String actual = en.translateEng(10);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void にじゅうからtwenty() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty";
		String actual = en.translateEng(20);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void じゅうさんからtwenty_three() {
		IntoToEng en = new IntoToEng();
		String expected = "twenty three";
		String actual = en.translateEng(23);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void さんじゅうからtwenty_three() {
		IntoToEng en = new IntoToEng();
		String expected = "thirty";
		String actual = en.translateEng(30);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ごじゅうはちからfifty_eight() {
		IntoToEng en = new IntoToEng();
		String expected = "fifty eight";
		String actual = en.translateEng(58);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void きゅうじゅうきゅうからninety_nine() {
		IntoToEng en = new IntoToEng();
		String expected = "ninety nine";
		String actual = en.translateEng(99);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void ひゃくからone_hunderd() {
		IntoToEng en = new IntoToEng();
		String expected = "one hundred";
		String actual = en.translateEng(100);
		assertThat(actual,is(expected));
	}
}
