package io.swagger.api;

import io.swagger.model.ConsultaValoresRecargaReq;
import io.swagger.model.ConsultaValoresRecargaResp;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

@Controller
public class ConsultaValoresRecargaApiController implements ConsultaValoresRecargaApi {

    private static final Logger log = LoggerFactory.getLogger(ConsultaValoresRecargaApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ConsultaValoresRecargaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ConsultaValoresRecargaResp> consultaValoresRecargaPost(@ApiParam(value = "Tipo de autenticação requerida." ,required=true) @RequestHeader(value="authenticationType", required=true) String authenticationType,@ApiParam(value = "Identificação do cliente." ,required=true) @RequestHeader(value="clientId", required=true) String clientId,@ApiParam(value = "Chave para validação do acesso ao serviço." ,required=true) @RequestHeader(value="token", required=true) String token,@ApiParam(value = "Requisição de consulta valores de recarga de cartão." ,required=true )  @Valid @RequestBody ConsultaValoresRecargaReq body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ConsultaValoresRecargaResp>(objectMapper.readValue("{  \"InfTransacao\" : {    \"cdProc\" : \"029100\",    \"mensagemCliente\" : \"Não foi possível validar o cartão.\",    \"nsu\" : \"000080247206\",    \"codMoeda\" : \"986\",    \"codOperadora\" : \"00000000914\",    \"dataLocal\" : \"1122\",    \"errorMessage\" : \"Cartão inválido.\",    \"valor\" : \"5000\",    \"horaLocal\" : \"151032\",    \"nsuResposta\" : \"820\",    \"dataHora\" : \"1122151032\"  },  \"InfConsultaValoresRecarga\" : {    \"valores\" : {      \"issuers\" : [ {        \"card_number_mask\" : \"XXXXXXXXXXXXXX-X\",        \"card_number_length\" : 15,        \"name\" : \"TEU\",        \"id\" : 1,        \"products\" : [ {          \"min_value\" : \"1000\",          \"fee\" : \"200\",          \"values\" : [ {            \"fee\" : \"200\",            \"id\" : \"1\",            \"value\" : \"2000\"          }, {            \"fee\" : \"200\",            \"id\" : \"1\",            \"value\" : \"2000\"          } ],          \"name\" : \"Bilhete Antecipado\",          \"id\" : \"1\",          \"max_value\" : \"9000\"        }, {          \"min_value\" : \"1000\",          \"fee\" : \"200\",          \"values\" : [ {            \"fee\" : \"200\",            \"id\" : \"1\",            \"value\" : \"2000\"          }, {            \"fee\" : \"200\",            \"id\" : \"1\",            \"value\" : \"2000\"          } ],          \"name\" : \"Bilhete Antecipado\",          \"id\" : \"1\",          \"max_value\" : \"9000\"        } ]      }, {        \"card_number_mask\" : \"XXXXXXXXXXXXXX-X\",        \"card_number_length\" : 15,        \"name\" : \"TEU\",        \"id\" : 1,        \"products\" : [ {          \"min_value\" : \"1000\",          \"fee\" : \"200\",          \"values\" : [ {            \"fee\" : \"200\",            \"id\" : \"1\",            \"value\" : \"2000\"          }, {            \"fee\" : \"200\",            \"id\" : \"1\",            \"value\" : \"2000\"          } ],          \"name\" : \"Bilhete Antecipado\",          \"id\" : \"1\",          \"max_value\" : \"9000\"        }, {          \"min_value\" : \"1000\",          \"fee\" : \"200\",          \"values\" : [ {            \"fee\" : \"200\",            \"id\" : \"1\",            \"value\" : \"2000\"          }, {            \"fee\" : \"200\",            \"id\" : \"1\",            \"value\" : \"2000\"          } ],          \"name\" : \"Bilhete Antecipado\",          \"id\" : \"1\",          \"max_value\" : \"9000\"        } ]      } ]    }  },  \"Cripto\" : {    \"hash\" : \"hash\"  },  \"Terminal\" : {    \"codEstab\" : \"000000000742673\",    \"tipo\" : \"008\",    \"id\" : \"05100004\"  }}", ConsultaValoresRecargaResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ConsultaValoresRecargaResp>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ConsultaValoresRecargaResp>(HttpStatus.NOT_IMPLEMENTED);
    }

}
