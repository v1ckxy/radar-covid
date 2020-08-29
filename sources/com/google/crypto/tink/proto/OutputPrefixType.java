package com.google.crypto.tink.proto;

import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3597c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3598d;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e;

public enum OutputPrefixType implements C3597c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    public static final C3598d<OutputPrefixType> internalValueMap = null;
    public final int value;

    public static final class OutputPrefixTypeVerifier implements C3599e {
        public static final C3599e INSTANCE = null;

        static {
            INSTANCE = new OutputPrefixTypeVerifier();
        }

        public boolean isInRange(int i) {
            return OutputPrefixType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C3598d<OutputPrefixType>() {
            public OutputPrefixType findValueByNumber(int i) {
                return OutputPrefixType.forNumber(i);
            }
        };
    }

    /* access modifiers changed from: public */
    OutputPrefixType(int i) {
        this.value = i;
    }

    public static OutputPrefixType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static C3598d<OutputPrefixType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C3599e internalGetVerifier() {
        return OutputPrefixTypeVerifier.INSTANCE;
    }

    @Deprecated
    public static OutputPrefixType valueOf(int i) {
        return forNumber(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
