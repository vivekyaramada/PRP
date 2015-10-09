package gov.hhs.cms.prp.facade;

import gov.hhs.cms.prp.entity.AddCheckEntity;
import gov.hhs.cms.prp.entity.LoginEntity;

import java.util.logging.Logger;

/**
 * Created by VivekKumar.ReddyYara on 9/11/2015.
 */
public class prpValidation {

    private final static Logger LOGGER = Logger.getLogger(prpValidation.class.getName());


    public String checkLogin(LoginEntity datalogin) {
        if (datalogin.getUsername().equals("vivek") && datalogin.getPassword().equals("password")) {
            return "success";
        } else
            return "failure";
    }

    public void writeData(AddCheckEntity datachecks) {

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
    }


}
