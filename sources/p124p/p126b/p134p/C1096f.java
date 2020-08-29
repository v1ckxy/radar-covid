package p124p.p126b.p134p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p124p.p126b.C1027j;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1120j;
import p124p.p126b.p134p.p135i.C1120j.C1121a;
import p124p.p126b.p136q.C1145b0;
import p124p.p126b.p136q.C1213u0;
import p124p.p150h.p156g.p157a.C1346a;
import p124p.p150h.p156g.p157a.C1347b;
import p124p.p150h.p162l.C1389b;
import p213q.p214a.p215a.p216a.C1965a;

/* renamed from: p.b.p.f */
public class C1096f extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f2935e;

    /* renamed from: f */
    public static final Class<?>[] f2936f;

    /* renamed from: a */
    public final Object[] f2937a;

    /* renamed from: b */
    public final Object[] f2938b;

    /* renamed from: c */
    public Context f2939c;

    /* renamed from: d */
    public Object f2940d;

    /* renamed from: p.b.p.f$a */
    public static class C1097a implements OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f2941c = {MenuItem.class};

        /* renamed from: a */
        public Object f2942a;

        /* renamed from: b */
        public Method f2943b;

        public C1097a(Object obj, String str) {
            this.f2942a = obj;
            Class cls = obj.getClass();
            try {
                this.f2943b = cls.getMethod(str, f2941c);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2943b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2943b.invoke(this.f2942a, new Object[]{menuItem})).booleanValue();
                }
                this.f2943b.invoke(this.f2942a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: p.b.p.f$b */
    public class C1098b {

        /* renamed from: A */
        public C1389b f2944A;

        /* renamed from: B */
        public CharSequence f2945B;

        /* renamed from: C */
        public CharSequence f2946C;

        /* renamed from: D */
        public ColorStateList f2947D = null;

        /* renamed from: E */
        public Mode f2948E = null;

        /* renamed from: a */
        public Menu f2950a;

        /* renamed from: b */
        public int f2951b;

        /* renamed from: c */
        public int f2952c;

        /* renamed from: d */
        public int f2953d;

        /* renamed from: e */
        public int f2954e;

        /* renamed from: f */
        public boolean f2955f;

        /* renamed from: g */
        public boolean f2956g;

        /* renamed from: h */
        public boolean f2957h;

        /* renamed from: i */
        public int f2958i;

        /* renamed from: j */
        public int f2959j;

        /* renamed from: k */
        public CharSequence f2960k;

        /* renamed from: l */
        public CharSequence f2961l;

        /* renamed from: m */
        public int f2962m;

        /* renamed from: n */
        public char f2963n;

        /* renamed from: o */
        public int f2964o;

        /* renamed from: p */
        public char f2965p;

        /* renamed from: q */
        public int f2966q;

        /* renamed from: r */
        public int f2967r;

        /* renamed from: s */
        public boolean f2968s;

        /* renamed from: t */
        public boolean f2969t;

        /* renamed from: u */
        public boolean f2970u;

        /* renamed from: v */
        public int f2971v;

        /* renamed from: w */
        public int f2972w;

        /* renamed from: x */
        public String f2973x;

        /* renamed from: y */
        public String f2974y;

        /* renamed from: z */
        public String f2975z;

        public C1098b(Menu menu) {
            this.f2950a = menu;
            this.f2951b = 0;
            this.f2952c = 0;
            this.f2953d = 0;
            this.f2954e = 0;
            this.f2955f = true;
            this.f2956g = true;
        }

        /* renamed from: a */
        public SubMenu mo4682a() {
            this.f2957h = true;
            SubMenu addSubMenu = this.f2950a.addSubMenu(this.f2951b, this.f2958i, this.f2959j, this.f2960k);
            mo4684a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        public final <T> T mo4683a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = Class.forName(str, false, C1096f.this.f2939c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }

        /* renamed from: a */
        public final void mo4684a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f2968s).setVisible(this.f2969t).setEnabled(this.f2970u).setCheckable(this.f2967r >= 1).setTitleCondensed(this.f2961l).setIcon(this.f2962m);
            int i = this.f2971v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f2975z != null) {
                if (!C1096f.this.f2939c.isRestricted()) {
                    C1096f fVar = C1096f.this;
                    if (fVar.f2940d == null) {
                        fVar.f2940d = fVar.mo4678a(fVar.f2939c);
                    }
                    menuItem.setOnMenuItemClickListener(new C1097a(fVar.f2940d, this.f2975z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C1118i;
            if (z2) {
                C1118i iVar = (C1118i) menuItem;
            }
            if (this.f2967r >= 2) {
                if (z2) {
                    ((C1118i) menuItem).mo4857b(true);
                } else if (menuItem instanceof C1120j) {
                    C1120j jVar = (C1120j) menuItem;
                    try {
                        if (jVar.f3132e == null) {
                            jVar.f3132e = jVar.f3131d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        jVar.f3132e.invoke(jVar.f3131d, new Object[]{Boolean.valueOf(true)});
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str = this.f2973x;
            if (str != null) {
                menuItem.setActionView((View) mo4683a(str, C1096f.f2935e, C1096f.this.f2937a));
                z = true;
            }
            int i2 = this.f2972w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C1389b bVar = this.f2944A;
            if (bVar != null) {
                if (menuItem instanceof C1347b) {
                    ((C1347b) menuItem).mo4702a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f2945B;
            boolean z3 = menuItem instanceof C1347b;
            if (z3) {
                ((C1347b) menuItem).setContentDescription(charSequence);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f2946C;
            if (z3) {
                ((C1347b) menuItem).setTooltipText(charSequence2);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.f2963n;
            int i3 = this.f2964o;
            if (z3) {
                ((C1347b) menuItem).setAlphabeticShortcut(c, i3);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.f2965p;
            int i4 = this.f2966q;
            if (z3) {
                ((C1347b) menuItem).setNumericShortcut(c2, i4);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c2, i4);
            }
            Mode mode = this.f2948E;
            if (mode != null) {
                if (z3) {
                    ((C1347b) menuItem).setIconTintMode(mode);
                } else if (VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f2947D;
            if (colorStateList == null) {
                return;
            }
            if (z3) {
                ((C1347b) menuItem).setIconTintList(colorStateList);
            } else if (VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f2935e = clsArr;
        f2936f = clsArr;
    }

    public C1096f(Context context) {
        super(context);
        this.f2939c = context;
        Object[] objArr = {context};
        this.f2937a = objArr;
        this.f2938b = objArr;
    }

    /* renamed from: a */
    public final Object mo4678a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = mo4678a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo4679a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        String str;
        char c;
        char c2;
        AttributeSet attributeSet2 = attributeSet;
        C1098b bVar = new C1098b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = "menu";
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(str)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(C1965a.m4751a("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                String str3 = "item";
                String str4 = "group";
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str2)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str2 = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals(str4)) {
                            bVar.f2951b = 0;
                            bVar.f2952c = 0;
                            bVar.f2953d = 0;
                            bVar.f2954e = 0;
                            bVar.f2955f = true;
                            bVar.f2956g = true;
                        } else if (name2.equals(str3)) {
                            if (!bVar.f2957h) {
                                C1389b bVar2 = bVar.f2944A;
                                if (bVar2 == null || !((C1121a) bVar2).f3133b.hasSubMenu()) {
                                    bVar.f2957h = true;
                                    bVar.mo4684a(bVar.f2950a.add(bVar.f2951b, bVar.f2958i, bVar.f2959j, bVar.f2960k));
                                } else {
                                    bVar.mo4682a();
                                }
                            }
                        } else if (name2.equals(str)) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(str4)) {
                        TypedArray obtainStyledAttributes = C1096f.this.f2939c.obtainStyledAttributes(attributeSet2, C1027j.MenuGroup);
                        bVar.f2951b = obtainStyledAttributes.getResourceId(C1027j.MenuGroup_android_id, 0);
                        bVar.f2952c = obtainStyledAttributes.getInt(C1027j.MenuGroup_android_menuCategory, 0);
                        bVar.f2953d = obtainStyledAttributes.getInt(C1027j.MenuGroup_android_orderInCategory, 0);
                        bVar.f2954e = obtainStyledAttributes.getInt(C1027j.MenuGroup_android_checkableBehavior, 0);
                        bVar.f2955f = obtainStyledAttributes.getBoolean(C1027j.MenuGroup_android_visible, true);
                        bVar.f2956g = obtainStyledAttributes.getBoolean(C1027j.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals(str3)) {
                        C1213u0 a = C1213u0.m3012a(C1096f.this.f2939c, attributeSet2, C1027j.MenuItem);
                        bVar.f2958i = a.mo5327g(C1027j.MenuItem_android_id, 0);
                        bVar.f2959j = (a.mo5321d(C1027j.MenuItem_android_menuCategory, bVar.f2952c) & -65536) | (a.mo5321d(C1027j.MenuItem_android_orderInCategory, bVar.f2953d) & 65535);
                        bVar.f2960k = a.mo5324e(C1027j.MenuItem_android_title);
                        bVar.f2961l = a.mo5324e(C1027j.MenuItem_android_titleCondensed);
                        bVar.f2962m = a.mo5327g(C1027j.MenuItem_android_icon, 0);
                        String d = a.mo5322d(C1027j.MenuItem_android_alphabeticShortcut);
                        if (d == null) {
                            c = 0;
                        } else {
                            c = d.charAt(0);
                        }
                        bVar.f2963n = c;
                        bVar.f2964o = a.mo5321d(C1027j.MenuItem_alphabeticModifiers, 4096);
                        String d2 = a.mo5322d(C1027j.MenuItem_android_numericShortcut);
                        if (d2 == null) {
                            c2 = 0;
                        } else {
                            c2 = d2.charAt(0);
                        }
                        bVar.f2965p = c2;
                        bVar.f2966q = a.mo5321d(C1027j.MenuItem_numericModifiers, 4096);
                        bVar.f2967r = a.mo5326f(C1027j.MenuItem_android_checkable) ? a.mo5316a(C1027j.MenuItem_android_checkable, false) : bVar.f2954e;
                        bVar.f2968s = a.mo5316a(C1027j.MenuItem_android_checked, false);
                        bVar.f2969t = a.mo5316a(C1027j.MenuItem_android_visible, bVar.f2955f);
                        bVar.f2970u = a.mo5316a(C1027j.MenuItem_android_enabled, bVar.f2956g);
                        bVar.f2971v = a.mo5321d(C1027j.MenuItem_showAsAction, -1);
                        bVar.f2975z = a.mo5322d(C1027j.MenuItem_android_onClick);
                        bVar.f2972w = a.mo5327g(C1027j.MenuItem_actionLayout, 0);
                        bVar.f2973x = a.mo5322d(C1027j.MenuItem_actionViewClass);
                        String d3 = a.mo5322d(C1027j.MenuItem_actionProviderClass);
                        bVar.f2974y = d3;
                        boolean z3 = d3 != null;
                        if (z3 && bVar.f2972w == 0 && bVar.f2973x == null) {
                            bVar.f2944A = (C1389b) bVar.mo4683a(bVar.f2974y, f2936f, C1096f.this.f2938b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.f2944A = null;
                        }
                        bVar.f2945B = a.mo5324e(C1027j.MenuItem_contentDescription);
                        bVar.f2946C = a.mo5324e(C1027j.MenuItem_tooltipText);
                        if (a.mo5326f(C1027j.MenuItem_iconTintMode)) {
                            bVar.f2948E = C1145b0.m2889a(a.mo5321d(C1027j.MenuItem_iconTintMode, -1), bVar.f2948E);
                        } else {
                            bVar.f2948E = null;
                        }
                        if (a.mo5326f(C1027j.MenuItem_iconTint)) {
                            bVar.f2947D = a.mo5314a(C1027j.MenuItem_iconTint);
                        } else {
                            bVar.f2947D = null;
                        }
                        a.f3426b.recycle();
                        bVar.f2957h = false;
                    } else {
                        if (name3.equals(str)) {
                            mo4679a(xmlPullParser, attributeSet2, bVar.mo4682a());
                        } else {
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                            str2 = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser6 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (!(menu instanceof C1346a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f2939c.getResources().getLayout(i);
            mo4679a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e) {
            throw new InflateException(str, e);
        } catch (IOException e2) {
            throw new InflateException(str, e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
