package org.nissan.ims.common.dao;

import org.nissan.ims.common.entity.UserEntity;
import org.nissan.ims.common.model.User;
import org.nissan.ims.common.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class UserDAO {

	@Autowired
	UserRepository userRepository;
	
	public void saveUserDetails(User user) {
		UserEntity userEntity  = new UserEntity();
		
		userEntity.setFirstName(user.getFirstName());
		userEntity.setSurName(user.getSurName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPassword(user.getPassword());
		userEntity.setGender(user.getGender());
		userEntity.setAddress(user.getAddress());
		userEntity.setPostCode(user.getPostCode());
		userEntity.setCountry(user.getCountry());
		userEntity.setState(user.getState());
		userEntity.setCity(user.getCity());
		userEntity.setAgreement(user.getAgreement());
		
		userRepository.save(userEntity);
	}
}
