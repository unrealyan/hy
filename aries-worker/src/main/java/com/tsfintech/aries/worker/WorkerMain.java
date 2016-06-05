package com.tsfintech.aries.worker;

import com.tsfintech.aries.core.CoreConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by erric on 6/1/16.
 */
@SpringBootApplication
@Import(CoreConfig.class)
@EnableScheduling
public class WorkerMain {

    public static void main(String[] args) {
        SpringApplication.run(WorkerMain.class, args);
    }

}
