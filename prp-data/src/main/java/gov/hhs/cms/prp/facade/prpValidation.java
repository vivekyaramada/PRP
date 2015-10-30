package gov.hhs.cms.prp.facade;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import gov.hhs.cms.prp.entity.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class prpValidation {

    private final static Logger LOGGER = Logger.getLogger(prpValidation.class.getName());


    public String checkLogin(LoginEntity datalogin,UserDetails userDetails) {
        if (datalogin.getUsername().equals("vivek") && datalogin.getPassword().equals("password")) {
            return "success";
        } else
            return "failure";
    }

    public String writeData(AddCheckEntity datachecks,UserDetails userDetails) {

        LOGGER.info("checkNumber2>>>" + datachecks.getCheckNumber());
        LOGGER.info("rsn2>>>" + datachecks.getRsn());
        LOGGER.info("checkName>2>>" + datachecks.getCheckName());
        LOGGER.info("note2>>>" + datachecks.getNote());
        LOGGER.info("checkDate2>>>" + datachecks.getCheckDate());
        LOGGER.info("checkNumber2>>>" + datachecks.getCheckNumber());
        LOGGER.info("rsn2>>>" + datachecks.getRsn());
        LOGGER.info("checkName>2>>" + datachecks.getCheckName());
        LOGGER.info("note2>>>" + datachecks.getNote());
        LOGGER.info("checkDate2>>>" + datachecks.getCheckDate());

       try {
            String urlString = "http://localhost:9093/prp-ws/hello/addcheck/"+ datachecks.getSponsor();
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
           LOGGER.info("the called urlString is" + urlString);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            conn.disconnect();
           return "success";
        } catch (MalformedURLException e) {
            e.printStackTrace();
           return "failure";
        } catch (IOException e) {
            e.printStackTrace();
           return "failure";
        }

    }

    public ArrayList getApplications(String keyword) {
        ArrayList applications = new ArrayList();
        Gson gson = new Gson();

        try {
            String urlString = "http://localhost:9093/prp-ws/hello/applications/" + keyword;
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            String response = br.readLine();
            Type listOfTestObject = new TypeToken<List<PrpAplctnEntity>>() {
            }.getType();
            ArrayList<PrpAplctnEntity> list = gson.fromJson(response, listOfTestObject);

            for (int i = 0; i < list.size(); i++) {
                applications.add(list.get(i));
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return applications;
    }

    public ArrayList getEvents(String keyword) {
        ArrayList events = new ArrayList();
        Gson gson = new Gson();

        try {
            String urlString = "http://localhost:9093/prp-ws/hello/events/" + keyword;
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            String response = br.readLine();
            Type listOfTestObject = new TypeToken<List<PrpEvntFinalEntity>>() { }.getType();
            ArrayList<PrpEvntFinalEntity> list = gson.fromJson(response, listOfTestObject);

            for (int i = 0; i < list.size(); i++) {
                events.add(list.get(i));
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return events;
    }
}











