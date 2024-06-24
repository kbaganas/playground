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

    default ImmigrantModel getImmigrantRecord(Integer id) {
        // retrieve Immigrant by id from the DB
        Optional<ImmigrantModel> immigrantModel = findById(id);
        if (immigrantModel.isPresent()) {
            logger.info("Immigrant record retrieved from DB: {}", immigrantModel.get().toString());
            return immigrantModel.get();
        }
        logger.info("Immigrant record is not found in DB, id: {}", id.toString());
        return null;
    }
}
