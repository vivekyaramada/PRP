package gov.hhs.cms.prp.facadebeans;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import gov.hhs.cms.prp.entity.LoginEntity;
import gov.hhs.cms.prp.entity.PrpUsersEntity;
import gov.hhs.cms.prp.entity.UserDetails;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class CheckLoginBean {
     private final static Logger LOGGER = Logger.getLogger(CheckLoginBean.class.getName());

    public String checkLogin(LoginEntity datalogin,UserDetails userDetails) {
        LOGGER.info("Calling checkLogin Method from facadebean>>>>>>>>>>>>>");

        Gson gson = new Gson();

        try {
            String inputlogin = new Gson().toJson(datalogin);
            String inputuserDetails = new Gson().toJson(userDetails);
            String urlString = "http://localhost:9093/prp-ws/hello/checklogin/{inputlogin}/{inputuserDetails}" ;
            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(urlString, String.class,inputlogin,inputuserDetails);
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
            LOGGER.info(""+e);
            return "failure";
        }
        return  "failure";
    }

    public String getConstants()
    {
        LOGGER.info("Calling getConstants Method from facadebean>>>>>>>>>>>>>");
        try {
            String urlString = "http://localhost:9093/prp-ws/hello/getconstants";
            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(urlString, String.class);
            return response;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
