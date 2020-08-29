package p213q.p217b.p218a.p271c.p283m;

import android.util.Property;
import android.view.ViewGroup;
import p213q.p217b.p218a.p271c.C3327f;

/* renamed from: q.b.a.c.m.c */
public class C3409c extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final Property<ViewGroup, Float> f8578a = new C3409c("childrenAlpha");

    public C3409c(String str) {
        super(Float.class, str);
    }

    public Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(C3327f.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    public void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(C3327f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
