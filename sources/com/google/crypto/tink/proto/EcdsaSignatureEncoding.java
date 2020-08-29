package com.google.crypto.tink.proto;

import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3597c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3598d;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e;

public enum EcdsaSignatureEncoding implements C3597c {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);
    
    public static final int DER_VALUE = 2;
    public static final int IEEE_P1363_VALUE = 1;
    public static final int UNKNOWN_ENCODING_VALUE = 0;
    public static final C3598d<EcdsaSignatureEncoding> internalValueMap = null;
    public final int value;

    public static final class EcdsaSignatureEncodingVerifier implements C3599e {
        public static final C3599e INSTANCE = null;

        static {
            INSTANCE = new EcdsaSignatureEncodingVerifier();
        }

        public boolean isInRange(int i) {
            return EcdsaSignatureEncoding.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C3598d<EcdsaSignatureEncoding>() {
            public EcdsaSignatureEncoding findValueByNumber(int i) {
                return EcdsaSignatureEncoding.forNumber(i);
            }
        };
    }

    /* access modifiers changed from: public */
    EcdsaSignatureEncoding(int i) {
        this.value = i;
    }

    public static EcdsaSignatureEncoding forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i == 1) {
            return IEEE_P1363;
        }
        if (i != 2) {
            return null;
        }
        return DER;
    }

    public static C3598d<EcdsaSignatureEncoding> internalGetValueMap() {
        return internalValueMap;
    }

    public static C3599e internalGetVerifier() {
        return EcdsaSignatureEncodingVerifier.INSTANCE;
    }

    @Deprecated
    public static EcdsaSignatureEncoding valueOf(int i) {
        return forNumber(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
