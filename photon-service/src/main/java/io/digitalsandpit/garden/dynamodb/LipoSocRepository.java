package io.digitalsandpit.garden.dynamodb;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@EnableScan
public interface LipoSocRepository extends CrudRepository<LipoSoc, String> {

//    List<LipoSoc> findByData(double data);
//    List<LipoSoc> findByTimestamp(Date timestamp);
}
