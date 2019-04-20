package br.com.dvp.tcc.payment_broker.rest;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.dvp.tcc.payment_broker.model.PaymentInfo;
import br.com.dvp.tcc.payment_broker.rest.client.FakeRestClientPaypal;

@Path("/payments")
@RequestScoped
public class PaymentsResourceRESTService {

    @Inject
    private Logger log;
    
    @Inject
    private FakeRestClientPaypal client;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPayment(PaymentInfo info) {
    	log.info("Efetuando poagamento no paypal");
    	//chama o serviço do Paypal
        client.doPayment(info);
        return Response.ok().build();
    }

}
