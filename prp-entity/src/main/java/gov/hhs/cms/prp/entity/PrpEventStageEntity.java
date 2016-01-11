package gov.hhs.cms.prp.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by grussell99 on 11/24/2015.
 */
@Entity
@javax.persistence.Table(name = "prp_events_stage", schema = "", catalog = "prp")
public class PrpEventStageEntity extends PrpEventEntity {
    public   PrpEventStageEntity () { }
}
