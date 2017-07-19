package com.jisumix.xstreamapp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jisumix.xstreamapp.config.DoctypeConfig;
import com.jisumix.xstreamapp.config.Stylesheet;
import com.jisumix.xstreamapp.config.TechwebXslt;
import com.thoughtworks.xstream.XStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DoctypeConfigTest {

	@Test
	public void testWriteDoctypeConfig() {
		DoctypeConfig dtc = new DoctypeConfig();
		dtc.setType("doctype-conf");
		dtc.setRoottag("book");

		List<Stylesheet> stylesheets = new ArrayList<Stylesheet>();
		for(int i=0;i<3;i++){
			Stylesheet ss = new Stylesheet();
			ss.setContent("Stylesheet"+i);
			stylesheets.add(ss);
		}
		dtc.setStylesheets(stylesheets);
		
		
		
		TechwebXslt tx = new TechwebXslt();
		tx.setType("xslt");
		tx.setValue("/doctypes/flightbook/flightbookhtml.xsl");
		dtc.setTechwebXslt(tx);

		XStream xstream = new XStream();
		xstream.processAnnotations(DoctypeConfig.class);
//		xstream.processAnnotations(Stylesheet.class);
		
		String xml = xstream.toXML(dtc);

		System.out.println(xml);
	}
}
