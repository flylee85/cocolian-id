/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cocolian.id.rpc;


import org.cocolian.id.rpc.GenerateIdController;
import org.cocolian.rpc.IdService.GenerateIdRequest;
import org.cocolian.rpc.IdService.GenerateIdResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shamphone@gmail.com
 * @version 1.0.0
 * @date 2017年8月16日
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest(classes = TestConfiguration.class, webEnvironment = WebEnvironment.NONE)
public class TestGenerateIdController {

	@Autowired
	@Qualifier("generateId")
	private GenerateIdController controller;

	@Test
	public void testGen() throws Exception {		
		GenerateIdRequest.Builder request = GenerateIdRequest
				.newBuilder();
		request.setUserName("payment");
		request.setPassword("123456");
		request.setEntityType(1);
		GenerateIdResponse response = controller.process(request
				.build());
		Assert.assertEquals(response.getIdsCount(), 0);
	}
}
