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


    @Query(value = "select count(*)  from t_Categoryelement ctelement inner join t_Category catg on ctelement.c_category=catg.id where ctelement.c_code=:categoryElementCode" +
            " and catg.c_name=:categoryName",nativeQuery = true)
    Long findByCategoryCode(String categoryElementCode,String categoryName);

}