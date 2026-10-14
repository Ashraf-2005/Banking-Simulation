package db.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://bankingdb-mdashraf-3d6a.g.aivencloud.com:24859/defaultdb"
        + "?sslMode=VERIFY_CA"
        + "&trustCertificateKeyStoreUrl=file:C:/Users/CSE%20LAB%202/Documents/New%20folder/Banking-Simulation/aiven-truststore.jks"
        + "&trustCertificateKeyStorePassword=changeit";
    private static final String USER = "avnadmin";

    private static final String PASSWORD = System.getenv("AIVEN_DB_PASSWORD");


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

