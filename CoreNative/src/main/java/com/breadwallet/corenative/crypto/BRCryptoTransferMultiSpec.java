package com.breadwallet.corenative.crypto;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class BRCryptoTransferMultiSpec extends Structure {
    public BRCryptoAddress target;
    public BRCryptoAmount  amount;

    public BRCryptoTransferMultiSpec() {
        super();
    }

    public BRCryptoTransferMultiSpec(BRCryptoAddress target, BRCryptoAmount amount) {
        super();
        this.target = target;
        this.amount = amount;
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList(
                "target",
                "amount"
        );
    }

    public BRCryptoTransferMultiSpec.ByValue toByValue() {
        BRCryptoTransferMultiSpec.ByValue other = new BRCryptoTransferMultiSpec.ByValue();

        other.target = this.target;
        other.amount = this.amount;

        return other;
    }

    public static class ByReference extends BRCryptoTransferMultiSpec implements Structure.ByReference {
    }

    public static class ByValue extends BRCryptoTransferMultiSpec implements Structure.ByValue {
    }
}
