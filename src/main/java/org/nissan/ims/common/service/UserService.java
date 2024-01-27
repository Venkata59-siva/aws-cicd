package org.nissan.ims.common.service;

import org.nissan.ims.common.dao.UserDAO;
import org.nissan.ims.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	@Autowired
	UserDAO userDAO;
	
	@Transactional
	public void saveUserDetails(User user) {
		userDAO.saveUserDetails(user);
	}
}
