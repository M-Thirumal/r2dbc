/**
 * 
 */
package in.thirumal.r2dbc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;

/**
 * @author thirumal
 *
 */
@Configuration
//@EnableR2dbcRepositories
public class DatabaseConfig extends AbstractR2dbcConfiguration {

	@Override
	public ConnectionFactory connectionFactory() {
		return ConnectionFactories.get("r2dbc:postgresql://localhost:5432/poll");
	}

}
