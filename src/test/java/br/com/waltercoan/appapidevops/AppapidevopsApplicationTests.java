package br.com.waltercoan.appapidevops;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import br.com.waltercoan.appapidevops.controller.APIConverteUnidadeController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
class ApiconvApplicationTests {

	@Autowired
	private APIConverteUnidadeController apiController;
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertThat(apiController).isNotNull();
	}

	//teste api converte unidade
	@Test
	void testaConverteUnidade() throws Exception {
		mockMvc.perform(get("/api/converte-unidade/km-milhas/10"))
			.andExpect(status().isOk())
			.andExpect(content().string("6.21371"));		
		
		mockMvc.perform(get("/api/converte-unidade/milhas-km/10"))
			.andExpect(status().isOk())
			.andExpect(content().string("16.0934"));


			
	}
}