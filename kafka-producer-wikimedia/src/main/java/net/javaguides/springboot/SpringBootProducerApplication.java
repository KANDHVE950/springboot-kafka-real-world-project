package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {
    public SpringBootProducerApplication(WikimediaChangesProducer wikimediaChangesProducer) {
        this.wikimediaChangesProducer = wikimediaChangesProducer;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class);
    }
    @Autowired
    private WikimediaChangesProducer wikimediaChangesProducer;

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
        System.out.println("running method called!");
    }
}
