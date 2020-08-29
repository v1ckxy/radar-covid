package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.C1018a;
import p124p.p126b.C1023f;
import p124p.p126b.C1024g;
import p124p.p126b.C1025h;
import p124p.p126b.C1027j;
import p124p.p126b.p134p.p135i.C1118i;
import p124p.p126b.p134p.p135i.C1131n.C1132a;
import p124p.p126b.p136q.C1213u0;
import p124p.p150h.p162l.C1404o;

public class ListMenuItemView extends LinearLayout implements C1132a, SelectionBoundsAdjuster {

    /* renamed from: e */
    public C1118i f109e;

    /* renamed from: f */
    public ImageView f110f;

    /* renamed from: g */
    public RadioButton f111g;

    /* renamed from: h */
    public TextView f112h;

    /* renamed from: i */
    public CheckBox f113i;

    /* renamed from: j */
    public TextView f114j;

    /* renamed from: k */
    public ImageView f115k;

    /* renamed from: l */
    public ImageView f116l;

    /* renamed from: m */
    public LinearLayout f117m;

    /* renamed from: n */
    public Drawable f118n;

    /* renamed from: o */
    public int f119o;

    /* renamed from: p */
    public Context f120p;

    /* renamed from: q */
    public boolean f121q;

    /* renamed from: r */
    public Drawable f122r;

    /* renamed from: s */
    public boolean f123s;

    /* renamed from: t */
    public LayoutInflater f124t;

    /* renamed from: u */
    public boolean f125u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1018a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C1213u0 a = C1213u0.m3013a(getContext(), attributeSet, C1027j.MenuView, i, 0);
        this.f118n = a.mo5318b(C1027j.MenuView_android_itemBackground);
        this.f119o = a.mo5327g(C1027j.MenuView_android_itemTextAppearance, -1);
        this.f121q = a.mo5316a(C1027j.MenuView_preserveIconSpacing, false);
        this.f120p = context;
        this.f122r = a.mo5318b(C1027j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C1018a.dropDownListViewStyle, 0);
        this.f123s = obtainStyledAttributes.hasValue(0);
        a.f3426b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f124t == null) {
            this.f124t = LayoutInflater.from(getContext());
        }
        return this.f124t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f115k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo38a(C1118i iVar, int i) {
        CharSequence charSequence;
        String str;
        int i2;
        this.f109e = iVar;
        int i3 = 0;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (mo40b()) {
            charSequence = iVar.getTitleCondensed();
        } else {
            charSequence = iVar.f3108e;
        }
        setTitle(charSequence);
        setCheckable(iVar.isCheckable());
        boolean f = iVar.mo4863f();
        iVar.mo4856b();
        if (!f || !this.f109e.mo4863f()) {
            i3 = 8;
        }
        if (i3 == 0) {
            TextView textView = this.f114j;
            C1118i iVar2 = this.f109e;
            char b = iVar2.mo4856b();
            if (b == 0) {
                str = Objects.EMPTY_STRING;
            } else {
                Resources resources = iVar2.f3117n.f3072a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar2.f3117n.f3072a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(C1025h.abc_prepend_shortcut_label));
                }
                int i4 = iVar2.f3117n.mo4832f() ? iVar2.f3114k : iVar2.f3112i;
                C1118i.m2772a(sb, i4, 65536, resources.getString(C1025h.abc_menu_meta_shortcut_label));
                C1118i.m2772a(sb, i4, 4096, resources.getString(C1025h.abc_menu_ctrl_shortcut_label));
                C1118i.m2772a(sb, i4, 2, resources.getString(C1025h.abc_menu_alt_shortcut_label));
                C1118i.m2772a(sb, i4, 1, resources.getString(C1025h.abc_menu_shift_shortcut_label));
                C1118i.m2772a(sb, i4, 4, resources.getString(C1025h.abc_menu_sym_shortcut_label));
                C1118i.m2772a(sb, i4, 8, resources.getString(C1025h.abc_menu_function_shortcut_label));
                if (b == 8) {
                    i2 = C1025h.abc_menu_delete_shortcut_label;
                } else if (b == 10) {
                    i2 = C1025h.abc_menu_enter_shortcut_label;
                } else if (b != ' ') {
                    sb.append(b);
                    str = sb.toString();
                } else {
                    i2 = C1025h.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i2));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f114j.getVisibility() != i3) {
            this.f114j.setVisibility(i3);
        }
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.f3120q);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f116l;
        if (imageView != null && imageView.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f116l.getLayoutParams();
            rect.top = this.f116l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* renamed from: b */
    public boolean mo40b() {
        return false;
    }

    /* renamed from: c */
    public final void mo68c() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C1024g.abc_list_menu_item_radio, this, false);
        this.f111g = radioButton;
        LinearLayout linearLayout = this.f117m;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public C1118i getItemData() {
        return this.f109e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        C1404o.m3522a((View) this, this.f118n);
        TextView textView = (TextView) findViewById(C1023f.title);
        this.f112h = textView;
        int i = this.f119o;
        if (i != -1) {
            textView.setTextAppearance(this.f120p, i);
        }
        this.f114j = (TextView) findViewById(C1023f.shortcut);
        ImageView imageView = (ImageView) findViewById(C1023f.submenuarrow);
        this.f115k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f122r);
        }
        this.f116l = (ImageView) findViewById(C1023f.group_divider);
        this.f117m = (LinearLayout) findViewById(C1023f.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.f110f != null && this.f121q) {
            LayoutParams layoutParams = (LayoutParams) this.f110f.getLayoutParams();
            int i3 = getLayoutParams().height;
            if (i3 > 0 && layoutParams.width <= 0) {
                layoutParams.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f111g != null || this.f113i != null) {
            if (this.f109e.mo4862e()) {
                if (this.f111g == null) {
                    mo68c();
                }
                compoundButton2 = this.f111g;
                compoundButton = this.f113i;
            } else {
                if (this.f113i == null) {
                    mo66a();
                }
                compoundButton2 = this.f113i;
                compoundButton = this.f111g;
            }
            if (z) {
                compoundButton2.setChecked(this.f109e.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.f113i;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.f111g;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f109e.mo4862e()) {
            if (this.f111g == null) {
                mo68c();
            }
            compoundButton = this.f111g;
        } else {
            if (this.f113i == null) {
                mo66a();
            }
            compoundButton = this.f113i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f125u = z;
        this.f121q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f116l;
        if (imageView != null) {
            imageView.setVisibility((this.f123s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f109e.f3117n.f3090s || this.f125u;
        if (!z && !this.f121q) {
            return;
        }
        if (this.f110f != null || drawable != null || this.f121q) {
            if (this.f110f == null) {
                ImageView imageView = (ImageView) getInflater().inflate(C1024g.abc_list_menu_item_icon, this, false);
                this.f110f = imageView;
                LinearLayout linearLayout = this.f117m;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            }
            if (drawable != null || this.f121q) {
                ImageView imageView2 = this.f110f;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.f110f.getVisibility() != 0) {
                    this.f110f.setVisibility(0);
                }
            } else {
                this.f110f.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f112h.setText(charSequence);
            if (this.f112h.getVisibility() != 0) {
                textView = this.f112h;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.f112h.getVisibility() != 8) {
                textView = this.f112h;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo66a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C1024g.abc_list_menu_item_checkbox, this, false);
        this.f113i = checkBox;
        LinearLayout linearLayout = this.f117m;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }
}
