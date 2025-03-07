package org.br.mineradora.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Jacksonized
@Data
@Builder
@AllArgsConstructor
@RestClient
public class CurrencyPriceDTO {

    @JsonProperty("USDBRL")
    private USDBRL USDBRL;
}
