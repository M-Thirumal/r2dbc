package in.thirumal.r2dbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.thirumal.r2dbc.dao.GenericCdRepository;
import in.thirumal.r2dbc.dao.PollRepository;
import in.thirumal.r2dbc.dao.TestRepository;
import in.thirumal.r2dbc.model.GenericCd;
import in.thirumal.r2dbc.model.Poll;
import in.thirumal.r2dbc.model.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PollController {

	private PollRepository pollRepository;
	private GenericCdRepository genericCdRepository;

	private TestRepository testRepository;
	/**
	 * @param pollRepository
	 */
	public PollController(PollRepository pollRepository, GenericCdRepository genericCdRepository,  TestRepository testRepository) {
		super();
		this.pollRepository = pollRepository;
		this.genericCdRepository = genericCdRepository;
		this.testRepository = testRepository;
	}

	@GetMapping("/poll")
    public Flux<Poll> list() {
		 return pollRepository.findAll();
    }
	
	@GetMapping("/poll-1")
    public Mono<Poll> get() {
	//	System.out.println(pollRepository.findById(1L).block());
		 return pollRepository.findById(1L);
    }
	
	@GetMapping("/poll-count")
    public Mono<Long> count() {
		System.out.println("count");
		return pollRepository.count();
    }
	
	@GetMapping("/cd")
    public Flux<GenericCd> listGenericCd() {
		System.out.println("s");
		genericCdRepository.findAll().log().doOnSubscribe(a->System.out.println("dsads" +a));
		System.out.println("d");
		return genericCdRepository.findAll();
    }
	

	@GetMapping("/test")
    public Mono<Test> test() {
		System.out.println("count");
		return testRepository.findById(1L);
    }
	

	@GetMapping("/test-all")
    public Flux<Test> testAll() {
		//DatabaseClient client = DatabaseClient.create(databaseConfig.connectionFactory());
		//return client.select().from(Test.class).fetch().all();
		System.out.println("count");
		return testRepository.findAll();
    }
	
}
