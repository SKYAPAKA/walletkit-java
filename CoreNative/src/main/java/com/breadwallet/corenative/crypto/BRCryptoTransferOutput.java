package com.breadwallet.corenative.crypto;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class BRCryptoTransferOutput extends Structure {
    public BRCryptoAddress target;
    public BRCryptoAmount  amount;

    public BRCryptoTransferOutput() {
        super();
    }

    public BRCryptoTransferOutput(BRCryptoAddress target, BRCryptoAmount amount) {
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

    public BRCryptoTransferOutput.ByValue toByValue() {
        BRCryptoTransferOutput.ByValue other = new BRCryptoTransferOutput.ByValue();

        other.target = this.target;
        other.amount = this.amount;

        return other;
    }

    public static class ByReference extends BRCryptoTransferOutput implements Structure.ByReference {
    }

    public static class ByValue extends BRCryptoTransferOutput implements Structure.ByValue {
    }
}
