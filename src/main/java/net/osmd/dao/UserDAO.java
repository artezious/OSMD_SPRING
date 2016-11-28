package net.osmd.dao;

import net.osmd.models.Users;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

import static net.osmd.dao.Singleton.ENTITY_MANAGER;

/**
 * Created by WEO on 9/12/16.
 */

@Repository
public class UserDAO {

    EntityManager entityManager = ENTITY_MANAGER.getEntityManager();

    public List<Users> getEntity() {
        return entityManager.createQuery("Select User from UserEntity user").getResultList();
    }

    public void addEntity(Users entity) {
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
    }

    public void removeEntity(Integer id) {}
}
