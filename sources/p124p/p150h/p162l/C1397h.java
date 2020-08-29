package p124p.p150h.p162l;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: p.h.l.h */
public class C1397h {

    /* renamed from: a */
    public ViewParent f4155a;

    /* renamed from: b */
    public ViewParent f4156b;

    /* renamed from: c */
    public final View f4157c;

    /* renamed from: d */
    public boolean f4158d;

    /* renamed from: e */
    public int[] f4159e;

    public C1397h(View view) {
        this.f4157c = view;
    }

    /* renamed from: a */
    public final ViewParent mo5885a(int i) {
        if (i == 0) {
            return this.f4155a;
        }
        if (i != 1) {
            return null;
        }
        return this.f4156b;
    }

    /* renamed from: a */
    public void mo5886a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        mo5893b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public boolean mo5888a(float f, float f2, boolean z) {
        if (!this.f4158d) {
            return false;
        }
        ViewParent a = mo5885a(0);
        if (a == null) {
            return false;
        }
        try {
            return a.onNestedFling(this.f4157c, f, f2, z);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(a);
            sb.append(" does not implement interface method onNestedFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo5890a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo5893b(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: b */
    public boolean mo5892b(int i) {
        return mo5885a(i) != null;
    }

    /* renamed from: b */
    public final boolean mo5893b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (this.f4158d) {
            ViewParent a = mo5885a(i8);
            if (a == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr4 != null) {
                    this.f4157c.getLocationInWindow(iArr4);
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (iArr2 == null) {
                    if (this.f4159e == null) {
                        this.f4159e = new int[2];
                    }
                    int[] iArr5 = this.f4159e;
                    iArr5[0] = 0;
                    iArr5[1] = 0;
                    iArr3 = iArr5;
                } else {
                    iArr3 = iArr2;
                }
                View view = this.f4157c;
                if (a instanceof C1399j) {
                    ((C1399j) a).mo123a(view, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (a instanceof C1398i) {
                        ((C1398i) a).mo122a(view, i, i2, i3, i4, i5);
                    } else if (i8 == 0) {
                        try {
                            a.onNestedScroll(view, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            AbstractMethodError abstractMethodError = e;
                            StringBuilder sb = new StringBuilder();
                            sb.append("ViewParent ");
                            sb.append(a);
                            sb.append(" does not implement interface method onNestedScroll");
                            Log.e("ViewParentCompat", sb.toString(), abstractMethodError);
                        }
                    }
                }
                if (iArr4 != null) {
                    this.f4157c.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i7;
                    iArr4[1] = iArr4[1] - i6;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo5894c(int i) {
        ViewParent a = mo5885a(i);
        if (a != null) {
            View view = this.f4157c;
            if (a instanceof C1398i) {
                ((C1398i) a).mo121a(view, i);
            } else if (i == 0) {
                try {
                    a.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(a);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    Log.e("ViewParentCompat", sb.toString(), e);
                }
            }
            if (i == 0) {
                this.f4155a = null;
            } else if (i == 1) {
                this.f4156b = null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo5887a(float f, float f2) {
        if (!this.f4158d) {
            return false;
        }
        ViewParent a = mo5885a(0);
        if (a == null) {
            return false;
        }
        try {
            return a.onNestedPreFling(this.f4157c, f, f2);
        } catch (AbstractMethodError e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(a);
            sb.append(" does not implement interface method onNestedPreFling");
            Log.e("ViewParentCompat", sb.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo5891a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        int[] iArr3;
        int i6 = i;
        int i7 = i2;
        int[] iArr4 = iArr2;
        int i8 = i3;
        boolean z = false;
        if (this.f4158d) {
            ViewParent a = mo5885a(i8);
            if (a == null) {
                return false;
            }
            if (i6 != 0 || i7 != 0) {
                if (iArr4 != null) {
                    this.f4157c.getLocationInWindow(iArr4);
                    i5 = iArr4[0];
                    i4 = iArr4[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.f4159e == null) {
                        this.f4159e = new int[2];
                    }
                    iArr3 = this.f4159e;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                View view = this.f4157c;
                if (a instanceof C1398i) {
                    ((C1398i) a).mo124a(view, i, i2, iArr3, i3);
                } else if (i8 == 0) {
                    try {
                        a.onNestedPreScroll(view, i, i7, iArr3);
                    } catch (AbstractMethodError e) {
                        AbstractMethodError abstractMethodError = e;
                        StringBuilder sb = new StringBuilder();
                        sb.append("ViewParent ");
                        sb.append(a);
                        sb.append(" does not implement interface method onNestedPreScroll");
                        Log.e("ViewParentCompat", sb.toString(), abstractMethodError);
                    }
                }
                if (iArr4 != null) {
                    this.f4157c.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i5;
                    iArr4[1] = iArr4[1] - i4;
                }
                if (!(iArr3[0] == 0 && iArr3[1] == 0)) {
                    z = true;
                }
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo5889a(int i, int i2) {
        boolean z;
        if (mo5885a(i2) != null) {
            return true;
        }
        if (this.f4158d) {
            View view = this.f4157c;
            for (ViewParent parent = this.f4157c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f4157c;
                boolean z2 = parent instanceof C1398i;
                String str = "ViewParentCompat";
                String str2 = "ViewParent ";
                if (z2) {
                    z = ((C1398i) parent).mo129b(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(parent);
                            sb.append(" does not implement interface method onStartNestedScroll");
                            Log.e(str, sb.toString(), e);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f4155a = parent;
                    } else if (i2 == 1) {
                        this.f4156b = parent;
                    }
                    View view3 = this.f4157c;
                    if (z2) {
                        ((C1398i) parent).mo125a(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(parent);
                            sb2.append(" does not implement interface method onNestedScrollAccepted");
                            Log.e(str, sb2.toString(), e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }
}
