package net.osmd.repository;

import net.osmd.models.Statements;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by WEO on 11/22/16.
 */
public interface StatementsRepository extends JpaRepository<Statements, Integer> {
}
