package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import p124p.p126b.C1018a;
import p124p.p126b.p136q.C1184k;
import p124p.p150h.p162l.C1387a;
import p124p.p150h.p162l.C1404o;
import p124p.p150h.p162l.p163y.C1429b;
import p124p.p167j.p168a.C1458a;

public class CheckableImageButton extends C1184k implements Checkable {

    /* renamed from: j */
    public static final int[] f1336j = {16842912};

    /* renamed from: g */
    public boolean f1337g;

    /* renamed from: h */
    public boolean f1338h;

    /* renamed from: i */
    public boolean f1339i;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C0240a extends C1387a {
        public C0240a() {
        }

        /* renamed from: a */
        public void mo768a(View view, C1429b bVar) {
            this.f4146a.onInitializeAccessibilityNodeInfo(view, bVar.f4203a);
            bVar.f4203a.setCheckable(CheckableImageButton.this.f1338h);
            bVar.f4203a.setChecked(CheckableImageButton.this.f1337g);
        }

        /* renamed from: b */
        public void mo770b(View view, AccessibilityEvent accessibilityEvent) {
            this.f4146a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.f1337g);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    public static class C0241b extends C1458a {
        public static final Creator<C0241b> CREATOR = new C0242a();

        /* renamed from: g */
        public boolean f1341g;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        public static class C0242a implements ClassLoaderCreator<C0241b> {
            public Object createFromParcel(Parcel parcel) {
                return new C0241b(parcel, null);
            }

            public Object[] newArray(int i) {
                return new C0241b[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0241b(parcel, classLoader);
            }
        }

        public C0241b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f1341g = z;
        }

        public C0241b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f4274e, i);
            parcel.writeInt(this.f1341g ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1338h = true;
        this.f1339i = true;
        C1404o.m3526a((View) this, (C1387a) new C0240a());
    }

    public boolean isChecked() {
        return this.f1337g;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f1337g ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f1336j.length), f1336j) : super.onCreateDrawableState(i);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0241b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0241b bVar = (C0241b) parcelable;
        super.onRestoreInstanceState(bVar.f4274e);
        setChecked(bVar.f1341g);
    }

    public Parcelable onSaveInstanceState() {
        C0241b bVar = new C0241b(super.onSaveInstanceState());
        bVar.f1341g = this.f1337g;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f1338h != z) {
            this.f1338h = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f1338h && this.f1337g != z) {
            this.f1337g = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f1339i = z;
    }

    public void setPressed(boolean z) {
        if (this.f1339i) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f1337g);
    }
}
