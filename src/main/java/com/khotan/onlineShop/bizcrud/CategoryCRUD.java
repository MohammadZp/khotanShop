package com.khotan.onlineShop.bizcrud;

import com.khotan.onlineShop.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryCRUD extends CrudRepository<Category, Long> {
}
