/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.SimulacaoEmprestimoReq;
import io.swagger.model.SimulacaoEmprestimoResp;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@Api(value = "simulacaoEmprestimo", description = "the simulacaoEmprestimo API")
public interface SimulacaoEmprestimoApi {

    @ApiOperation(value = "", nickname = "simulacaoEmprestimoPost", notes = "Operação de simulação das condições de um empréstimo.", response = SimulacaoEmprestimoResp.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retorno com sucesso ou com Erro de negócio.", response = SimulacaoEmprestimoResp.class),
        @ApiResponse(code = 400, message = "Bad Request ou Erro interno ao qual inviabilizou uma resposta."),
        @ApiResponse(code = 401, message = "Acesso não autorizado.") })
    @RequestMapping(value = "/simulacaoEmprestimo",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<SimulacaoEmprestimoResp> simulacaoEmprestimoPost(@ApiParam(value = "Requisição de simulação de empréstimo." ,required=true )  @Valid @RequestBody SimulacaoEmprestimoReq body,@ApiParam(value = "Tipo de autenticação requerida." ,required=true) @RequestHeader(value="authenticationType", required=true) String authenticationType,@ApiParam(value = "Identificação do cliente." ,required=true) @RequestHeader(value="clientId", required=true) String clientId,@ApiParam(value = "Chave para validação do acesso ao serviço." ,required=true) @RequestHeader(value="token", required=true) String token);

}
