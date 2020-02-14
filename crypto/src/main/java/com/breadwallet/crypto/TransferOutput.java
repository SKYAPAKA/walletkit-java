package com.breadwallet.crypto;

public final class TransferOutput {

    private final Address target;
    private final Amount  amount;

    public TransferOutput (Address target, Amount amount) {
        this.target = target;
        this.amount = amount;
    }

    public Address getTarget() {
        return target;
    }

    public Amount getAmount() {
        return amount;
    }
}
