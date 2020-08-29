package com.google.crypto.tink.proto;

import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3597c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3598d;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e;

public enum EcPointFormat implements C3597c {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    
    public static final int COMPRESSED_VALUE = 2;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    public static final C3598d<EcPointFormat> internalValueMap = null;
    public final int value;

    public static final class EcPointFormatVerifier implements C3599e {
        public static final C3599e INSTANCE = null;

        static {
            INSTANCE = new EcPointFormatVerifier();
        }

        public boolean isInRange(int i) {
            return EcPointFormat.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C3598d<EcPointFormat>() {
            public EcPointFormat findValueByNumber(int i) {
                return EcPointFormat.forNumber(i);
            }
        };
    }

    /* access modifiers changed from: public */
    EcPointFormat(int i) {
        this.value = i;
    }

    public static EcPointFormat forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i == 2) {
            return COMPRESSED;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    public static C3598d<EcPointFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static C3599e internalGetVerifier() {
        return EcPointFormatVerifier.INSTANCE;
    }

    @Deprecated
    public static EcPointFormat valueOf(int i) {
        return forNumber(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
