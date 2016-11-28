package net.osmd.repository;

import net.osmd.models.Consumptions;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by WEO on 11/22/16.
 */
public interface ConsumptionsRepository extends JpaRepository <Consumptions, Integer> {
}
