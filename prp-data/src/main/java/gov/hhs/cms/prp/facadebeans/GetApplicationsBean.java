package gov.hhs.cms.prp.facadebeans;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import gov.hhs.cms.prp.entity.PrpAplctnEntity;
import gov.hhs.cms.prp.entity.UserDetails;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class GetApplicationsBean {

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
