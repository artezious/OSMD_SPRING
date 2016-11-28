package net.osmd.service;

import net.osmd.models.Payments;

import javax.inject.Named;
import java.util.List;

/**
 * Created by WEO on 11/22/16.
 */

@Named
public interface PaymentsService {
    Payments addPayment(Payments payment);
    void delete(int id);
    Payments getById(int id);
    Payments editPayment(Payments payment);
    List<Payments> getAll();
}
