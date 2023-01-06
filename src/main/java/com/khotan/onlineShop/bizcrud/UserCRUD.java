package com.khotan.onlineShop.bizcrud;

import com.khotan.onlineShop.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCRUD extends CrudRepository<User,Long> {

}
