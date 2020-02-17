package io.reflectoring.buckpal.application.service;

import org.springframework.stereotype.Component;

import io.reflectoring.buckpal.domain.Money;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Configuration properties for money transfer use cases.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class MoneyTransferProperties {

    private Money maximumTransferThreshold = Money.of(1_000_000L);

}
