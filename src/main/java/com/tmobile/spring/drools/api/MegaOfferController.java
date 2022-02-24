package com.tmobile.spring.drools.api;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaOfferController {
	@Autowired
	private KieSession session;

	@PostMapping("/order")
	public SimSwapEventResponse orderNow(@RequestBody SimSwapEventResponse order) {
		session.insert(order);
		session.fireAllRules();
		return order;
	}

}
