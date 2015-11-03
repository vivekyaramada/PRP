package gov.hhs.cms.prp.facadebeans;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import gov.hhs.cms.prp.entity.LoginEntity;
import gov.hhs.cms.prp.entity.PrpUsersEntity;
import gov.hhs.cms.prp.entity.UserDetails;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class CheckLoginBean {
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
}
