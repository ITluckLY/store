package cn.tedu.store.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Order;
import cn.tedu.store.service.exception.ServiceException;
import cn.tedu.store.vo.OrderVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTestCase {

	@Autowired
	private IOrderService service;

	@Test
	public void createOrder() {
		try {
			Integer uid = 1;
			String username = "Admin";
			Integer addressId = 23;
			Integer[] cartIds = { 7,8,9 };
			Order order = service.createOrder(uid, username, addressId, cartIds);
			System.err.println(order);
		} catch (ServiceException e) {
			System.err.println("错误类型：" + e.getClass().getName());
			System.err.println("错误描述：" + e.getMessage());
		}
	}
	
	@Test
	public void getById() {
		Integer id = 4;
		OrderVO data = service.getById(id);
		System.err.println(data);
	}

}
