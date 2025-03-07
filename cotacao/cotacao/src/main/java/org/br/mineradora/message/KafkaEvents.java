package org.br.mineradora.message;

import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.dto.QuotationDTO;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class KafkaEvents {

    private final Logger LOG = LoggerFactory.getLogger(KafkaEvents.class);

    @Channel("quotation-channel")
    Emitter<QuotationDTO> quotationDTOEmitter;

    public void sendNewKafkaEvent(QuotationDTO quotation) {
        LOG.info("Enviando cotação para tópicos do kafka ");
        quotationDTOEmitter.send(quotation).toCompletableFuture().join();
    }

}
