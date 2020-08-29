package p124p.p126b.p136q;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p116io.jsonwebtoken.lang.Objects;
import p124p.p126b.C1023f;
import p124p.p165i.p166a.C1457c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: p.b.q.o0 */
public class C1200o0 extends C1457c implements OnClickListener {

    /* renamed from: A */
    public int f3378A = -1;

    /* renamed from: B */
    public int f3379B = -1;

    /* renamed from: C */
    public int f3380C = -1;

    /* renamed from: p */
    public final SearchView f3381p;

    /* renamed from: q */
    public final SearchableInfo f3382q;

    /* renamed from: r */
    public final Context f3383r;

    /* renamed from: s */
    public final WeakHashMap<String, ConstantState> f3384s;

    /* renamed from: t */
    public final int f3385t;

    /* renamed from: u */
    public boolean f3386u = false;

    /* renamed from: v */
    public int f3387v = 1;

    /* renamed from: w */
    public ColorStateList f3388w;

    /* renamed from: x */
    public int f3389x = -1;

    /* renamed from: y */
    public int f3390y = -1;

    /* renamed from: z */
    public int f3391z = -1;

    /* renamed from: p.b.q.o0$a */
    public static final class C1201a {

        /* renamed from: a */
        public final TextView f3392a;

        /* renamed from: b */
        public final TextView f3393b;

        /* renamed from: c */
        public final ImageView f3394c;

        /* renamed from: d */
        public final ImageView f3395d;

        /* renamed from: e */
        public final ImageView f3396e;

        public C1201a(View view) {
            this.f3392a = (TextView) view.findViewById(16908308);
            this.f3393b = (TextView) view.findViewById(16908309);
            this.f3394c = (ImageView) view.findViewById(16908295);
            this.f3395d = (ImageView) view.findViewById(16908296);
            this.f3396e = (ImageView) view.findViewById(C1023f.edit_query);
        }
    }

