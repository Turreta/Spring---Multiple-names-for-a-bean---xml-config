package com.turreta.springboot.springcore.beanalias.xmlconfig.comturretaspringbootspringcorebeanaliasxmlconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ComTurretaSpringbootSpringcoreBeanaliasXmlconfigApplication
{

	public static void main(String[] args)
	{
		final ConfigurableApplicationContext context = SpringApplication
				.run(ComTurretaSpringbootSpringcoreBeanaliasXmlconfigApplication.class, args);

		final BeanTwo bean = context.getBean(BeanTwo.class);

		System.out.println(bean);
	}
}
