/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ConsultaProdutosRecargaReq;
import io.swagger.model.ConsultaProdutosRecargaResp;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

@Api(value = "consultaProdutosRecarga", description = "the consultaProdutosRecarga API")
public interface ConsultaProdutosRecargaApi {

    @ApiOperation(value = "", nickname = "consultaProdutosRecargaPost", notes = "Operação de consulta dos possíveis produtos de recarga de um cartão de transporte ou pré-pago. Pega o número e operadora do cartão para ser verificado na requisição, não usa a autenticação ou identificação.", response = ConsultaProdutosRecargaResp.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retorno com sucesso.", response = ConsultaProdutosRecargaResp.class) })
    @RequestMapping(value = "/consultaProdutosRecarga",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ConsultaProdutosRecargaResp> consultaProdutosRecargaPost(@ApiParam(value = "Tipo de autenticação requerida." ,required=true) @RequestHeader(value="authenticationType", required=true) String authenticationType,@ApiParam(value = "Identificação do cliente." ,required=true) @RequestHeader(value="clientId", required=true) String clientId,@ApiParam(value = "Chave para validação do acesso ao serviço." ,required=true) @RequestHeader(value="token", required=true) String token,@ApiParam(value = "Requisição de consulta produtos de recarga disponíveis para um cartão." ,required=true )  @Valid @RequestBody ConsultaProdutosRecargaReq body);

}
