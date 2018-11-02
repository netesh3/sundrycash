package com.wallet.sundrycash.repository;

import com.wallet.sundrycash.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

//    @Query(value = "SELECT * FROM user WHERE firstNmae = 'Netesh'", nativeQuery = true)
//    public List<User> findByFirstName(@Param("LastName") String lastName);

}
