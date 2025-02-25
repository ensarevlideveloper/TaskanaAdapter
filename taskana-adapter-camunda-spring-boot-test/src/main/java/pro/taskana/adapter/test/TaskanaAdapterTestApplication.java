package pro.taskana.adapter.test;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

import pro.taskana.adapter.configuration.AdapterConfiguration;
import pro.taskana.adapter.test.configuration.CamundaConfiguration;

/** Application to test the integration of Camunda BPM with REST API with the TASKANA Adapter. */
@EnableScheduling
@ComponentScan("pro.taskana.adapter")
@Import({AdapterConfiguration.class, CamundaConfiguration.class})
@SpringBootApplication
@EnableProcessApplication
public class TaskanaAdapterTestApplication {

  public static void main(String... args) {
    SpringApplication.run(TaskanaAdapterTestApplication.class, args);
  }

  // this method prevents checkstyle from thinking this class is a utility class
  public void dummy() {}
}
