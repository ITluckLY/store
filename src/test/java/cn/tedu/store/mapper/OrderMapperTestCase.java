package cn.tedu.store.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Order;
import cn.tedu.store.entity.OrderItem;
import cn.tedu.store.vo.OrderVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTestCase {

	@Autowired
	private OrderMapper mapper;
	
	@Test
	public void insertOrder() {
		Order order = new Order();
		order.setUid(1);
		order.setRecvName("小张同学");
		Integer rows = mapper.insertOrder(order);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void insertOrderItem() {
		OrderItem orderItem = new OrderItem();
		orderItem.setOid(1);
		orderItem.setGoodsTitle("某品牌手机");
		Integer rows = mapper.insertOrderItem(orderItem);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void findById() {
		Integer id = 4;
		OrderVO data = mapper.findById(id);
		System.err.println(data);
	}
	
}








