package p124p.p126b.p134p.p135i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p124p.p150h.p156g.p157a.C1346a;
import p124p.p150h.p156g.p157a.C1347b;
import p124p.p150h.p156g.p157a.C1348c;

/* renamed from: p.b.p.i.o */
public class C1133o extends C1104c implements Menu {

    /* renamed from: d */
    public final C1346a f3155d;

    public C1133o(Context context, C1346a aVar) {
        super(context);
        if (aVar != null) {
            this.f3155d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return mo4760a(this.f3155d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo4760a(this.f3155d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo4760a(this.f3155d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo4760a(this.f3155d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f3155d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo4760a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo4761a(this.f3155d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo4761a(this.f3155d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo4761a(this.f3155d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo4761a(this.f3155d.addSubMenu(charSequence));
    }

    public void clear() {
        Map<C1347b, MenuItem> map = this.f3015b;
        if (map != null) {
            map.clear();
        }
        Map<C1348c, SubMenu> map2 = this.f3016c;
        if (map2 != null) {
            map2.clear();
        }
        this.f3155d.clear();
    }

    public void close() {
        this.f3155d.close();
    }

    public MenuItem findItem(int i) {
        return mo4760a(this.f3155d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo4760a(this.f3155d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f3155d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f3155d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f3155d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f3155d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        Map<C1347b, MenuItem> map = this.f3015b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
        this.f3155d.removeGroup(i);
    }

    public void removeItem(int i) {
        Map<C1347b, MenuItem> map = this.f3015b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f3155d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f3155d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f3155d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f3155d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f3155d.setQwertyMode(z);
    }

    public int size() {
        return this.f3155d.size();
    }
}
