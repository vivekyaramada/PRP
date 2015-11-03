package gov.hhs.cms.prp.facadebeans;

import gov.hhs.cms.prp.entity.AddCheckEntity;
import gov.hhs.cms.prp.entity.UserDetails;
import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

/**
 * Created by VivekKumar.ReddyYara on 11/2/2015.
 */
public class WriteDataBean {
    final static Logger logger = Logger.getLogger(WriteDataBean.class.getName());

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
}
