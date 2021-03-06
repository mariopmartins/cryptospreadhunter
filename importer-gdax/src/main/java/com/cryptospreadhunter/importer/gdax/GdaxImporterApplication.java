package com.cryptospreadhunter.importer.gdax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.cryptospreadhunter.core.CoreConfiguration;

@SpringBootApplication
@Import(CoreConfiguration.class)
public class GdaxImporterApplication implements CommandLineRunner {

	@Autowired
	private GdaxImporter poloniexImporter;

	@Override
	public void run(String... args) {
		poloniexImporter.start();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GdaxImporterApplication.class, args);
	}
}
