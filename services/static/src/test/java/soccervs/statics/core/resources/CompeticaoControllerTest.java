package soccervs.statics.core.resources;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import soccervs.statics.core.dtos.CompeticaoDTO;
import soccervs.statics.core.entities.Competicoes;
import soccervs.statics.core.entities.enums.ECompeticao;
import soccervs.statics.core.entities.enums.EDisputa;
import soccervs.statics.core.mappers.CompeticaoMapper;
import soccervs.statics.core.services.CompeticaoService;

@SpringBootTest
@AutoConfigureMockMvc
class CompeticaoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private CompeticaoService service;

    @Mock
    private CompeticaoMapper mapper;

    @Test
    void encontrarTodos_DeveRetornarListaDeCompeticoes_QuandoExistiremCompeticoes() throws Exception {
        // Mockando a resposta do service
        List<Competicoes> competicoes = List.of(
        		new Competicoes((long)1, "Competição 1", (short) 1984, ECompeticao.ESTADUAL, EDisputa.PONTOS_CORRIDOS, "USA"), 
        		new Competicoes((long)2, "Competição 2",(short) 2010, ECompeticao.CONTINENTAL, EDisputa.MISTO, "Brasil"));
        List<CompeticaoDTO> dtoList = List.of(
        		new CompeticaoDTO("Competição 1", (short) 1984, ECompeticao.ESTADUAL, EDisputa.PONTOS_CORRIDOS, "USA", (long)1), 
        		new CompeticaoDTO("Competição 1",(short) 2010, ECompeticao.CONTINENTAL, EDisputa.MISTO, "Brasil", (long)2));

        Mockito.when(service.encontrarTodos()).thenReturn(competicoes);
        Mockito.when(mapper.map(competicoes)).thenReturn(dtoList);

        // Realiza a requisição GET
        mockMvc.perform(get("/competicoes"))
                .andExpect(status().isOk()) // Verifica se o status HTTP é 200 OK
                .andExpect(jsonPath("$[0].id").value(1)) // Verifica se o primeiro objeto tem ID 1
                .andExpect(jsonPath("$[0].nome").value("Competição 1")); // Verifica se o nome está correto
    }

    @Test
    void encontrarTodos_DeveLancarNotFoundedException_QuandoNaoHouverCompeticoes() throws Exception {
        Mockito.when(service.encontrarTodos()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/competicoes"))
                .andExpect(status().isNotFound()); // Deve retornar 404 devido à exceção
    }
}
