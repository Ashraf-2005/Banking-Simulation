package db.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DBconnections {
        public static void main(String[] args) {
            String url = "jdbc:mysql://bankingdb-mdashraf-3d6a.g.aivencloud.com:24859/defaultdb"
        + "?sslMode=VERIFY_CA"
        + "&trustCertificateKeyStoreUrl=file:C:/Users/CSE%20LAB%202/Documents/New%20folder/Banking-Simulation/aiven-truststore.jks"
        + "&trustCertificateKeyStorePassword=changeit";
        String user = "avnadmin";

        String password = System.getenv("AIVEN_DB_PASSWORD");


            try {
                Connection conn = DriverManager.getConnection(url, user, password);
                System.out.println("✅ Connected successfully!");
            } catch (SQLException e) {
                System.out.println("❌ Connection failed!");
                e.printStackTrace();
            }
        }
    }


