package cn.tedu.store.service.impl;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.IUserService;
import cn.tedu.store.service.exception.DuplicateKeyException;
import cn.tedu.store.service.exception.InsertException;
import cn.tedu.store.service.exception.PasswordNotMatchException;
import cn.tedu.store.service.exception.UpdateException;
import cn.tedu.store.service.exception.UserNotFoundException;

public class UserServiceImpl2 implements IUserService {

	@Override
	public User reg(User user) throws DuplicateKeyException, InsertException {
		System.err.println("UserServiceImpl2.reg()");
		return null;
	}

	@Override
	public User login(String username, String password) throws UserNotFoundException, PasswordNotMatchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePassword(Integer uid, String oldPassword, String newPassword)
			throws UserNotFoundException, PasswordNotMatchException, UpdateException {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeAvatar(Integer uid, String avatar) throws UserNotFoundException, UpdateException {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeInfo(User user) throws UserNotFoundException, UpdateException {
		// TODO Auto-generated method stub

	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
