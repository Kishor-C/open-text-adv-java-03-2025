package com.opentext;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * It has to only extend JpaRepository or CrudRepository<T, ID>
 */
public interface UserDao extends JpaRepository<Users, Integer>{
	/*
	 * T save(T) -> is inherited as User save(User)
	 * List<T> findAll() -> is inherited as List<Users> findAll()
	 */
}
