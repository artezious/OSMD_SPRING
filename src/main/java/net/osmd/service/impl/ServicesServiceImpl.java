package net.osmd.service.impl;

import net.osmd.models.Services;
import net.osmd.repository.ServicesRepository;
import net.osmd.service.ServicesService;
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
public class ServicesServiceImpl implements ServicesService {

    @Inject
    ServicesRepository servicesRepository;

    @Override
    public Services addService(Services service) {
        Services savedService = servicesRepository.saveAndFlush(service);
        return savedService;
    }

    @Override
    public void delete(int id) {
        servicesRepository.delete(id);
    }

    @Override
    public Services getById(int id) {
        return servicesRepository.findOne(id);
    }

    @Override
    public Services editService(Services service) {
        return servicesRepository.saveAndFlush(service);
    }

    @Override
    public List<Services> getAll() {
        return servicesRepository.findAll();
    }
}
