package br.com.webapp.zelez.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.webapp.zelez.dao.EMF;
import br.com.webapp.zelez.entity.Questionaire;

@Path("/questionaire")
@Produces(MediaType.APPLICATION_JSON)
public class QuestionaireService {
	
	@GET
    public List<Questionaire> get() {
		return new ArrayList<Questionaire>(EMF.get().createEntityManager().
				createQuery("from Questionaire").getResultList());
    }
}
