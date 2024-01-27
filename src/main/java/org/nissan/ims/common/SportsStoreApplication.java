package org.nissan.ims.common;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.WebApplicationInitializer;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@SpringBootApplication
public class SportsStoreApplication implements WebApplicationInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SportsStoreApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
