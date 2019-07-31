package com.mf_rpc_api.openlegacy.services;

import java.util.List;

import org.openlegacy.core.annotations.OpenlegacyDesigntime;
import org.openlegacy.core.annotations.services.Service;

import com.mf_rpc_sdk.openlegacy.Fininq2CreditCards;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 *  A service interface and input/output definition for a web service.
 *  Defines the contract between the client and server. The client uses the same interface for testing the service via Java code. 
 *  The interface CreditCardsServiceService can be customized to enabling passing parameters to the service.     
 */

@Service(name = "CreditCardsService")
@OpenlegacyDesigntime(editor = "WebServiceEditor")
public interface CreditCardsServiceService {

    public CreditCardsServiceOut getCreditCardsService(CreditCardsServiceIn creditCardsServiceIn) throws Exception;

    @Getter
    @Setter
    public static class CreditCardsServiceIn {
        
        String custId;
    }
    
    @ApiModel(value="CreditCardsServiceOut", description="")
    @Getter
    @Setter
    public static class CreditCardsServiceOut {
        
        @ApiModelProperty(value="Fininq2Credit Cards")
        List<Fininq2CreditCards> creditCards;
    }
}
