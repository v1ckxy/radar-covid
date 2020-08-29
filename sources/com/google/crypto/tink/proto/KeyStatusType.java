package com.google.crypto.tink.proto;

import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3597c;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3598d;
import p213q.p217b.p301c.p302a.p311j0.p312a.C3594b0.C3599e;

public enum KeyStatusType implements C3597c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    public static final C3598d<KeyStatusType> internalValueMap = null;
    public final int value;

    public static final class KeyStatusTypeVerifier implements C3599e {
        public static final C3599e INSTANCE = null;

        static {
            INSTANCE = new KeyStatusTypeVerifier();
        }

        public boolean isInRange(int i) {
            return KeyStatusType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C3598d<KeyStatusType>() {
            public KeyStatusType findValueByNumber(int i) {
                return KeyStatusType.forNumber(i);
            }
        };
    }

    /* access modifiers changed from: public */
    KeyStatusType(int i) {
        this.value = i;
    }

    public static KeyStatusType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static C3598d<KeyStatusType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C3599e internalGetVerifier() {
        return KeyStatusTypeVerifier.INSTANCE;
    }

    @Deprecated
    public static KeyStatusType valueOf(int i) {
        return forNumber(i);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
