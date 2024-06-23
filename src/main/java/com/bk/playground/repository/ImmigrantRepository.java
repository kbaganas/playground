package com.bk.playground.repository;

import com.bk.playground.kafka.producer.MessageProducer;
import com.bk.playground.model.ImmigrantModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImmigrantRepository {

    @Autowired
    MessageProducer messageProducer;

    private static final Logger logger = LogManager.getLogger(ImmigrantRepository.class);

    public boolean createImmigrantRecord(ImmigrantModel model) {
        logger.info("immigrant_fistName: {}", model.getFistName());
        logger.info("immigrant_surName: {}", model.getSurName());
        logger.info("immigrant_originatingCountry: {}", model.getOriginatingCountry());
        logger.info("immigrant_personalIDNumber: {}", model.getPersonalIDNumber());
        logger.info("immigrant_personalIDType: {}", model.getPersonalIDType());
        // storage to a DB is supposed to take place here
        // Models are the object used by the repository layer to call the Database
        return true;
    }

    public boolean sendImmigrantMessage(ImmigrantModel model) {
        String message = model.getFistName() + " " + model.getSurName() +
                ", coming from " + model.getOriginatingCountry() +
                " with ID: " + model.getPersonalIDNumber() + ", ID Type: " + model.getPersonalIDType();
        messageProducer.sendMessage("immigrants", message);
        return true;
    }
}
