package com.tsfintech.aries.worker.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by erric on 6/1/16.
 */
@Component
public class LoanValidateJob {

    @Scheduled(fixedDelay = 10000L)
    public void runValidation() {
        System.out.println(new Date());
    }

}
