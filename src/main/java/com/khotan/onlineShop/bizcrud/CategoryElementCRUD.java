package com.khotan.onlineShop.bizcrud;

import com.khotan.onlineShop.model.CategoryElement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryElementCRUD extends CrudRepository<CategoryElement,Long> {


    @Query("FROM CategoryElement element where element.code=:categoryCode")
    List<CategoryElement> getCategoryPossibleValues(String categoryCode);

}