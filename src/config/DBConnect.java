package config;

// connection을 위한 각종 parameter를 DB.properties에 저장해 놓고, 이를 읽어서 connection을 설정한다.
// config라는 패키지를 만들어 DB.properties를 설정하였다.

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnect {
    //static 인 이유 : DB를 하나만 사용할 거라서, DB를 여러개 사용하면 static 사용을 안해도 된다.
    static String JDBC_DRIVER_NAME;
    static String DB_URL;
    static String USER_ID;
    static String USER_PASSWORD;
    
    // property 파일에서 설정된 내용들을 읽어들인다.
    static void readProperties() throws IOException {
        Properties properties = new Properties();
        InputStream inputstream = 
                DBConnect.class.getClassLoader().getResourceAsStream("config/DB.properties");
        properties.load(inputstream);
        JDBC_DRIVER_NAME = properties.getProperty("JDBC_DRIVER_NAME");
        DB_URL = properties.getProperty("DB_URL");
        USER_ID = properties.getProperty("USER_ID");
        USER_PASSWORD = properties.getProperty("USER_PASSWORD");
    }
    
    // property 파일에 설정된 내용에 따라, connection을 설정하여 반환한다.
    public static Connection getConnection() throws Exception {
        if (JDBC_DRIVER_NAME == null) readProperties();
        Class.forName(JDBC_DRIVER_NAME);//해당되는 JDBC 드라이버 클래스를 로드한다. 강의노트 1.에 해당
        return DriverManager.getConnection(DB_URL, USER_ID, USER_PASSWORD);
              // 데이터베이스 연결. 강의노트 2.에 해당
    }

}
