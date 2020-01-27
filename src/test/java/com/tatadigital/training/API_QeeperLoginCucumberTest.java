package com.tatadigital.training;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberBaseTest;

import cucumber.api.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features/TrainingLogin.feature",
        glue = "com.tatadigital.training.cucumber.steps",
        		format={"pretty",
                "html:target/TrainingLogin-test-report",
                "pretty:target/TrainingLogin-test-report.txt",
                "json:target/TrainingLogin-test-report.json",
                "junit:target/TrainingLogin-test-report.xml"}
        )

public class API_QeeperLoginCucumberTest extends CucumberBaseTest {

	}
