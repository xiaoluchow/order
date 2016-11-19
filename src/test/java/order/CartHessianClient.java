package order;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.xiaolu.cart.remote.CartServiceHessian;

public class CartHessianClient {
	
	public static void main(String[] args) {
		//手动使用hessian远程调用server端
		long start = System.currentTimeMillis();
		String url = "http://172.16.11.30:8020/cart/service";
		HessianProxyFactory proxyFactory = new HessianProxyFactory();
		try {
			CartServiceHessian cartService = (CartServiceHessian) proxyFactory.create(CartServiceHessian.class, url);
			cartService.queryMemberCartItems(3L);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
