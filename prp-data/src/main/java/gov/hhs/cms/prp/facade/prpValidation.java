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
import org.springframework.web.client.RestTemplate;



/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class prpValidation {

    final static Logger logger = Logger.getLogger(prpValidation.class.getName());


    public String checkLogin(LoginEntity datalogin,UserDetails userDetails) {

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

        logger.info("checkNumber2>>>" + datachecks.getCheckNumber());
        logger.info("rsn2>>>" + datachecks.getRsn());
        logger.info("checkName>2>>" + datachecks.getCheckName());
        logger.info("note2>>>" + datachecks.getNote());
        logger.info("checkDate2>>>" + datachecks.getCheckDate());
        logger.info("checkNumber2>>>" + datachecks.getCheckNumber());
        logger.info("rsn2>>>" + datachecks.getRsn());
        logger.info("checkName>2>>" + datachecks.getCheckName());
        logger.info("note2>>>" + datachecks.getNote());
        logger.info("checkDate2>>>" + datachecks.getCheckDate());

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

    public ArrayList getApplications(String keyword,UserDetails userDetails) {
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
}











