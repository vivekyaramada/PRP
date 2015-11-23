package gov.hhs.cms.prp.facade;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import gov.hhs.cms.prp.entity.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.web.client.RestTemplate;

/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class prpValidation {

    final static Logger LOGGER = Logger.getLogger(prpValidation.class.getName());

    public String checkLogin(LoginEntity datalogin, UserDetails userDetails) {

        Gson gson = new Gson();

        try {

            String urlString = "http://localhost:9093/prp-ws/hello/checklogin/" + datalogin.getUsername() + "/" + userDetails.getUsername();

            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(urlString, String.class);

            Type listOfTestObject = new TypeToken<List<PrpUsersEntity>>() {
            }.getType();

            ArrayList<PrpUsersEntity> list = gson.fromJson(response, listOfTestObject);

            for (int i = 0; i < list.size(); i++) {

                if(list.get(i).getPasswd().equals(datalogin.getPassword()))
                {
                    return "success";
                }
            }

        }  catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }
        return  "failure";
    }

    public String writeData(AddCheckEntity datachecks,UserDetails userDetails) {

        LOGGER.info("checkNumber2>>>" + datachecks.getCheckNumber());
        LOGGER.info("rsn2>>>" + datachecks.getRsn());
        LOGGER.info("checkName>2>>" + datachecks.getCheckName());
        LOGGER.info("note2>>>" + datachecks.getNote());
        LOGGER.info("note2>>>" + datachecks.getNote());
        LOGGER.info("checkDate2>>>" + datachecks.getCheckDate());
        LOGGER.info("checkNumber2>>>" + datachecks.getCheckNumber());
        LOGGER.info("rsn2>>>" + datachecks.getRsn());
        LOGGER.info("checkName>2>>" + datachecks.getCheckName());
        LOGGER.info("note2>>>" + datachecks.getNote());
        LOGGER.info("checkDate2>>>" + datachecks.getCheckDate());

        try {
            String urlString = "http://localhost:9093/prp-ws/hello/addcheck/"+ datachecks.getSponsor()+ "/" + userDetails.getUsername();

            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(urlString, String.class);

            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "failure";
        }

    }

    public ArrayList getApplications(String keyword, UserDetails userDetails) {
        ArrayList applications = new ArrayList();
        Gson gson = new Gson();

        try {
            String urlString = "http://localhost:9093/prp-ws/hello/applications/" + keyword + "/" + userDetails.getUsername();
            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(urlString, String.class);

            Type listOfTestObject = new TypeToken<List<PrpAplctnEntity>>() {
            }.getType();
            ArrayList<PrpAplctnEntity> list = gson.fromJson(response, listOfTestObject);

            for (int i = 0; i < list.size(); i++) {
                applications.add(list.get(i));
            }

        }  catch (Exception e) {
            e.printStackTrace();
        }
        return applications;
    }

    public ArrayList getEvents(Integer keyPsid, Integer keyApplid, UserDetails userDetails) {
        ArrayList events = new ArrayList();
        Gson gson  = new Gson();
        int psid   = 0;
        int applid = 0;
        if (keyPsid   != null)    psid   = keyPsid.intValue();
        if (keyApplid != null)    applid = keyApplid.intValue();

        try {
            String urlString = "http://localhost:9093/prp-ws/hello/events/"
                    + psid
                    + "/"
                    + applid
                    + "/"
                    + userDetails.getUsername();
            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(urlString, String.class);

            Type listOfTestObject = new TypeToken<List<PrpEvntFinalEntityCatData>>() { }.getType();
            ArrayList<PrpEvntFinalEntityCatData> list = gson.fromJson(response, listOfTestObject);

            for (PrpEvntFinalEntityCatData event : list) {
                PrpEvntFinalEntity eventCat = event.getFinalEntityByCategory();
                events.add(eventCat);
            }
        }  catch (Exception e) {
            LOGGER.info("prpValidation.getEvents exception: " + e.getMessage());
            e.printStackTrace();
        }
        return events;
    }

    public int    updateEvent (PrpEvntFinalEntity event, UserDetails userDetails) {
        displayTest(event);
        String eventString  = new Gson().toJson(event);
        String eventEscape  = escapeString(eventString);
        try {
            String urlString    = "http://localhost:9093/prp-ws/hello/updateevent/"
                                + eventEscape
                                + "/"
                                + userDetails.getUsername();
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject(urlString, Integer.class);
        }
        catch (Exception e) {
            LOGGER.info("exception: " + e.getClass().getName() + " " + e.getMessage());
            e.printStackTrace();
        }
        return 0;
    }

    private String  escapeString (String inString) {
        StringBuffer sb   = new StringBuffer ();
        int          lgth = inString.length();
        for (int a=0; a<lgth; a++) {
            char x = inString.charAt(a);
            if      (x == '{') sb.append("%7B");
            else if (x == '}') sb.append("%7D");
            else               sb.append(x);
        }
        return sb.toString();
    }

    private void    displayTest (PrpEvntFinalEntity event) {
        LOGGER.info("category data: " + event.getEvntCtgry() + " " + event.getEvntCtgryData());
    }
}