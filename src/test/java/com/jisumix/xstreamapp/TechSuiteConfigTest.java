package com.jisumix.xstreamapp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jisumix.xstreamapp.config.Property;
import com.jisumix.xstreamapp.config.TechSuiteConfig;
import com.thoughtworks.xstream.XStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TechSuiteConfigTest {

	@Test
	public void testWriteTechSuiteConfig() {
		TechSuiteConfig tsc = new TechSuiteConfig();
		tsc.setType("techuser-conf");

		List<Property> props = new ArrayList<Property>();

		for (int i = 1; i < 10; i++) {
			Property prop = new Property();
			prop.setKey("key" + i);
			prop.setValue("value" + i);
			props.add(prop);
		}

		tsc.setProps(props);

		XStream xstream = new XStream();

		xstream.alias("config", TechSuiteConfig.class);
		xstream.useAttributeFor(TechSuiteConfig.class, "type");
		
		xstream.alias("item", Property.class);
		xstream.aliasField("key", Property.class, "key");
		xstream.aliasField("value", Property.class, "value");
		xstream.useAttributeFor(Property.class, "key");
		xstream.useAttributeFor(Property.class, "value");
		
		
		String xml = xstream.toXML(tsc);

		System.out.println(xml);
	}

	@Test
	public void testReadTechSuiteConfig() {
		String xml = "<config>"
				+ "<props>"
				+ "	   <item>"
				+ "  	<name>Name1</name>"
				+ "      <value>value1</value>"
				+ "    </item>"
				+ "    <item>"
				+ "      <name>Name2</name>"
				+ "      <value>value2</value>"
				+ "    </item>"
				+ "  </props>"
				+ "</config>";

		XStream xstream = new XStream();
		xstream.alias("config", TechSuiteConfig.class);
		xstream.alias("item", Property.class);
		
		TechSuiteConfig tsc = (TechSuiteConfig) xstream.fromXML(xml);
		
		int i;
		i=0;
		
	}
}
