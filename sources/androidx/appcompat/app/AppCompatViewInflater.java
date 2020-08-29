package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatSpinner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.C1018a;
import p124p.p126b.C1027j;
import p124p.p126b.p134p.C1092c;
import p124p.p126b.p136q.C1160d;
import p124p.p126b.p136q.C1166f;
import p124p.p126b.p136q.C1169g;
import p124p.p126b.p136q.C1181j;
import p124p.p126b.p136q.C1184k;
import p124p.p126b.p136q.C1194m;
import p124p.p126b.p136q.C1196n;
import p124p.p126b.p136q.C1204q;
import p124p.p126b.p136q.C1206r;
import p124p.p126b.p136q.C1207r0;
import p124p.p126b.p136q.C1208s;
import p124p.p126b.p136q.C1218w;
import p124p.p126b.p136q.C1225y;
import p124p.p143e.C1248a;
import p124p.p150h.p162l.C1404o;
import p213q.p214a.p215a.p216a.C1965a;

public class AppCompatViewInflater {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final Map<String, Constructor<? extends View>> sConstructorMap = new C1248a();
    public static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {16843375};
    public final Object[] mConstructorArgs = new Object[2];

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    public static class C0010a implements OnClickListener {

        /* renamed from: e */
        public final View f91e;

        /* renamed from: f */
        public final String f92f;

        /* renamed from: g */
        public Method f93g;

        /* renamed from: h */
        public Context f94h;

        public C0010a(View view, String str) {
            this.f91e = view;
            this.f92f = str;
        }

        public void onClick(View view) {
            String str;
            if (this.f93g == null) {
                for (Context context = this.f91e.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted()) {
                            Method method = context.getClass().getMethod(this.f92f, new Class[]{View.class});
                            if (method != null) {
                                this.f93g = method;
                                this.f94h = context;
                            }
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.f91e.getId();
                if (id == -1) {
                    str = Objects.EMPTY_STRING;
                } else {
                    StringBuilder a = C1965a.m4756a(" with id '");
                    a.append(this.f91e.getContext().getResources().getResourceEntryName(id));
                    a.append("'");
                    str = a.toString();
                }
                StringBuilder a2 = C1965a.m4756a("Could not find method ");
                a2.append(this.f92f);
                a2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                a2.append(this.f91e.getClass());
                a2.append(str);
                throw new IllegalStateException(a2.toString());
            }
            try {
                this.f93g.invoke(this.f94h, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C1404o.m3559t(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0010a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Constructor constructor = (Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            sConstructorMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.mConstructorArgs[0] = context;
            this.mConstructorArgs[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String createViewByPrefix : sClassPrefixList) {
                    View createViewByPrefix2 = createViewByPrefix(context, str, createViewByPrefix);
                    if (createViewByPrefix2 != null) {
                        return createViewByPrefix2;
                    }
                }
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View createViewByPrefix3 = createViewByPrefix(context, str, null);
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
            return createViewByPrefix3;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.mConstructorArgs;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    public static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1027j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C1027j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C1027j.View_theme, 0);
            if (resourceId != 0) {
                Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C1092c) || ((C1092c) context).f2919a != resourceId) ? new C1092c(context, resourceId) : context;
        }
        return context;
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    public C1160d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1160d(context, attributeSet);
    }

    public C1166f createButton(Context context, AttributeSet attributeSet) {
        return new C1166f(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public C1169g createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C1169g(context, attributeSet);
    }

    public C1181j createEditText(Context context, AttributeSet attributeSet) {
        return new C1181j(context, attributeSet);
    }

    public C1184k createImageButton(Context context, AttributeSet attributeSet) {
        return new C1184k(context, attributeSet);
    }

    public C1194m createImageView(Context context, AttributeSet attributeSet) {
        return new C1194m(context, attributeSet, 0);
    }

    public C1196n createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1196n(context, attributeSet);
    }

    public C1204q createRadioButton(Context context, AttributeSet attributeSet) {
        return new C1204q(context, attributeSet, C1018a.radioButtonStyle);
    }

    public C1206r createRatingBar(Context context, AttributeSet attributeSet) {
        return new C1206r(context, attributeSet);
    }

    public C1208s createSeekBar(Context context, AttributeSet attributeSet) {
        return new C1208s(context, attributeSet);
    }

    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public C1218w createTextView(Context context, AttributeSet attributeSet) {
        return new C1218w(context, attributeSet);
    }

    public C1225y createToggleButton(Context context, AttributeSet attributeSet) {
        return new C1225y(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            C1207r0.m3007a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 13;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = createTextView(context2, attributeSet);
                break;
            case 1:
                view2 = createImageView(context2, attributeSet);
                break;
            case 2:
                view2 = createButton(context2, attributeSet);
                break;
            case 3:
                view2 = createEditText(context2, attributeSet);
                break;
            case 4:
                view2 = createSpinner(context2, attributeSet);
                break;
            case 5:
                view2 = createImageButton(context2, attributeSet);
                break;
            case 6:
                view2 = createCheckBox(context2, attributeSet);
                break;
            case 7:
                view2 = createRadioButton(context2, attributeSet);
                break;
            case 8:
                view2 = createCheckedTextView(context2, attributeSet);
                break;
            case 9:
                view2 = createAutoCompleteTextView(context2, attributeSet);
                break;
            case 10:
                view2 = createMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case 11:
                view2 = createRatingBar(context2, attributeSet);
                break;
            case 12:
                view2 = createSeekBar(context2, attributeSet);
                break;
            case 13:
                view2 = createToggleButton(context2, attributeSet);
                break;
            default:
                view2 = createView(context2, str, attributeSet);
                break;
        }
        verifyNotNull(view2, str);
        if (view2 == null && context != context2) {
            view2 = createViewFromTag(context2, str, attributeSet);
        }
        if (view2 != null) {
            checkOnClickListener(view2, attributeSet);
        }
        return view2;
    }
}
