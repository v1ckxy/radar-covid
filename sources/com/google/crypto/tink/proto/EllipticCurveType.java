package com.google.crypto.tink.proto;

import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3597c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3598d;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e;

public enum EllipticCurveType implements C3597c {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    
    public static final int CURVE25519_VALUE = 5;
    public static final int NIST_P256_VALUE = 2;
    public static final int NIST_P384_VALUE = 3;
    public static final int NIST_P521_VALUE = 4;
    public static final int UNKNOWN_CURVE_VALUE = 0;
    public static final C3598d<EllipticCurveType> internalValueMap = null;
    public final int value;

    public static final class EllipticCurveTypeVerifier implements C3599e {
        public static final C3599e INSTANCE = null;

        static {
            INSTANCE = new EllipticCurveTypeVerifier();
        }

        public boolean isInRange(int i) {
            return EllipticCurveType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C3598d<EllipticCurveType>() {
            public EllipticCurveType findValueByNumber(int i) {
                return EllipticCurveType.forNumber(i);
            }
        };
    }

    /* access modifiers changed from: public */
    EllipticCurveType(int i) {
        this.value = i;
    }

    public static EllipticCurveType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i == 4) {
            return NIST_P521;
        }
        if (i != 5) {
            return null;
        }
        return CURVE25519;
    }

    public static C3598d<EllipticCurveType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C3599e internalGetVerifier() {
        return EllipticCurveTypeVerifier.INSTANCE;
    }

    @Deprecated
    public static EllipticCurveType valueOf(int i) {
        return forNumber(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
