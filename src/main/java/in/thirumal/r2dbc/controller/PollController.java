package in.thirumal.r2dbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.thirumal.r2dbc.dao.PollRepository;
import in.thirumal.r2dbc.model.Poll;
import reactor.core.publisher.Flux;

@RestController
public class PollController {

	private PollRepository pollRepository;
	
	/**
	 * @param pollRepository
	 */
	public PollController(PollRepository pollRepository) {
		super();
		this.pollRepository = pollRepository;
	}

	@GetMapping("/poll")
    public Flux<Poll> list() {
		 return pollRepository.findAll();
    }
}
