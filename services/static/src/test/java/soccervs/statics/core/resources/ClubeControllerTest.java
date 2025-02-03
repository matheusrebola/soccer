package soccervs.statics.core.resources;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import soccervs.statics.core.dtos.ClubeCreateDTO;
import soccervs.statics.core.dtos.ClubeDTO;
import soccervs.statics.core.entities.Clubes;
import soccervs.statics.core.mappers.ClubeMapper;
import soccervs.statics.core.services.ClubeService;

@SpringBootTest
@AutoConfigureMockMvc
class ClubeControllerTest {
	@Autowired
    private MockMvc mockMvc;
	
	@Autowired
    private ObjectMapper objectMapper;
	
	@Autowired
    private ClubeMapper mapper;
	
	@Autowired
	private ClubeService service;
	
	@Test
	void testcadastrarClube() throws Exception {
		ClubeCreateDTO createDTO = new ClubeCreateDTO();
        createDTO.setNome("Clube do Java");
        createDTO.setCidade("São Paulo");
        createDTO.setPais("Brasil");
        createDTO.setDataFundacao("17/09/1998");
        createDTO.setTecnico(1);
        
        // Criando um objeto de resposta esperado
        ClubeDTO clubeDTO = new ClubeDTO();
        clubeDTO.setId((short) 1);
        clubeDTO.setNome(createDTO.getNome());
        clubeDTO.setCidade(createDTO.getCidade());
        
        Clubes clube = mapper.map(createDTO);

        // Mockando o comportamento do service.save
        when(service.save(org.mockito.ArgumentMatchers.any()))
                .thenReturn(clube);

        // Chamando o endpoint via MockMvc
        mockMvc.perform(post("/clubes")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(createDTO))) // Convertendo DTO para JSON
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1L)) // Verifica se o ID retornado é 1
                .andExpect(jsonPath("$.nome").value("Clube do Java")) // Verifica se o nome está correto
                .andExpect(jsonPath("$.cidade").value("São Paulo")); // Verifica a cidade
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
