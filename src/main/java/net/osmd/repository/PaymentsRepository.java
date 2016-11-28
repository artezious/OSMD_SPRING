package net.osmd.repository;

import net.osmd.models.Payments;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by WEO on 11/22/16.
 */
public interface PaymentsRepository extends JpaRepository <Payments, Integer> {
}
