package p002es.gob.radarcovid.models.domain;

import java.util.Arrays;
import p213q.p214a.p215a.p216a.C1965a;
import p392u.C4557i;
import p392u.p401r.p403c.C4636f;
import p392u.p401r.p403c.C4638h;

/* renamed from: es.gob.radarcovid.models.domain.SettingsItem */
public final class SettingsItem {
    public int[] value;
    public float weight;

    public SettingsItem() {
        this(null, 0.0f, 3, null);
    }

    public SettingsItem(int[] iArr, float f) {
        if (iArr != null) {
            this.value = iArr;
            this.weight = f;
            return;
        }
        C4638h.m10271a("value");
        throw null;
    }

    public /* synthetic */ SettingsItem(int[] iArr, float f, int i, C4636f fVar) {
        if ((i & 1) != 0) {
            iArr = new int[8];
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        this(iArr, f);
    }

    public static /* synthetic */ SettingsItem copy$default(SettingsItem settingsItem, int[] iArr, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            iArr = settingsItem.value;
        }
        if ((i & 2) != 0) {
            f = settingsItem.weight;
        }
        return settingsItem.copy(iArr, f);
    }

    public final int[] component1() {
        return this.value;
    }

    public final float component2() {
        return this.weight;
    }

    public final SettingsItem copy(int[] iArr, float f) {
        if (iArr != null) {
            return new SettingsItem(iArr, f);
        }
        C4638h.m10271a("value");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4638h.m10272a((Object) SettingsItem.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            SettingsItem settingsItem = (SettingsItem) obj;
            return Arrays.equals(this.value, settingsItem.value) && this.weight == settingsItem.weight;
        }
        throw new C4557i("null cannot be cast to non-null type es.gob.radarcovid.models.domain.SettingsItem");
    }

    public final int[] getValue() {
        return this.value;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.weight) + (Arrays.hashCode(this.value) * 31);
    }

    public final void setValue(int[] iArr) {
        if (iArr != null) {
            this.value = iArr;
        } else {
            C4638h.m10271a("<set-?>");
            throw null;
        }
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public String toString() {
        StringBuilder a = C1965a.m4756a("SettingsItem(value=");
        a.append(Arrays.toString(this.value));
        a.append(", weight=");
        a.append(this.weight);
        a.append(")");
        return a.toString();
    }
}
