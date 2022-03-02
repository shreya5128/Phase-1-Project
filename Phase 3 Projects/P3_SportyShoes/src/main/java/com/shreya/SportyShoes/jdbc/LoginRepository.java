package com.shreya.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.shreya.SportyShoes.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>  {

	Login findByUsernameAndPassword(String username, String password);
	Login findByUsername(String username);
	
	@Modifying
	@Query("update Login log set log.password = :password where log.id = :id")
	void changePassword(@Param(value="password") String password, @Param(value = "id") Long id);

}
