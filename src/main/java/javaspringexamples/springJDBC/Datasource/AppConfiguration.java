package javaspringexamples.springJDBC.Datasource;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */

@Configuration
public class AppConfiguration {
	@Bean
	public DataSource dataSource() {
		SingleConnectionDataSource dataSource = new SingleConnectionDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/javaspringexamples");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
}
