package com.carsandtea.repository;

import com.carsandtea.entity.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends BaseRepository<User> {

}
