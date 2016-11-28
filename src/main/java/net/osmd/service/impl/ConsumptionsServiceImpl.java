package net.osmd.service.impl;

import net.osmd.models.Consumptions;
import net.osmd.repository.ConsumptionsRepository;
import net.osmd.service.ConsumptionsService;
import org.springframework.stereotype.Service;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by WEO on 11/22/16.
 */

@Named
@ManagedBean
@SessionScoped
@Service
public class ConsumptionsServiceImpl implements ConsumptionsService {

    @Inject
    ConsumptionsRepository consumptionsRepository;

    @Override
    public Consumptions addService(Consumptions consumption) {
        Consumptions savedConsumption = consumptionsRepository.saveAndFlush(consumption);
        return savedConsumption;
    }

    @Override
    public void delete(int id) {
        consumptionsRepository.delete(id);
    }

    @Override
    public Consumptions getById(int id) {
        return consumptionsRepository.findOne(id);
    }

    @Override
    public Consumptions editConsumption(Consumptions consumption) {
        return consumptionsRepository.saveAndFlush(consumption);
    }

    @Override
    public List<Consumptions> getAll() {
        return consumptionsRepository.findAll();
    }
}
