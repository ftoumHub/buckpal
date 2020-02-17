package io.reflectoring.buckpal.application.port.out;

import io.reflectoring.buckpal.domain.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);

    void releaseAccount(Account.AccountId accountId);

}
