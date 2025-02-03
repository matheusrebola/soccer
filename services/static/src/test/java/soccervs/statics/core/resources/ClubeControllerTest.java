package soccervs.statics.core.resources;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import soccervs.statics.core.dtos.ClubeCreateDTO;
import soccervs.statics.core.entities.Clubes;
import soccervs.statics.core.mappers.ClubeMapper;

@SpringBootTest
@AutoConfigureMockMvc
class ClubeControllerTest {
	@Autowired
    private MockMvc mockMvc;
	
	@Autowired
	private ClubeMapper mapper;
	
	@Test
	void testcadastrarClube(ClubeCreateDTO createDTO) throws Exception {
		Clubes clube = mapper.map(createDTO);
		
		mockMvc.perform(post("/clubes"))
        .andExpect(status().isCreated());
	}
	
	@Test
	void testbuscarClubePorNome() {
		
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
