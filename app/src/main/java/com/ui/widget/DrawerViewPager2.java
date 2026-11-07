package com.ayah.ui.widget;

import E2.AbstractC0115c0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public class DrawerViewPager2 extends FrameLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ViewPager2 f13957s;

    public DrawerViewPager2(Context context) {
        this(context, null);
    }

    public ViewPager2 getPager() {
        return this.f13957s;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewPager2 viewPager2 = this.f13957s;
        int currentItem = viewPager2.getCurrentItem() + 1;
        AbstractC0115c0 adapter = viewPager2.getAdapter();
        if (adapter != null) {
            getParent().requestDisallowInterceptTouchEvent(!((currentItem == 1 && this.f13956r == 8388613) || (currentItem == adapter.a() && this.f13956r == 8388611)));
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void setGravity(int i10) {
        this.f13956r = i10;
    }

    public DrawerViewPager2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerViewPager2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0, 0);
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.f13957s = viewPager2;
        addView(viewPager2, -1, -1);
    }
}
