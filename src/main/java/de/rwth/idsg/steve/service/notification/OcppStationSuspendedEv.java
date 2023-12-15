package de.rwth.idsg.steve.service.notification;

import de.rwth.idsg.steve.repository.dto.TransactionDetails;
import lombok.Data;

@Data
public class OcppStationSuspendedEv {
    private final String chargeBoxId;
    private final int connectorId;
    private final TransactionDetails transactionDetails;
}
