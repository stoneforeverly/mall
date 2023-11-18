package com.macro.mall.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.macro.mall.model.PmsProduct;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MallDemoApplicationTests {
//	private Logger logger = LoggerFactory.getLogger(MallDemoApplicationTests.class);
	@Test
	public void contextLoads() {
	}

	@Test
	public void testLogStash() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		PmsProduct product = new PmsProduct();
		product.setId(1L);
		product.setName("小米手机");
		product.setBrandName("小米");
		log.info(product.toString());
		log.info(mapper.writeValueAsString(product));
		log.error(mapper.writeValueAsString(product));
	}

}
