package gov.hhs.cms.prp.mq.to;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jarsen on 12/17/15.
 */
public class RetireeListTO {
    private RetireeListHeaderTrailerTO header;
    private RetireeListHeaderTrailerTO trailer;
    private List<RetireeListDetailTO> detailList = new ArrayList<RetireeListDetailTO>();

    public RetireeListHeaderTrailerTO getHeader() {
        return header;
    }

    public void setHeader(RetireeListHeaderTrailerTO header) {
        this.header = header;
    }

    public RetireeListHeaderTrailerTO getTrailer() {
        return trailer;
    }

    public void setTrailer(RetireeListHeaderTrailerTO trailer) {
        this.trailer = trailer;
    }

    public List<RetireeListDetailTO> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<RetireeListDetailTO> detailList) {
        this.detailList = detailList;
    }

    public void addDetailRecord(Object entity) {
        detailList.add((RetireeListDetailTO) entity);
    }
}
