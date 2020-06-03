package in.thirumal.r2dbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.thirumal.r2dbc.dao.GenericCdRepository;
import in.thirumal.r2dbc.dao.PollRepository;
import in.thirumal.r2dbc.model.GenericCd;
import in.thirumal.r2dbc.model.Poll;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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
	
	@GetMapping("/poll-1")
    public Mono<Poll> get() {
		System.out.println((Poll)pollRepository.findById(1L).subscribe());
		 return pollRepository.findById(1L);
    }
	
	@GetMapping("/poll-count")
    public Mono<Long> count() {
		System.out.println("count");
		return pollRepository.count();
    }
	
	@GetMapping("/cd")
    public Flux<GenericCd> listGenericCd() {
		//genericCdRepository.findAll().toStream().forEach(a->a.);
		return genericCdRepository.findAll();
    }
}
