package p124p.p126b.p136q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import p124p.p126b.C1018a;
import p124p.p126b.C1020c;
import p124p.p126b.C1022e;
import p124p.p126b.p128l.p129a.C1070a;
import p124p.p126b.p136q.C1185k0.C1190e;
import p124p.p150h.p154f.C1335a;

/* renamed from: p.b.q.i */
public final class C1178i {

    /* renamed from: b */
    public static final Mode f3325b = Mode.SRC_IN;

    /* renamed from: c */
    public static C1178i f3326c;

    /* renamed from: a */
    public C1185k0 f3327a;

    /* renamed from: p.b.q.i$a */
    public static class C1179a implements C1190e {

        /* renamed from: a */
        public final int[] f3328a = {C1022e.abc_textfield_search_default_mtrl_alpha, C1022e.abc_textfield_default_mtrl_alpha, C1022e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f3329b = {C1022e.abc_ic_commit_search_api_mtrl_alpha, C1022e.abc_seekbar_tick_mark_material, C1022e.abc_ic_menu_share_mtrl_alpha, C1022e.abc_ic_menu_copy_mtrl_am_alpha, C1022e.abc_ic_menu_cut_mtrl_alpha, C1022e.abc_ic_menu_selectall_mtrl_alpha, C1022e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f3330c = {C1022e.abc_textfield_activated_mtrl_alpha, C1022e.abc_textfield_search_activated_mtrl_alpha, C1022e.abc_cab_background_top_mtrl_alpha, C1022e.abc_text_cursor_material, C1022e.abc_text_select_handle_left_mtrl_dark, C1022e.abc_text_select_handle_middle_mtrl_dark, C1022e.abc_text_select_handle_right_mtrl_dark, C1022e.abc_text_select_handle_left_mtrl_light, C1022e.abc_text_select_handle_middle_mtrl_light, C1022e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        public final int[] f3331d = {C1022e.abc_popup_background_mtrl_mult, C1022e.abc_cab_background_internal_bg, C1022e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f3332e = {C1022e.abc_tab_indicator_material, C1022e.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f3333f = {C1022e.abc_btn_check_material, C1022e.abc_btn_radio_material, C1022e.abc_btn_check_material_anim, C1022e.abc_btn_radio_material_anim};

        /* renamed from: a */
        public final ColorStateList mo5178a(Context context, int i) {
            int b = C1203p0.m3005b(context, C1018a.colorControlHighlight);
            return new ColorStateList(new int[][]{C1203p0.f3401b, C1203p0.f3403d, C1203p0.f3402c, C1203p0.f3405f}, new int[]{C1203p0.m3004a(context, C1018a.colorButtonNormal), C1335a.m3387a(b, i), C1335a.m3387a(b, i), i});
        }

        /* renamed from: a */
        public final void mo5179a(Drawable drawable, int i, Mode mode) {
            if (C1145b0.m2890a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1178i.f3325b;
            }
            drawable.setColorFilter(C1178i.m2950a(i, mode));
        }

        /* renamed from: a */
        public final boolean mo5180a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public ColorStateList mo5181b(Context context, int i) {
            if (i == C1022e.abc_edit_text_material) {
                return C1070a.m2601a(context, C1020c.abc_tint_edittext);
            }
            if (i == C1022e.abc_switch_track_mtrl_alpha) {
                return C1070a.m2601a(context, C1020c.abc_tint_switch_track);
            }
            if (i == C1022e.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList c = C1203p0.m3006c(context, C1018a.colorSwitchThumbNormal);
                if (c == null || !c.isStateful()) {
                    iArr[0] = C1203p0.f3401b;
                    iArr2[0] = C1203p0.m3004a(context, C1018a.colorSwitchThumbNormal);
                    iArr[1] = C1203p0.f3404e;
                    iArr2[1] = C1203p0.m3005b(context, C1018a.colorControlActivated);
                    iArr[2] = C1203p0.f3405f;
                    iArr2[2] = C1203p0.m3005b(context, C1018a.colorSwitchThumbNormal);
                } else {
                    iArr[0] = C1203p0.f3401b;
                    iArr2[0] = c.getColorForState(iArr[0], 0);
                    iArr[1] = C1203p0.f3404e;
                    iArr2[1] = C1203p0.m3005b(context, C1018a.colorControlActivated);
                    iArr[2] = C1203p0.f3405f;
                    iArr2[2] = c.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == C1022e.abc_btn_default_mtrl_shape) {
                return mo5178a(context, C1203p0.m3005b(context, C1018a.colorButtonNormal));
            } else {
                if (i == C1022e.abc_btn_borderless_material) {
                    return mo5178a(context, 0);
                }
                if (i == C1022e.abc_btn_colored_material) {
                    return mo5178a(context, C1203p0.m3005b(context, C1018a.colorAccent));
                }
                if (i == C1022e.abc_spinner_mtrl_am_alpha || i == C1022e.abc_spinner_textfield_background_material) {
                    return C1070a.m2601a(context, C1020c.abc_tint_spinner);
                }
                if (mo5180a(this.f3329b, i)) {
                    return C1203p0.m3006c(context, C1018a.colorControlNormal);
                }
                if (mo5180a(this.f3332e, i)) {
                    return C1070a.m2601a(context, C1020c.abc_tint_default);
                }
                if (mo5180a(this.f3333f, i)) {
                    return C1070a.m2601a(context, C1020c.abc_tint_btn_checkable);
                }
                if (i == C1022e.abc_seekbar_thumb_material) {
                    return C1070a.m2601a(context, C1020c.abc_tint_seek_thumb);
                }
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m2950a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C1178i.class) {
            a = C1185k0.m2967a(i, mode);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized C1178i m2951a() {
        C1178i iVar;
        synchronized (C1178i.class) {
            if (f3326c == null) {
                m2953b();
            }
            iVar = f3326c;
        }
        return iVar;
    }

    /* renamed from: a */
    public static void m2952a(Drawable drawable, C1209s0 s0Var, int[] iArr) {
        C1185k0.m2969a(drawable, s0Var, iArr);
    }

    /* renamed from: b */
    public static synchronized void m2953b() {
        synchronized (C1178i.class) {
            if (f3326c == null) {
                C1178i iVar = new C1178i();
                f3326c = iVar;
                iVar.f3327a = C1185k0.m2968a();
                f3326c.f3327a.mo5218a((C1190e) new C1179a());
            }
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo5174a(Context context, int i) {
        return this.f3327a.mo5221b(context, i);
    }

    /* renamed from: a */
    public synchronized Drawable mo5175a(Context context, int i, boolean z) {
        return this.f3327a.mo5213a(context, i, z);
    }

    /* renamed from: a */
    public synchronized void mo5176a(Context context) {
        this.f3327a.mo5216a(context);
    }

    /* renamed from: b */
    public synchronized ColorStateList mo5177b(Context context, int i) {
        return this.f3327a.mo5222c(context, i);
    }
}