    public C1200o0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        SearchManager searchManager = (SearchManager) this.f4262h.getSystemService("search");
        this.f3381p = searchView;
        this.f3382q = searchableInfo;
        this.f3385t = searchView.getSuggestionCommitIconResId();
        this.f3383r = context;
        this.f3384s = weakHashMap;
    }

    /* renamed from: a */
    public static String m2992a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m2993a(Cursor cursor, String str) {
        return m2992a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    public Cursor mo5273a(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder authority = new Builder().scheme("content").authority(suggestAuthority);
        String str2 = Objects.EMPTY_STRING;
        Builder fragment = authority.query(str2).fragment(str2);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f4262h.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: a */
    public Drawable mo5274a(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f4262h.getPackageManager().getResourcesForApplication(authority);
                List pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* renamed from: a */
    public void mo5277a(Cursor cursor) {
        String str = "SuggestionsAdapter";
        if (this.f3386u) {
            Log.w(str, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo5277a(cursor);
            if (cursor != null) {
                this.f3389x = cursor.getColumnIndex("suggest_text_1");
                this.f3390y = cursor.getColumnIndex("suggest_text_2");
                this.f3391z = cursor.getColumnIndex("suggest_text_2_url");
                this.f3378A = cursor.getColumnIndex("suggest_icon_1");
                this.f3379B = cursor.getColumnIndex("suggest_icon_2");
                this.f3380C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(str, "error changing cursor and caching columns", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5278a(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r20
            java.lang.Object r0 = r18.getTag()
            r3 = r0
            p.b.q.o0$a r3 = (p124p.p126b.p136q.C1200o0.C1201a) r3
            int r0 = r1.f3380C
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = r5
        L_0x0018:
            android.widget.TextView r0 = r3.f3392a
            if (r0 == 0) goto L_0x0034
            int r0 = r1.f3389x
            java.lang.String r0 = m2992a(r2, r0)
            android.widget.TextView r7 = r3.f3392a
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 8
            goto L_0x0031
        L_0x0030:
            r0 = r5
        L_0x0031:
            r7.setVisibility(r0)
        L_0x0034:
            android.widget.TextView r0 = r3.f3393b
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x00ba
            int r0 = r1.f3391z
            java.lang.String r0 = m2992a(r2, r0)
            if (r0 == 0) goto L_0x0083
            android.content.res.ColorStateList r9 = r1.f3388w
            if (r9 != 0) goto L_0x0064
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.Context r10 = r1.f4262h
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int r11 = p124p.p126b.C1018a.textColorSearchUrl
            r10.resolveAttribute(r11, r9, r8)
            android.content.Context r10 = r1.f4262h
            android.content.res.Resources r10 = r10.getResources()
            int r9 = r9.resourceId
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            r1.f3388w = r9
        L_0x0064:
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r11 = 0
            r12 = 0
            r13 = 0
            android.content.res.ColorStateList r14 = r1.f3388w
            r16 = 0
            r10 = r15
            r4 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            int r0 = r0.length()
            r10 = 33
            r9.setSpan(r4, r5, r0, r10)
            goto L_0x0089
        L_0x0083:
            int r0 = r1.f3390y
            java.lang.String r9 = m2992a(r2, r0)
        L_0x0089:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x009c
            android.widget.TextView r0 = r3.f3392a
            if (r0 == 0) goto L_0x00a8
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.f3392a
            r0.setMaxLines(r7)
            goto L_0x00a8
        L_0x009c:
            android.widget.TextView r0 = r3.f3392a
            if (r0 == 0) goto L_0x00a8
            r0.setSingleLine(r8)
            android.widget.TextView r0 = r3.f3392a
            r0.setMaxLines(r8)
        L_0x00a8:
            android.widget.TextView r0 = r3.f3393b
            r0.setText(r9)
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 == 0) goto L_0x00b6
            r4 = 8
            goto L_0x00b7
        L_0x00b6:
            r4 = r5
        L_0x00b7:
            r0.setVisibility(r4)
        L_0x00ba:
            android.widget.ImageView r4 = r3.f3394c
            r9 = 0
            if (r4 == 0) goto L_0x0169
            int r0 = r1.f3378A
            r10 = -1
            if (r0 != r10) goto L_0x00c7
            r0 = r9
            goto L_0x0156
        L_0x00c7:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.mo5275a(r0)
            if (r0 == 0) goto L_0x00d3
            goto L_0x0156
        L_0x00d3:
            android.app.SearchableInfo r0 = r1.f3382q
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r10 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r11 = r1.f3384s
            boolean r11 = r11.containsKey(r10)
            if (r11 == 0) goto L_0x00fc
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f3384s
            java.lang.Object r0 = r0.get(r10)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f1
            r0 = r9
            goto L_0x0149
        L_0x00f1:
            android.content.Context r10 = r1.f3383r
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r10)
            goto L_0x0149
        L_0x00fc:
            android.content.Context r11 = r1.f4262h
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r12 = r11.getActivityInfo(r0, r12)     // Catch:{ NameNotFoundException -> 0x012f }
            int r13 = r12.getIconResource()
            if (r13 != 0) goto L_0x010f
            goto L_0x013a
        L_0x010f:
            java.lang.String r14 = r0.getPackageName()
            android.content.pm.ApplicationInfo r12 = r12.applicationInfo
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r14, r13, r12)
            if (r11 != 0) goto L_0x013b
            java.lang.String r11 = "Invalid icon resource "
            java.lang.String r12 = " for "
            java.lang.StringBuilder r11 = p213q.p214a.p215a.p216a.C1965a.m4757a(r11, r13, r12)
            java.lang.String r0 = r0.flattenToShortString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            goto L_0x0135
        L_0x012f:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = r11.toString()
        L_0x0135:
            java.lang.String r11 = "SuggestionsAdapter"
            android.util.Log.w(r11, r0)
        L_0x013a:
            r11 = r9
        L_0x013b:
            if (r11 != 0) goto L_0x013f
            r0 = r9
            goto L_0x0143
        L_0x013f:
            android.graphics.drawable.Drawable$ConstantState r0 = r11.getConstantState()
        L_0x0143:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.f3384s
            r12.put(r10, r0)
            r0 = r11
        L_0x0149:
            if (r0 == 0) goto L_0x014c
            goto L_0x0156
        L_0x014c:
            android.content.Context r0 = r1.f4262h
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0156:
            r10 = 4
            r4.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0160
            r4.setVisibility(r10)
            goto L_0x0169
        L_0x0160:
            r4.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r8, r5)
        L_0x0169:
            android.widget.ImageView r0 = r3.f3395d
            if (r0 == 0) goto L_0x018f
            int r4 = r1.f3379B
            r10 = -1
            if (r4 != r10) goto L_0x0173
            goto L_0x017b
        L_0x0173:
            java.lang.String r2 = r2.getString(r4)
            android.graphics.drawable.Drawable r9 = r1.mo5275a(r2)
        L_0x017b:
            r0.setImageDrawable(r9)
            if (r9 != 0) goto L_0x0186
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x018f
        L_0x0186:
            r0.setVisibility(r5)
            r9.setVisible(r5, r5)
            r9.setVisible(r8, r5)
        L_0x018f:
            int r0 = r1.f3387v
            if (r0 == r7) goto L_0x01a2
            if (r0 != r8) goto L_0x019a
            r0 = r6 & 1
            if (r0 == 0) goto L_0x019a
            goto L_0x01a2
        L_0x019a:
            android.widget.ImageView r0 = r3.f3396e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01b7
        L_0x01a2:
            android.widget.ImageView r0 = r3.f3396e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.f3396e
            android.widget.TextView r2 = r3.f3392a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f3396e
            r0.setOnClickListener(r1)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1200o0.mo5278a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* renamed from: b */
    public CharSequence mo5279b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m2992a(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (a != null) {
            return a;
        }
        if (this.f3382q.shouldRewriteQueryFromData()) {
            String a2 = m2992a(cursor, cursor.getColumnIndex("suggest_intent_data"));
            if (a2 != null) {
                return a2;
            }
        }
        if (this.f3382q.shouldRewriteQueryFromText()) {
            String a3 = m2992a(cursor, cursor.getColumnIndex("suggest_text_1"));
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo5280c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            if (this.f4259e) {
                this.f4261g.moveToPosition(i);
                if (view == null) {
                    view = this.f4272o.inflate(this.f4271n, viewGroup, false);
                }
                mo5278a(view, this.f4262h, this.f4261g);
            } else {
                view = null;
            }
            return view;
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f4272o.inflate(this.f4271n, viewGroup, false);
            if (inflate != null) {
                ((C1201a) inflate.getTag()).f3392a.setText(e.toString());
            }
            return inflate;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo5276a(this.f4262h, this.f4261g, viewGroup);
            if (a != null) {
                ((C1201a) a.getTag()).f3392a.setText(e.toString());
            }
            return a;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        mo5280c(this.f4261g);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        mo5280c(this.f4261g);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3381p.mo303a((CharSequence) tag);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("Resource does not exist: ");
        r4.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        throw new java.io.FileNotFoundException(r4.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo5275a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x013a
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x013a
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x013a
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.content.Context r4 = r7.f3383r     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f3384s     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.f3383r     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable r2 = p124p.p150h.p152e.C1325a.m3377b(r4, r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r2 == 0) goto L_0x005c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f3384s     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x005c:
            return r2
        L_0x005d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L_0x0072:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.f3384s
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x007e
            r2 = r1
            goto L_0x0082
        L_0x007e:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0082:
            if (r2 == 0) goto L_0x0085
            return r2
        L_0x0085:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x010e }
            if (r4 == 0) goto L_0x00b5
            android.graphics.drawable.Drawable r0 = r7.mo5274a(r2)     // Catch:{ NotFoundException -> 0x009e }
            r1 = r0
            goto L_0x012f
        L_0x009e:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010e }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010e }
            throw r3     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00b5:
            android.content.Context r4 = r7.f3383r     // Catch:{ FileNotFoundException -> 0x010e }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x010e }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            if (r4 == 0) goto L_0x00f7
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00de }
            r4.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00dc
        L_0x00c9:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00dc:
            r1 = r5
            goto L_0x012f
        L_0x00de:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00f6
        L_0x00e3:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00f6:
            throw r5     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00f7:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010e }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010e }
            throw r3     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x010e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x012f:
            if (r1 == 0) goto L_0x013a
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.f3384s
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x013a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p124p.p126b.p136q.C1200o0.mo5275a(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public View mo5276a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f4272o.inflate(this.f4270m, viewGroup, false);
        inflate.setTag(new C1201a(inflate));
        ((ImageView) inflate.findViewById(C1023f.edit_query)).setImageResource(this.f3385t);
        return inflate;
    }
}
