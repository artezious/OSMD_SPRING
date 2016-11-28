package net.osmd.repository;

import net.osmd.models.Services;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by WEO on 11/22/16.
 */
public interface ServicesRepository extends JpaRepository <Services, Integer> {
}
