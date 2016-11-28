package net.osmd.service.impl;

import net.osmd.models.Payments;
import net.osmd.repository.PaymentsRepository;
import net.osmd.service.PaymentsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by WEO on 11/22/16.
 */
@Named
@ManagedBean
@SessionScoped
@Service
public class PaymentsServiceImpl implements PaymentsService {

    @Inject
    PaymentsRepository paymentsRepository;

    @Override
    public Payments addPayment(Payments payment) {

        Payments savedPayment = paymentsRepository.saveAndFlush(payment);

        return savedPayment;
    }

    @Override
    public void delete(int id) {
        paymentsRepository.delete(id);
    }

    @Override
    public Payments getById(int id) {
        return paymentsRepository.findOne(id);
    }

    @Override
    public Payments editPayment(Payments payment) {
        return paymentsRepository.saveAndFlush(payment);
    }

    @Override
    public List<Payments> getAll() {
        return paymentsRepository.findAll();
    }
}
