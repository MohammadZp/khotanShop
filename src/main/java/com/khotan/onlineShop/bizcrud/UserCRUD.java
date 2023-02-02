package com.khotan.onlineShop.bizcrud;

import com.khotan.onlineShop.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserCRUD extends CrudRepository<User, Long> {

    @Query("FROM User user where user.username=:username")
    User getUserByUsername(String username);

}
