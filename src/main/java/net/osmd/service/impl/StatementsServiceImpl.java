package net.osmd.service.impl;

import net.osmd.models.Statements;
import net.osmd.repository.StatementsRepository;
import net.osmd.service.StatementsService;
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
public class StatementsServiceImpl implements StatementsService {

    @Inject
    private StatementsRepository statementsRepository;

    @Override
    public Statements addStatement(Statements statement) {
        Statements savedStatement = statementsRepository.saveAndFlush(statement);
        return savedStatement;
    }

    @Override
    public void delete(int id) {
        statementsRepository.delete(id);
    }

    @Override
    public Statements getById(int id) {
        return statementsRepository.findOne(id);
    }

    @Override
    public Statements editStatement(Statements statement) {
        return statementsRepository.saveAndFlush(statement);
    }

    @Override
    public List<Statements> getAll() {
        return statementsRepository.findAll();
    }
}
