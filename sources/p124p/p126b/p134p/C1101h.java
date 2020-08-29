package p124p.p126b.p134p;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: p.b.p.h */
public class C1101h implements Callback {

    /* renamed from: e */
    public final Callback f2985e;

    public C1101h(Callback callback) {
        if (callback != null) {
            this.f2985e = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2985e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2985e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2985e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2985e.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f2985e.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f2985e.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f2985e.onAttachedToWindow();
    }

    public View onCreatePanelView(int i) {
        return this.f2985e.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f2985e.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2985e.onMenuItemSelected(i, menuItem);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f2985e.onPointerCaptureChanged(z);
    }

    public boolean onSearchRequested() {
        return this.f2985e.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f2985e.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f2985e.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f2985e.onWindowFocusChanged(z);
    }
}
