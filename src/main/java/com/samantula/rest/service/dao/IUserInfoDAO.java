package com.samantula.rest.service.dao;

import com.samantula.rest.entity.UserInfo;

public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}