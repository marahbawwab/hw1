import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class shopcarttest {

	@Test
	public void test() {
		ShopCart c= new ShopCart();
		Assert.assertEquals(0, c.getcount());
	}

	@Test
	public void test1() {
		product b = new product("javabook",1,127);
		ShopCart s= new ShopCart();
		s.add(b);
		Assert.assertEquals(1, s.getcount());
		Assert.assertEquals(127.0, s.gettotal());
	}
	@Test
	public void test2() {
		product b = new product("javabook",1,127);
		product a = new product("Web design Book’",1,100);
		ShopCart s= new ShopCart();
		s.add(b);
		s.add(a);
		Assert.assertEquals(2, s.getcount());
		Assert.assertEquals(227, s.gettotal(),0.0);
	}
}
