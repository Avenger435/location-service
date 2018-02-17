package com.banu.api.location;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.banu.api.location.model")
public class LocationConfiguration {

	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}
}
