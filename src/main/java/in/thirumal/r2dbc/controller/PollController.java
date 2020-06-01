package in.thirumal.r2dbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.thirumal.r2dbc.dao.GenericCdRepository;
import in.thirumal.r2dbc.dao.PollRepository;
import in.thirumal.r2dbc.model.GenericCd;
import in.thirumal.r2dbc.model.Poll;
import reactor.core.publisher.Flux;

@RestController
public class PollController {

	private PollRepository pollRepository;
	private GenericCdRepository genericCdRepository;
	
	/**
	 * @param pollRepository
	 */
	public PollController(PollRepository pollRepository, GenericCdRepository genericCdRepository) {
		super();
		this.pollRepository = pollRepository;
		this.genericCdRepository = genericCdRepository;
	}

	@GetMapping("/poll")
    public Flux<Poll> list() {
		 return pollRepository.findAll();
    }
	
	@GetMapping("/cd")
    public Flux<GenericCd> listGenericCd() {
		 return genericCdRepository.findAll();
    }
}
