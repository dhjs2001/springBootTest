package kr.or.connect.roleapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
class RoleappApplicationTests {

	@Autowired
	DataSource dataSource;
	
	@Test
	public void connectionTest() throws Exception{
		Connection conn = dataSource.getConnection();
		
		assertNotNull(conn);
		
		conn.close();
	}

}
