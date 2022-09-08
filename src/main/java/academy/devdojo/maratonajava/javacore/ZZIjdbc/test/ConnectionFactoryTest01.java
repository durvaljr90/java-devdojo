package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProduceService;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {

        Producer producer = Producer.ProducerBuilder.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.ProducerBuilder.builder().id(1).name("MADHOUSE").build();

//        ProduceService.save(producer);
//        ProduceService.delete(3);
//        ProduceService.update(producerToUpdate);
//        List<Producer> producers = ProduceService.findAll();
//        List<Producer> producers = ProduceService.findByName("ma");
//        log.info("Producers found '{}'", producers);
//        ProduceService.showProducerMetaData();
//        ProduceService.showDriveMetaData();
        List<Producer> byNameCallableStatement = ProduceService.findByNameCallableStatement("NHK");
        log.info(byNameCallableStatement);

    }

}
