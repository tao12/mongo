package com.tao.factory;

public class MongoConnectionFactory {
	private static String connection = null;

	public String getConnection() {
		if (connection != null) {
			return connection;
		} else {
			connection = "TODO: connection produced by factory";
			return connection;
		}
	}
}
