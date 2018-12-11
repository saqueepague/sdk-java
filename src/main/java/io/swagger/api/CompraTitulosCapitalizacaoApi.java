/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.CompraTitulosCapitalizacaoReq;
import io.swagger.model.CompraTitulosCapitalizacaoResp;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

@Api(value = "compraTitulosCapitalizacao", description = "the compraTitulosCapitalizacao API")
public interface CompraTitulosCapitalizacaoApi {

    @ApiOperation(value = "", nickname = "compraTitulosCapitalizacaoPost", notes = "Operação de compra de títulos de capitalização.", response = CompraTitulosCapitalizacaoResp.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retorno com sucesso.", response = CompraTitulosCapitalizacaoResp.class) })
    @RequestMapping(value = "/compraTitulosCapitalizacao",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<CompraTitulosCapitalizacaoResp> compraTitulosCapitalizacaoPost(@ApiParam(value = "Requisição de operação de compra de títulos de capitalização." ,required=true )  @Valid @RequestBody CompraTitulosCapitalizacaoReq body,@ApiParam(value = "Tipo de autenticação requerida." ,required=true) @RequestHeader(value="authenticationType", required=true) String authenticationType,@ApiParam(value = "Identificação do cliente." ,required=true) @RequestHeader(value="clientId", required=true) String clientId,@ApiParam(value = "Chave para validação do acesso ao serviço." ,required=true) @RequestHeader(value="token", required=true) String token);

}