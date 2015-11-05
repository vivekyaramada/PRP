package gov.hhs.cms.prp.mq;

import org.springframework.jms.core.JmsTemplate;

public class PaymentMessageProducer {
  private JmsTemplate jmsTemplate;

  public void setJmsTemplate(JmsTemplate jmsTemplate) {
	  this.jmsTemplate = jmsTemplate;
  }

  public void send(final Object Object) {
    jmsTemplate.convertAndSend(Object);
  }
}
