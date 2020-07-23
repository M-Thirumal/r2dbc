/**
 * 
 */
package in.thirumal.r2dbc.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import in.thirumal.r2dbc.model.Test;

/**
 * @author thirumal
 *
 */

public interface TestRepository extends ReactiveCrudRepository<Test, Long> {

}
