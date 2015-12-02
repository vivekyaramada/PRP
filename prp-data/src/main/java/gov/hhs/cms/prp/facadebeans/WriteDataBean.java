package gov.hhs.cms.prp.facadebeans;

import gov.hhs.cms.prp.entity.AddCheckEntity;
import gov.hhs.cms.prp.entity.UserDetails;
//import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class WriteDataBean {
    final static Logger logger = Logger.getLogger(WriteDataBean.class.getName());

    public String writeData(AddCheckEntity datachecks,UserDetails userDetails) {
        logger.info("Calling writeData Method from writedatabean>>>>>>>>>>>>>");
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
}
