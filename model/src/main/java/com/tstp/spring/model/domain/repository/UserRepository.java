package com.tstp.spring.model.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tstp.spring.model.domain.entity.User;

/**
 * @author sathaphorn.stp (Tis)
 * @since 13-06-2019, 00:08
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
