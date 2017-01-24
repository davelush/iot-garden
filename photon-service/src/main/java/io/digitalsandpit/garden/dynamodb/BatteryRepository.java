package io.digitalsandpit.garden.dynamodb;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface BatteryRepository extends CrudRepository<Battery, String> {

//    List<Battery> findByData(double data);
//    List<Battery> findByTimestamp(Date timestamp);
}
