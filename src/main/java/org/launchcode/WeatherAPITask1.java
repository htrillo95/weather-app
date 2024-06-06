package org.launchcode;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;



public class WeatherAPITask1 {

//        private static final String API_KEY = "your_api_key_here";
//        private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=";
//
//        public static String getWeather(String location) throws IOException {
//        String urlString = BASE_URL + location + "&appid=" + API_KEY;
//        URL url = new URL(urlString);
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestMethod("GET");
//        conn.connect();
//
//        if (conn.getResponseCode() != 200) {
//            throw new RuntimeException("HttpResponseCode: " + conn.getResponseCode());
//        }
//
//        Scanner sc = new Scanner(url.openStream());
//        StringBuilder inline = new StringBuilder();
//        while (sc.hasNext()) {
//            inline.append(sc.nextLine());
//        }
//        sc.close();
//
//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode jsonNode = mapper.readTree(inline.toString());
//
//        // Extract required data
//        String weatherDescription = jsonNode.get("weather").get(0).get("description").asText();
//        double temperature = jsonNode.get("main").get("temp").asDouble();
//
//        return "Weather: " + weatherDescription + ", Temperature: " + (temperature - 273.15) + "°C"; // Convert Kelvin to Celsius
//    }



}
