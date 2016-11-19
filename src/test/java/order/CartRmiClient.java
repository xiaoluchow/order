package order;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.xiaolu.cart.remote.CartServiceRMI;


public class CartRmiClient {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			CartServiceRMI cartService = (CartServiceRMI) Naming.lookup("rmi://172.16.11.30:1099/cart/rmi/query");
			cartService.queryMemberCartItems(3L);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
