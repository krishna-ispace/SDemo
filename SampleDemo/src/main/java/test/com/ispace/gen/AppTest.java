package test.com.ispace.gen;

import org.junit.Assert;
import org.junit.Test;

import com.ispace.gen.App;

public class AppTest {

	@Test
	public void testLengthOfTheUniqueKey() {

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
}