# employeetask
package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendenceDAO extends CrudRepository<Attendence, Integer> {

}
