package a03_codebat_jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodingBatTest {
	CodingBat cat = new CodingBat();

	@Test
	public void testZipZap1() {
		assertEquals("zpXzp", cat.zipZap("zipXzap"));
	}
	
	@Test
	public void testZipZap2() {
		assertEquals("zpzp", cat.zipZap("zopzop"));
	}
	
	@Test
	public void testZipZap3() {
		assertEquals("zzzpzp", cat.zipZap("zzzopzop"));
	}
	
	@Test
	public void testZipZap4() {
		assertEquals("zibzp", cat.zipZap("zibzap"));
	}
	
	@Test
	public void testZipZap5() {
		assertEquals("zp", cat.zipZap("zip"));
	}
	
	@Test
	public void testZipZap6() {
		assertEquals("zi", cat.zipZap("zi"));
	}
	
	@Test
	public void testZipZap7() {
		assertEquals("z", cat.zipZap("z"));
	}
	
	@Test
	public void testZipZap8() {
		assertEquals("", cat.zipZap(""));
	}
	
	@Test
	public void testZipZap9() {
		assertEquals("zp", cat.zipZap("zzp"));
	}
	
	@Test
	public void testZipZap10() {
		assertEquals("abcppp", cat.zipZap("abcppp"));
	}
	
	@Test
	public void testZipZap11() {
		assertEquals("azbcppp", cat.zipZap("azbcppp"));
	}
	
	@Test
	public void testZipZap12() {
		assertEquals("azbcpzp", cat.zipZap("azbcpzpp"));
	}
}
