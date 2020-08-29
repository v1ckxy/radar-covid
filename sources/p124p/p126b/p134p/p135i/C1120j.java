package p124p.p126b.p134p.p135i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p124p.p126b.p134p.C1091b;
import p124p.p150h.p156g.p157a.C1347b;
import p124p.p150h.p162l.C1389b;
import p124p.p150h.p162l.C1389b.C1390a;

/* renamed from: p.b.p.i.j */
public class C1120j extends C1104c implements MenuItem {

    /* renamed from: d */
    public final C1347b f3131d;

    /* renamed from: e */
    public Method f3132e;

    /* renamed from: p.b.p.i.j$a */
    public class C1121a extends C1389b {

        /* renamed from: b */
        public final ActionProvider f3133b;

        public C1121a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f3133b = actionProvider;
        }
    }

    /* renamed from: p.b.p.i.j$b */
    public class C1122b extends C1121a implements VisibilityListener {

        /* renamed from: d */
        public C1390a f3135d;

        public C1122b(C1120j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo4952a(MenuItem menuItem) {
            return this.f3133b.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo4953a(C1390a aVar) {
            this.f3135d = aVar;
            this.f3133b.setVisibilityListener(aVar != null ? this : null);
        }

        /* renamed from: a */
        public boolean mo4954a() {
            return this.f3133b.isVisible();
        }

        /* renamed from: b */
        public boolean mo4955b() {
            return this.f3133b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C1390a aVar = this.f3135d;
            if (aVar != null) {
                C1114g gVar = C1118i.this.f3117n;
                gVar.f3079h = true;
                gVar.mo4824b(true);
            }
        }
    }

    /* renamed from: p.b.p.i.j$c */
    public static class C1123c extends FrameLayout implements C1091b {

        /* renamed from: e */
        public final CollapsibleActionView f3136e;

        public C1123c(View view) {
            super(view.getContext());
            this.f3136e = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo301a() {
            this.f3136e.onActionViewExpanded();
        }

        /* renamed from: c */
        public void mo307c() {
            this.f3136e.onActionViewCollapsed();
        }
    }

    /* renamed from: p.b.p.i.j$d */
    public class C1124d implements OnActionExpandListener {

        /* renamed from: a */
        public final OnActionExpandListener f3137a;

        public C1124d(OnActionExpandListener onActionExpandListener) {
            this.f3137a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f3137a.onMenuItemActionCollapse(C1120j.this.mo4760a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f3137a.onMenuItemActionExpand(C1120j.this.mo4760a(menuItem));
        }
    }

    /* renamed from: p.b.p.i.j$e */
    public class C1125e implements OnMenuItemClickListener {

        /* renamed from: a */
        public final OnMenuItemClickListener f3139a;

        public C1125e(OnMenuItemClickListener onMenuItemClickListener) {
            this.f3139a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f3139a.onMenuItemClick(C1120j.this.mo4760a(menuItem));
        }
    }

    public C1120j(Context context, C1347b bVar) {
        super(context);
        if (bVar != null) {
            this.f3131d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f3131d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f3131d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C1389b a = this.f3131d.mo4703a();
        if (a instanceof C1121a) {
            return ((C1121a) a).f3133b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f3131d.getActionView();
        return actionView instanceof C1123c ? (View) ((C1123c) actionView).f3136e : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f3131d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f3131d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f3131d.getContentDescription();
    }

    public int getGroupId() {
        return this.f3131d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f3131d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f3131d.getIconTintList();
    }

    public Mode getIconTintMode() {
        return this.f3131d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f3131d.getIntent();
    }

    public int getItemId() {
        return this.f3131d.getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f3131d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f3131d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f3131d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f3131d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo4761a(this.f3131d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f3131d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f3131d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f3131d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f3131d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f3131d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f3131d.isCheckable();
    }

    public boolean isChecked() {
        return this.f3131d.isChecked();
    }

    public boolean isEnabled() {
        return this.f3131d.isEnabled();
    }

    public boolean isVisible() {
        return this.f3131d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C1122b bVar = new C1122b(this, this.f3014a, actionProvider);
        C1347b bVar2 = this.f3131d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo4702a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f3131d.setActionView(i);
        View actionView = this.f3131d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f3131d.setActionView((View) new C1123c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1123c(view);
        }
        this.f3131d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f3131d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f3131d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f3131d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f3131d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f3131d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f3131d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f3131d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f3131d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3131d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f3131d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f3131d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f3131d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f3131d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f3131d.setOnActionExpandListener(onActionExpandListener != null ? new C1124d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f3131d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C1125e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f3131d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f3131d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f3131d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f3131d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f3131d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f3131d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3131d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f3131d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f3131d.setVisible(z);
    }
}
