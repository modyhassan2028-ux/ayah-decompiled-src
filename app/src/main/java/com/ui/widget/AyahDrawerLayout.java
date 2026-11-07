package com.ayah.ui.widget;

import I1.S;
import Z1.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ayah.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AyahDrawerLayout extends DrawerLayout {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f13948m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int f13949n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final int f13950o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View f13951p0;

    public AyahDrawerLayout(Context context) {
        this(context, null);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13951p0 = findViewById(R.id.bottom_bar);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int top;
        if (motionEvent.getActionMasked() == 0) {
            this.f13948m0 = motionEvent.getY();
        }
        View view = this.f13951p0;
        if (view != null && (top = view.getTop()) > 0 && top <= this.f13948m0) {
            View viewE = e(8388611);
            if (!(viewE != null ? DrawerLayout.k(viewE) : false)) {
                View viewE2 = e(8388613);
                if (!(viewE2 != null ? DrawerLayout.k(viewE2) : false)) {
                    return false;
                }
            }
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int i13 = ((c) childAt.getLayoutParams()).f10958a;
            WeakHashMap weakHashMap = S.f3689a;
            if ((Gravity.getAbsoluteGravity(i13, childAt.getLayoutDirection()) & 7) != 0) {
                int measuredWidth = childAt.getMeasuredWidth();
                int i14 = this.f13949n0;
                if (measuredWidth > i14) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                } else {
                    c cVar = (c) childAt.getLayoutParams();
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin + this.f13950o0, ((ViewGroup.MarginLayoutParams) cVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, ((ViewGroup.MarginLayoutParams) cVar).height));
                }
            }
        }
    }

    public AyahDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AyahDrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13950o0 = context.getResources().getDimensionPixelSize(R.dimen.drawer_margin);
        this.f13949n0 = context.getResources().getDimensionPixelSize(R.dimen.max_drawer_width);
    }
}
