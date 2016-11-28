package net.osmd.service;

import net.osmd.models.Consumptions;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.util.List;

/**
 * Created by WEO on 11/22/16.
 */

@Named
public interface ConsumptionsService {
    Consumptions addService(Consumptions consumption);
    void delete(int id);
    Consumptions getById(int id);
    Consumptions editConsumption(Consumptions consumption);
    List<Consumptions> getAll();
}
