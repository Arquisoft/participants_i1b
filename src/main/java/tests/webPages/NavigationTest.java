/*package tests.webPages;
import java.net.MalformedURLException;
import java.net.URL;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import model.Citizen;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class NavigationTest {

	private WebEnvironment port = WebEnvironment.RANDOM_PORT;
	private TestRestTemplate rt;
	private Citizen ct1;
	private URL base;

	@Autowired
	private WebApplicationContext webapp;

	@Before(value = "")
	public void setUp() {
		rt = new TestRestTemplate();
		try {
			this.base = new URL("http://localhost:" + port + "/");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		MockMvcBuilders.webAppContextSetup(this.webapp).build();
	}

	@Test
	public void loginPageTest() throws Exception {
//		ResponseEntity<String> response = rt.getForEntity(base.toString(), String.class);
//		assertThat(response.getBody(), containsString("Login page"));
	}

	@Test
	public void testLoginActionRIGHT() {
//		RequestBuilder requestLogin = 
//				post("/login").param("login", ct1.getEmail()).param("password", ct1.getPassword());
//
//		assertThat(rt
//		        .postForObject("http://localhost:" + port + "/login", requestLogin, String.class)
//		        .contains(ct1.getFirstName()));
//		assertThat(rt
//		        .postForObject("http://localhost:" + port + "/login", requestLogin, String.class)
//		        .contains(ct1.getLastName()));
//		assertThat(rt
//		        .postForObject("http://localhost:" + port + "/login", requestLogin, String.class)
//		        .contains(ct1.getEmail()));
//		assertThat(rt
//		        .postForObject("http://localhost:" + port + "/login", requestLogin, String.class)
//		        .contains(ct1.getNationality()));
	}

	@Test
	public void testLoginActionWRONG() {
//		RequestBuilder requestLogin = 
//				post("/login").param("login", "errormail").param("password", "errorPass");
//
//		assertThat(rt
//		        .postForObject("http://localhost:" + port + "/login", requestLogin, String.class)
//		        .contains("Error 404 user not found!"));
	}
}*/