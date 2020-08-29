package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p150h.p156g.p157a.C1347b;
import p124p.p150h.p162l.C1389b;
import p124p.p150h.p162l.C1389b.C1390a;

/* renamed from: p.b.p.i.i */
public final class C1118i implements C1347b {

    /* renamed from: A */
    public C1389b f3100A;

    /* renamed from: B */
    public OnActionExpandListener f3101B;

    /* renamed from: C */
    public boolean f3102C = false;

    /* renamed from: D */
    public ContextMenuInfo f3103D;

    /* renamed from: a */
    public final int f3104a;

    /* renamed from: b */
    public final int f3105b;

    /* renamed from: c */
    public final int f3106c;

    /* renamed from: d */
    public final int f3107d;

    /* renamed from: e */
    public CharSequence f3108e;

    /* renamed from: f */
    public CharSequence f3109f;

    /* renamed from: g */
    public Intent f3110g;

    /* renamed from: h */
    public char f3111h;

    /* renamed from: i */
    public int f3112i = 4096;

    /* renamed from: j */
    public char f3113j;

    /* renamed from: k */
    public int f3114k = 4096;

    /* renamed from: l */
    public Drawable f3115l;

    /* renamed from: m */
    public int f3116m = 0;

    /* renamed from: n */
    public C1114g f3117n;

    /* renamed from: o */
    public C1138r f3118o;

    /* renamed from: p */
    public OnMenuItemClickListener f3119p;

    /* renamed from: q */
    public CharSequence f3120q;

    /* renamed from: r */
    public CharSequence f3121r;

    /* renamed from: s */
    public ColorStateList f3122s = null;

    /* renamed from: t */
    public Mode f3123t = null;

    /* renamed from: u */
    public boolean f3124u = false;

    /* renamed from: v */
    public boolean f3125v = false;

    /* renamed from: w */
    public boolean f3126w = false;

    /* renamed from: x */
    public int f3127x = 16;

    /* renamed from: y */
    public int f3128y = 0;

    /* renamed from: z */
    public View f3129z;

    /* renamed from: p.b.p.i.i$a */
    public class C1119a implements C1390a {
        public C1119a() {
        }
    }

    public C1118i(C1114g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f3117n = gVar;
        this.f3104a = i2;
        this.f3105b = i;
        this.f3106c = i3;
        this.f3107d = i4;
        this.f3108e = charSequence;
        this.f3128y = i5;
    }

