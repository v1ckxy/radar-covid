package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import p124p.p150h.p152e.C1325a;
import p124p.p150h.p156g.p157a.C1347b;
import p124p.p150h.p162l.C1389b;

/* renamed from: p.b.p.i.a */
public class C1102a implements C1347b {

    /* renamed from: a */
    public final int f2986a;

    /* renamed from: b */
    public final int f2987b;

    /* renamed from: c */
    public final int f2988c;

    /* renamed from: d */
    public CharSequence f2989d;

    /* renamed from: e */
    public CharSequence f2990e;

    /* renamed from: f */
    public Intent f2991f;

    /* renamed from: g */
    public char f2992g;

    /* renamed from: h */
    public int f2993h = 4096;

    /* renamed from: i */
    public char f2994i;

    /* renamed from: j */
    public int f2995j = 4096;

    /* renamed from: k */
    public Drawable f2996k;

    /* renamed from: l */
    public Context f2997l;

    /* renamed from: m */
    public CharSequence f2998m;

    /* renamed from: n */
    public CharSequence f2999n;

    /* renamed from: o */
    public ColorStateList f3000o = null;

    /* renamed from: p */
    public Mode f3001p = null;

    /* renamed from: q */
    public boolean f3002q = false;

    /* renamed from: r */
    public boolean f3003r = false;

    /* renamed from: s */
    public int f3004s = 16;

    public C1102a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f2997l = context;
        this.f2986a = i2;
        this.f2987b = i;
        this.f2988c = i4;
        this.f2989d = charSequence;
    }

    /* renamed from: a */
    public C1347b mo4702a(C1389b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C1389b mo4703a() {
        return null;
    }

    /* renamed from: b */
    public final void mo4704b() {
        if (this.f2996k == null) {
            return;
        }
        if (this.f3002q || this.f3003r) {
            Drawable drawable = this.f2996k;
            this.f2996k = drawable;
            Drawable mutate = drawable.mutate();
            this.f2996k = mutate;
            if (this.f3002q) {
                mutate.setTintList(this.f3000o);
            }
            if (this.f3003r) {
                this.f2996k.setTintMode(this.f3001p);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f2995j;
    }

    public char getAlphabeticShortcut() {
        return this.f2994i;
    }

    public CharSequence getContentDescription() {
        return this.f2998m;
    }

    public int getGroupId() {
        return this.f2987b;
    }

    public Drawable getIcon() {
        return this.f2996k;
    }

    public ColorStateList getIconTintList() {
        return this.f3000o;
    }

    public Mode getIconTintMode() {
        return this.f3001p;
    }

    public Intent getIntent() {
        return this.f2991f;
    }

    public int getItemId() {
        return this.f2986a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f2993h;
    }

    public char getNumericShortcut() {
        return this.f2992g;
    }

    public int getOrder() {
        return this.f2988c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f2989d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2990e;
        return charSequence != null ? charSequence : this.f2989d;
    }

    public CharSequence getTooltipText() {
        return this.f2999n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f3004s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f3004s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f3004s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f3004s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f2994i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2994i = Character.toLowerCase(c);
        this.f2995j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f3004s = z | (this.f3004s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f3004s = (z ? 2 : 0) | (this.f3004s & -3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f2998m = charSequence;
        return this;
    }

    /* renamed from: setContentDescription reason: collision with other method in class */
    public C1347b m11851setContentDescription(CharSequence charSequence) {
        this.f2998m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f3004s = (z ? 16 : 0) | (this.f3004s & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f2996k = C1325a.m3377b(this.f2997l, i);
        mo4704b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f2996k = drawable;
        mo4704b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3000o = colorStateList;
        this.f3002q = true;
        mo4704b();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f3001p = mode;
        this.f3003r = true;
        mo4704b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2991f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f2992g = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f2992g = c;
        this.f2993h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f2992g = c;
        this.f2994i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2992g = c;
        this.f2993h = KeyEvent.normalizeMetaState(i);
        this.f2994i = Character.toLowerCase(c2);
        this.f2995j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f2989d = this.f2997l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f2989d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2990e = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f2999n = charSequence;
        return this;
    }

    /* renamed from: setTooltipText reason: collision with other method in class */
    public C1347b m11852setTooltipText(CharSequence charSequence) {
        this.f2999n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f3004s & 8;
        if (z) {
            i = 0;
        }
        this.f3004s = i2 | i;
        return this;
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
