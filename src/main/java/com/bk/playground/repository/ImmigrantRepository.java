package com.bk.playground.repository;

import com.bk.playground.model.ImmigrantModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImmigrantRepository extends JpaRepository<ImmigrantModel, Integer> {

    Logger logger = LogManager.getLogger(ImmigrantRepository.class);

    default boolean createImmigrantRecord(ImmigrantModel model) {
        // TODO
        save(model);
        logger.info("Immigrant record created in DB");
        return true;
    }

    default boolean getImmigrantRecord(Integer id) {
        // TODO
        // retrieve Immigrant by id from the DB
        Optional<ImmigrantModel> immigrantModel = findById(id);
        logger.info("Immigrant record retrieved from DB: {}", immigrantModel);
        return true;
    }
}
