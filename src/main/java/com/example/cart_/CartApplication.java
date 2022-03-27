package com.example.cart_;

import com.example.cart_.domain.Cart;
import com.example.cart_.domain.CartDetails;
import com.example.cart_.service.ICartDetailsService;
import com.example.cart_.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Transient;
import javax.transaction.Transactional;
import java.util.List;

@SpringBootApplication
public class CartApplication implements CommandLineRunner {
	@Autowired
	ICartService iCartService;
	@Autowired
	ICartDetailsService iCartDetailsService;

	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		List<Cart> carts = iCartService.findAll();
//		carts.forEach(cart -> {
//			System.out.println(cart.toString());
//		});

		List<CartDetails> cartDetails = iCartDetailsService.finAll(); //
				/*
		* Khi sử dụng fetch = FetchType.EAGER và fetch = FetchType.LAZY thực chất đều sinh ra câu truy vấn ở dưới để
		* lấy dữ liệu:
		select
			cartdetail0_.id as id1_0_,
			cartdetail0_.id_cart as id_cart2_0_,
			cartdetail0_.id_product as id_produ3_0_
		from
			cart_details cartdetail0_
		* Nhưng khi sử dụng fetch = FetchType.EAGER ví dụ ta lấy đối tượng CartDetails thì nó sẽ mặc định sinh ra query outer join
		* để tìm, lấy ra các đối tượng Cart, Product liên quan và lưu vào cartDetails, do đó khi kết thúc transaction.
		* cartDetails sẽ chứa các đối tượng Cart, Product của CartDetails đó.
		* ví dụ về query mà fetch = FetchType.EAGER tự sinh ra kết nối tìm và lấy dữ liệu từ những đối tượng liên quan trong transaction :
		*
			* select
			cart0_.id as id1_1_0_,
			cart0_.name as name2_1_0_,
			cartdetail1_.id_cart as id_cart2_0_1_,
			cartdetail1_.id as id1_0_1_,
			cartdetail1_.id as id1_0_2_,
			cartdetail1_.id_cart as id_cart2_0_2_,
			cartdetail1_.id_product as id_produ3_0_2_,
			product2_.id as id1_2_3_,
			product2_.name as name2_2_3_
		from
			carts cart0_
		left outer join
			cart_details cartdetail1_
				on cart0_.id=cartdetail1_.id_cart
		left outer join
			products product2_
				on cartdetail1_.id_product=product2_.id
		where
			cart0_.id=?
		*
		* Còn về fetch = FetchType.LAZY mặc định nó sẽ không tự sinh ra query join để lấy những đối tượng liên quan trong transaction,
		* nhưng khi gọi method lấy ra Cart trong đó thì nó mới tự sinh ra query tìm và lấy ra Cart và lưu vào cartDetails,
		* ngược lại nếu không gọi bất thì method nào thì khi kết thúc transaction cartDetails không chứa bất kỳ đối tượng liên quan nào.
		*
		* Ví dụ khi ta gọi method getProduct() và query sinh ra :
			*
		select
			product0_.id as id1_2_0_,
			product0_.name as name2_2_0_
		from
			products product0_
		where
			product0_.id=?
		*
		*
		* */
		System.out.println(cartDetails.get(0).getProduct().toString());
//		for (int i = 0; i < cartDetails.size(); i++){
//			System.out.println(cartDetails.get(i).getProduct().toString());
//		}
//		cartDetails.forEach(cart -> {
//			System.out.println(cart.toString());
//		});
//		for (int i = 0; i< cartDetails.size(); i++){
//			if (cartDetails.get(i).getCart().getId() == 1){
//				iCartDetailsService.deleteCart(cartDetails.get(i));
//			}
//		}
	}
}
