package net.osmd.service;

import net.osmd.models.Statements;

import javax.inject.Named;
import java.util.List;

/**
 * Created by WEO on 11/22/16.
 */

@Named
public interface StatementsService {
    Statements addStatement(Statements statement);
    void delete(int id);
    Statements getById(int id);
    Statements editStatement(Statements statement);
    List<Statements> getAll();
}
