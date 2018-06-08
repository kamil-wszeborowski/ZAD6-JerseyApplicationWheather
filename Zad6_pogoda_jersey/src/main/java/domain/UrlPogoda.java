package domain;

public class UrlPogoda {
	//public static final String URL = "http://api.openweathermap.org/data/2.5/weather?id=6695624&units=metric&APPID=08db29b7a1cea3ec1c61886beb553e9f";
	String url;
	
	public String getUrl(int id) { 
		String appID = "08db29b7a1cea3ec1c61886beb553e9f";
		String url = ("http://api.openweathermap.org/data/2.5/weather?id=" + id + "&units=metric" + "&APPID="+appID) ;
		return url;
	}
}
