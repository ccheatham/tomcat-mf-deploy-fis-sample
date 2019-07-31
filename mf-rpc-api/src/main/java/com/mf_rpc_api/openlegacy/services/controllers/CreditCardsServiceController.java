package com.mf_rpc_api.openlegacy.services.controllers;

import javax.inject.Inject;

import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mf_rpc_api.openlegacy.services.CreditCardsServiceService;
import com.mf_rpc_api.openlegacy.services.CreditCardsServiceService.CreditCardsServiceIn;
import com.mf_rpc_api.openlegacy.services.CreditCardsServiceService.CreditCardsServiceOut;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

@RestController
@RequestMapping(path = "/api/creditcardsservice", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value="CreditCardsService")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public class CreditCardsServiceController {

    @Inject
    private CreditCardsServiceService creditCardsServiceService;

    @PostMapping
    @ApiOperation(value="CreditCardsService GET operation", response = CreditCardsServiceOut.class, 
        authorizations = { @Authorization(value = "oauth2-password", scopes = { @AuthorizationScope(scope = "test", description = "Test") }) , @Authorization(value = "oauth2", scopes = { @AuthorizationScope(scope = "test", description = "Test") }) })
    public CreditCardsServiceOut getCreditCardsService(@RequestBody CreditCardsServiceIn creditCardsServiceIn) throws Exception {
        return creditCardsServiceService.getCreditCardsService(creditCardsServiceIn);
    }
}