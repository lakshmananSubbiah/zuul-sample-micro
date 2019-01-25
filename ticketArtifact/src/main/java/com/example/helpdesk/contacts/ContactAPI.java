package com.example.helpdesk.contacts;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;


public class ContactAPI {

	public static Contact get(Long contactId) {
		ContactAPI c = new ContactAPI();
		try {
			HttpClient client = new DefaultHttpClient();
			HttpGet get = new HttpGet(c.getUrl()+"?contactId="+contactId);
			HttpResponse response = client.execute(get);
			if(response.getStatusLine().getStatusCode() == 200) {
				JSONObject contactObj = new JSONObject(EntityUtils.toString(response.getEntity()));
				Contact contact = new Contact(contactObj.getString("firstName"),contactObj.getString("lastName"));
				return contact;
			}	
		}
		catch(Exception e) {
			return null;
		}
		return null;
	}
	
	public String getUrl() throws IOException {
		Properties prop = new Properties();
		String propFileName = "config.properties";

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		prop.load(inputStream);
		return prop.getProperty("url");
	}
}
