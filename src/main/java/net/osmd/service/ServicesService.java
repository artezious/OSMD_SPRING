package net.osmd.service;

import net.osmd.models.Services;

import javax.inject.Named;
import java.util.List;

/**
 * Created by WEO on 11/22/16.
 */

@Named
public interface ServicesService {
    Services addService (Services service);
    void delete (int id);
    Services getById (int id);
    Services editService (Services service);
    List<Services> getAll();
}
