package com.screenmatch.screenmatch;

import com.screenmatch.screenmatch.mapper.DataConvertImpl;
import com.screenmatch.screenmatch.model.SerieModel;
import com.screenmatch.screenmatch.service.ClientRest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ClientRest clientRest = new ClientRest();
		DataConvertImpl dataConvertImpl = new DataConvertImpl();

		var jsonData = clientRest.obterDados("");
		System.out.println(jsonData);

		System.out.println(dataConvertImpl.getData(jsonData, SerieModel.class));
	}
}
