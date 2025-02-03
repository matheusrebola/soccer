package soccervs.statics.core.resources;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import soccervs.statics.core.dtos.ClubeCreateDTO;

@SpringBootTest
@AutoConfigureMockMvc
class ClubeControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	
	@Test
	void testcadastrarClube_sucess(ClubeCreateDTO createDTO) throws Exception {
		mockMvc.perform(post("/clubes"))
        .andExpect(status().isCreated());
	}
	
	@Test
	void testcadastrarClube_fail() throws Exception {
		
	}
	
	@Test
	void testbuscarClubePorNome_sucess() {
		
	}
	
	@Test
	void testbuscarClubePorNome_notfound() {
		
	}
	
	@Test
	void testBuscarPorCidade() {
		
	}
	
	@Test
	void testBucarPorPais() {
		
	}
	
	@Test
	void testBuscarPorTecnico() {
		
	}

}
