package com.ayah.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;
import com.ayah.feature.miniplayer.MiniPlayerWrapper;
import com.ayah.feature.navigator.NavigationWrapper;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class BottomWrapper extends ViewGroup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MiniPlayerWrapper f13952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final NavigationWrapper f13953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Paint f13955u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomWrapper(Context context) {
        this(context, null, 0, 14);
        j.e(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        super.onDraw(canvas);
        if (getPaddingBottom() > 0) {
            canvas.drawRect(0.0f, getHeight() - getPaddingBottom(), getWidth(), getHeight(), this.f13955u);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        NavigationWrapper navigationWrapper = this.f13953s;
        navigationWrapper.layout(i10, i13 - (getPaddingBottom() + navigationWrapper.getMeasuredHeight()), i12, i13 - getPaddingBottom());
        int paddingBottom = i13 - (getPaddingBottom() + this.f13954t);
        MiniPlayerWrapper miniPlayerWrapper = this.f13952r;
        int measuredWidth = i10 + (((i12 - i10) - miniPlayerWrapper.getMeasuredWidth()) / 2);
        miniPlayerWrapper.layout(measuredWidth, paddingBottom - miniPlayerWrapper.getMeasuredHeight(), miniPlayerWrapper.getMeasuredWidth() + measuredWidth, paddingBottom);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE);
        this.f13952r.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f13953s.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        setWillNotDraw(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        j.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomWrapper(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 8);
        j.e(context, "context");
    }

    public BottomWrapper(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, 0);
        MiniPlayerWrapper miniPlayerWrapper = new MiniPlayerWrapper(context, null, 0, 14);
        this.f13952r = miniPlayerWrapper;
        NavigationWrapper navigationWrapper = new NavigationWrapper(context, null, 0, 14);
        this.f13953s = navigationWrapper;
        this.f13954t = context.getResources().getDimensionPixelSize(R.dimen.bottom_audiobar_margin);
        addView(miniPlayerWrapper, -2, -2);
        addView(navigationWrapper, -2, -2);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.quran_secondary_background));
        this.f13955u = paint;
    }
}
