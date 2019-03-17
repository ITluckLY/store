package cn.tedu.store.service;

import cn.tedu.store.entity.Order;
import cn.tedu.store.service.exception.InsertException;
import cn.tedu.store.vo.OrderVO;

/**
 * 订单与订单商品的业务层接口
 */
public interface IOrderService {

	/**
	 * 创建订单
	 * @param uid 当前登录的用户的id
	 * @param username 当前登录的用户的用户名
	 * @param addressId 所选择的收货地址的数据id
	 * @param cartIds 订单中的商品在购物车中的数据id
	 * @return 成功创建的订单
	 */
	Order createOrder(
		Integer uid, String username,
		Integer addressId, Integer[] cartIds)
			throws InsertException;
	
	/**
	 * 根据id查询订单详情
	 * @param id 订单id
	 * @return 匹配的订单详情，如果没有匹配的数据，则返回null
	 */
	OrderVO getById(Integer id);
}






