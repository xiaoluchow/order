package order;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiaolu.cart.bean.CartItemBean;
import com.xiaolu.cart.service.CartService;


@ContextConfiguration(locations ={"classpath:springmvc-servlet.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class Junit {
	
	@Autowired
	private CartService cartService;
	
	@Test
	public void testGet(){
		List<CartItemBean> cartItems = cartService.getMemberCartItems(3L);
		System.out.println(cartItems.size());
	}
	
	@Test
	public void testAdd(){
	}
	
}
