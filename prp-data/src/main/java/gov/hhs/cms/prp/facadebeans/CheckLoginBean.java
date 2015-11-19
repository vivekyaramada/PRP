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

        Gson gson = new Gson();

        try {
            /*JsonObject data= new JsonObject();
            data.addProperty("jsonusername", datalogin.getUsername());
            data.addProperty("dummy", "dummy");*/

            String inputlogin = new Gson().toJson(datalogin);
            String inputuserDetails = new Gson().toJson(userDetails);


            //String urlString = "http://localhost:9093/prp-ws/hello/checklogin/" + datalogin.getUsername() + "/" + userDetails.getUsername();

            LOGGER.info("The input value before sending to webservice is>>>"+ inputlogin);

            String urlString = "http://localhost:9093/prp-ws/hello/checklogin/{inputlogin}/{inputuserDetails}" ;

            RestTemplate restTemplate = new RestTemplate();
            String response = restTemplate.getForObject(urlString, String.class,inputlogin,inputuserDetails);

            LOGGER.info("The response for username and passwords is >>>>>"+response);

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
            LOGGER.info("The exception before webservice is >>>" + e );
            return "failure";
        }
        return  "failure";
    }


    public String getConstants()
    {
        LOGGER.info("Entering getConstants CheckLoginBean() >>>");

        String urlString = "http://localhost:9093/prp-ws/hello/getconstants" ;

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(urlString, String.class);

        LOGGER.info("The response for constants is >>>>>"+response);
        return response;

    }


}
