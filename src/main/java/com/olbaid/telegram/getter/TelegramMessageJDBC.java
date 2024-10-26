package com.olbaid.telegram.getter;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;
import io.quarkus.arc.lookup.LookupIfProperty;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;

@LookupIfProperty(name = "telegram.message.impl", stringValue = "jdbc")
@ApplicationScoped
public class TelegramMessageJDBC implements TelegramMessageGetter {

	private static final Logger LOG = LoggerFactory.getLogger(TelegramMessageJDBC.class);

	@Inject
	@DataSource("bot")
	private AgroalDataSource botDataSource;

	@ConfigProperty(name = "jdbc.query")
	private String jdbcQuery;

	public String getObject() {
		StringBuilder queryResults = new StringBuilder();
		try( Connection connection = botDataSource.getConnection(); ) {
			PreparedStatement stmt = connection.prepareStatement(jdbcQuery);
			stmt.setInt(1, 1);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				queryResults.append(resultSet.getString("ID"));
				LOG.info(queryResults.toString());
			}
		} catch (SQLException e) {
			LOG.error(e.getMessage());
		}
		return queryResults.toString();
	}

}