    /* renamed from: a */
    public static void m2772a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: a */
    public final Drawable mo4854a(Drawable drawable) {
        if (drawable != null && this.f3126w && (this.f3124u || this.f3125v)) {
            drawable = drawable.mutate();
            if (this.f3124u) {
                drawable.setTintList(this.f3122s);
            }
            if (this.f3125v) {
                drawable.setTintMode(this.f3123t);
            }
            this.f3126w = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public C1389b mo4703a() {
        return this.f3100A;
    }

    /* renamed from: a */
    public void mo4855a(boolean z) {
        int i = this.f3127x;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f3127x = i2;
        if (i != i2) {
            this.f3117n.mo4824b(false);
        }
    }

    /* renamed from: b */
    public char mo4856b() {
        return this.f3117n.mo4832f() ? this.f3113j : this.f3111h;
    }

    /* renamed from: b */
    public void mo4857b(boolean z) {
        this.f3127x = (z ? 4 : 0) | (this.f3127x & -5);
    }

    /* renamed from: c */
    public void mo4858c(boolean z) {
        this.f3127x = z ? this.f3127x | 32 : this.f3127x & -33;
    }

    /* renamed from: c */
    public boolean mo4859c() {
        if ((this.f3128y & 8) == 0) {
            return false;
        }
        if (this.f3129z == null) {
            C1389b bVar = this.f3100A;
            if (bVar != null) {
                this.f3129z = bVar.mo4952a((MenuItem) this);
            }
        }
        return this.f3129z != null;
    }

    public boolean collapseActionView() {
        if ((this.f3128y & 8) == 0) {
            return false;
        }
        if (this.f3129z == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.f3101B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3117n.mo4812a(this);
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo4860d() {
        return (this.f3127x & 32) == 32;
    }

    /* renamed from: d */
    public boolean mo4861d(boolean z) {
        int i = this.f3127x;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f3127x = i2;
        return i != i2;
    }

    /* renamed from: e */
    public boolean mo4862e() {
        return (this.f3127x & 4) != 0;
    }

    public boolean expandActionView() {
        if (!mo4859c()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.f3101B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3117n.mo4825b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo4863f() {
        return this.f3117n.mo4834g() && mo4856b() != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f3129z;
        if (view != null) {
            return view;
        }
        C1389b bVar = this.f3100A;
        if (bVar == null) {
            return null;
        }
        View a = bVar.mo4952a((MenuItem) this);
        this.f3129z = a;
        return a;
    }

    public int getAlphabeticModifiers() {
        return this.f3114k;
    }

    public char getAlphabeticShortcut() {
        return this.f3113j;
    }

    public CharSequence getContentDescription() {
        return this.f3120q;
    }

    public int getGroupId() {
        return this.f3105b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f3115l;
        if (drawable != null) {
            return mo4854a(drawable);
        }
        int i = this.f3116m;
        if (i == 0) {
            return null;
        }
        Drawable b = C1070a.m2602b(this.f3117n.f3072a, i);
        this.f3116m = 0;
        this.f3115l = b;
        return mo4854a(b);
    }

    public ColorStateList getIconTintList() {
        return this.f3122s;
    }

    public Mode getIconTintMode() {
        return this.f3123t;
    }

    public Intent getIntent() {
        return this.f3110g;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f3104a;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f3103D;
    }

    public int getNumericModifiers() {
        return this.f3112i;
    }

    public char getNumericShortcut() {
        return this.f3111h;
    }

    public int getOrder() {
        return this.f3106c;
    }

    public SubMenu getSubMenu() {
        return this.f3118o;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f3108e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3109f;
        return charSequence != null ? charSequence : this.f3108e;
    }

    public CharSequence getTooltipText() {
        return this.f3121r;
    }

    public boolean hasSubMenu() {
        return this.f3118o != null;
    }

    public boolean isActionViewExpanded() {
        return this.f3102C;
    }

    public boolean isCheckable() {
        return (this.f3127x & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f3127x & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f3127x & 16) != 0;
    }

    public boolean isVisible() {
        C1389b bVar = this.f3100A;
        boolean z = true;
        if (bVar == null || !bVar.mo4955b()) {
            if ((this.f3127x & 8) != 0) {
                z = false;
            }
            return z;
        }
        if ((this.f3127x & 8) != 0 || !this.f3100A.mo4954a()) {
            z = false;
        }
        return z;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setActionView(int i) {
        Context context = this.f3117n.f3072a;
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public C1347b setActionView(View view) {
        this.f3129z = view;
        this.f3100A = null;
        if (view != null && view.getId() == -1) {
            int i = this.f3104a;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.f3117n.mo4836h();
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f3113j == c) {
            return this;
        }
        this.f3113j = Character.toLowerCase(c);
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f3113j == c && this.f3114k == i) {
            return this;
        }
        this.f3113j = Character.toLowerCase(c);
        this.f3114k = KeyEvent.normalizeMetaState(i);
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f3127x;
        boolean z2 = z | (i & true);
        this.f3127x = z2 ? 1 : 0;
        if (i != z2) {
            this.f3117n.mo4824b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f3127x & 4) != 0) {
            C1114g gVar = this.f3117n;
            if (gVar != null) {
                int groupId = getGroupId();
                int size = gVar.f3077f.size();
                gVar.mo4840j();
                for (int i = 0; i < size; i++) {
                    C1118i iVar = (C1118i) gVar.f3077f.get(i);
                    if (iVar.f3105b == groupId && iVar.mo4862e() && iVar.isCheckable()) {
                        iVar.mo4855a(iVar == this);
                    }
                }
                gVar.mo4838i();
            } else {
                throw null;
            }
        } else {
            mo4855a(z);
        }
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f3120q = charSequence;
        this.f3117n.mo4824b(false);
        return this;
    }

    /* renamed from: setContentDescription reason: collision with other method in class */
    public C1347b m11853setContentDescription(CharSequence charSequence) {
        this.f3120q = charSequence;
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f3127x = z ? this.f3127x | 16 : this.f3127x & -17;
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f3115l = null;
        this.f3116m = i;
        this.f3126w = true;
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f3116m = 0;
        this.f3115l = drawable;
        this.f3126w = true;
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3122s = colorStateList;
        this.f3124u = true;
        this.f3126w = true;
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f3123t = mode;
        this.f3125v = true;
        this.f3126w = true;
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f3110g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f3111h == c) {
            return this;
        }
        this.f3111h = c;
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f3111h == c && this.f3112i == i) {
            return this;
        }
        this.f3111h = c;
        this.f3112i = KeyEvent.normalizeMetaState(i);
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f3101B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f3119p = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f3111h = c;
        this.f3113j = Character.toLowerCase(c2);
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f3111h = c;
        this.f3112i = KeyEvent.normalizeMetaState(i);
        this.f3113j = Character.toLowerCase(c2);
        this.f3114k = KeyEvent.normalizeMetaState(i2);
        this.f3117n.mo4824b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f3128y = i;
            this.f3117n.mo4836h();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f3117n.f3072a.getString(i));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f3108e = charSequence;
        this.f3117n.mo4824b(false);
        C1138r rVar = this.f3118o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3109f = charSequence;
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f3121r = charSequence;
        this.f3117n.mo4824b(false);
        return this;
    }

    /* renamed from: setTooltipText reason: collision with other method in class */
    public C1347b m11854setTooltipText(CharSequence charSequence) {
        this.f3121r = charSequence;
        this.f3117n.mo4824b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo4861d(z)) {
            C1114g gVar = this.f3117n;
            gVar.f3079h = true;
            gVar.mo4824b(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f3108e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: a */
    public C1347b mo4702a(C1389b bVar) {
        C1389b bVar2 = this.f3100A;
        if (bVar2 != null) {
            bVar2.f4149a = null;
        }
        this.f3129z = null;
        this.f3100A = bVar;
        this.f3117n.mo4824b(true);
        C1389b bVar3 = this.f3100A;
        if (bVar3 != null) {
            bVar3.mo4953a((C1390a) new C1119a());
        }
        return this;
    }
}
