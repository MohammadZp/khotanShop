package com.khotan.onlineShop.bizcrud;

import com.google.common.base.Strings;
import com.khotan.onlineShop.model.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import valueobjects.UserDTO;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public interface UserCRUD extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {

    @Query("FROM User user where user.username=:username")
    User getUserByUsername(String username);



    default List<User> searchUserByCriteria (UserDTO userDTO){
        return findAll(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if(!Strings.isNullOrEmpty(userDTO.getFirstName())) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("firstName"), userDTO.getFirstName())));
                }
                if(!Strings.isNullOrEmpty(userDTO.getLastName())) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("lastName"), userDTO.getLastName())));
                }
                if(userDTO.getAge() !=null) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("age"), userDTO.getAge())));
                }
                if(!Strings.isNullOrEmpty(userDTO.getUsername())) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("username"), userDTO.getUsername())));
                }
                if(!Strings.isNullOrEmpty(userDTO.getCustomerNumber())) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("customerNumber"), userDTO.getCustomerNumber())));
                }
                if(!Strings.isNullOrEmpty(userDTO.getPhoneNumber())) {
                    predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("phoneNumber"), userDTO.getPhoneNumber())));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
    }


}
