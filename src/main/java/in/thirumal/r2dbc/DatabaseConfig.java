/**
 * 
 */
package in.thirumal.r2dbc;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import io.r2dbc.spi.ConnectionFactory;

/**
 * @author thirumal
 *
 */
//@Configuration
//@EnableR2dbcRepositories
public class DatabaseConfig extends AbstractR2dbcConfiguration {

	@Override
	public ConnectionFactory connectionFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
