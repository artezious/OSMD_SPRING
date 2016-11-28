package net.osmd.repository;

import net.osmd.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by WEO on 11/22/16.
 */
public interface UsersRepository extends JpaRepository <Users, Integer> {
    @Query("select b from Users b where b.name = :name")
    Users findByName(@Param("name") String name);
}
