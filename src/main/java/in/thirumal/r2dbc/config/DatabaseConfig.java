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
@EnableR2dbcRepositories
public class DatabaseConfig extends AbstractR2dbcConfiguration {

	@Override
	public ConnectionFactory connectionFactory() {
		return ConnectionFactories.get("r2dbc:postgresql://localhost:5432/poll");
	}

	/*@Override
	public ConnectionFactory connectionFactory() {
		return ConnectionFactories.get(new PostgresqlConnectionFactory(
                PostgresqlConnectionConfiguration.builder()
                .host("localhost")
                .port(5432)
                .username("postgres")
                .password("thirumal")
                .database("poll")
                .build()););
	}*/
	/*
	@Override
	public ConnectionFactory connectionFactory() {
		
		return ConnectionFactories.get(ConnectionFactoryOptions.builder()
				.option(ConnectionFactoryOptions.DRIVER, "postgresql")
				   .option(ConnectionFactoryOptions.HOST, "localhost")
				   .option(ConnectionFactoryOptions.PORT, 5432)  // optional, defaults to 5432
				   .option(ConnectionFactoryOptions.USER, "postgres")
				   .option(ConnectionFactoryOptions.PASSWORD, "thirumal")
				   .option(ConnectionFactoryOptions.DATABASE, "poll")  // optional
                .build());
	}*/

}
