package com.deliveryboy.service;

import com.deliveryboy.config.AppConstants;
import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

//    private Logger logger = LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location)
    {
        this.kafkaTemplate.send(AppConstants.LOCATION_APP_CONSTANTS, location);
//        this.logger.info("Location produced");
        return true;
    }

}
