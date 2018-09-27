package cn.itcast.core.service;

import org.springframework.stereotype.Service;

import cn.itcast.core.mapper.UserMapper;
import cn.itcast.core.pojo.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;
	@Override
	public void saveUser(User user) {
		userMapper.saveUser(user);

	}

}
