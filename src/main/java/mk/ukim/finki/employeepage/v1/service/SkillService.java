package mk.ukim.finki.employeepage.v1.service;


import mk.ukim.finki.employeepage.v1.model.exceptions.InvalidSkillIdException;
import mk.ukim.finki.employeepage.v1.model.Skill;

import java.util.List;

public interface SkillService {

    /**
     * returns the entity with the given id
     *
     * @param id The id of the entity that we want to obtain
     * @return
     * @throws InvalidSkillIdException when there is no  location with the given id
     */
    Skill findById(Long id);

    /**
     * @return List of all entities in the database
     */
    List<Skill> listAll();

    /**
     * This method is used to create a new entity, and save it in the database.
     *
     * @param name
     * @return The entity that is created. The id should be generated when the entity is created.
     */
    Skill create(String name);
}
