package univ.lecture.riotapi.controller;

import lombok.extern.log4j.Log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import univ.lecture.riotapi.model.Summoner;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by tchi on 2017. 4. 1..
 */

@RestController
@RequestMapping("/api/v1")
@Log4j

/*
public class RiotApiController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/summoner/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Summoner querySummoner(@PathVariable("name") String summonerName) throws UnsupportedEncodingException {
        final String url = "https://kr.api.pvp.net/api/lol/kr/v1.4/summoner/by-name/" +
                summonerName +
                "?api_key=7f69a913-a7e3-4d41-b343-6389ba6fe730";

        String response = restTemplate.getForObject(url, String.class);
        Map<String, Object> parsedMap = new JacksonJsonParser().parseMap(response);

        parsedMap.forEach((key, value) -> log.info(String.format("key [%s] type [%s] value [%s]", key, value.getClass(), value)));

        Map<String, Object> summonerDetail = (Map<String, Object>) parsedMap.values().toArray()[0];
        String queriedName = (String)summonerDetail.get("name");
        int queriedLevel = (Integer)summonerDetail.get("summonerLevel");
        Summoner summoner = new Summoner(queriedName, queriedLevel);

        return summoner;
    }
}
*/
public class RiotApiController {
    @Autowired
    Calculator cal = new Calculator();
    
    /*
    private RestTemplate restTemplate;
    
    @RequestMapping(value = "/summoner/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Summoner querySummoner(@PathVariable("name") String summonerName) throws UnsupportedEncodingException {
        final String url = "https://kr.api.pvp.net/api/lol/kr/v1.4/summoner/by-name/" +
                summonerName +
                "?api_key=7f69a913-a7e3-4d41-b343-6389ba6fe730";
                

        String response = restTemplate.getForObject(url, String.class);
        */
//      Map<String, Object> parsedMap = new JacksonJsonParser().parseMap(response);
        
//      parsedMap.forEach((key, value) -> log.info(String.format("key [%s] type [%s] value [%s]", key, value.getClass(), value)));

//      Map<String, Object> summonerDetail = (Map<String, Object>) parsedMap.values().toArray()[0];
//      String queriedName = (String)summonerDetail.get("name");
//      int queriedLevel = (Integer)summonerDetail.get("summonerLevel");
    	String teamname = "15";
    	long now = System.currentTimeMillis();
    //	double result = cal.calculate();
        Summoner summoner = new Summoner(teamname, now, result);

        return summoner;
    
}