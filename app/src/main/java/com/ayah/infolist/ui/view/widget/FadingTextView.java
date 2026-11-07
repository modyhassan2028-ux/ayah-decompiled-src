package com.ayah.feature.infolist.ui.view.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class FadingTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f13768y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FadingTextView(Context context) {
        this(context, null, 6, 0);
        j.e(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size;
        boolean z10;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE || (size = View.MeasureSpec.getSize(i10)) <= 0) {
            return;
        }
        if ((((double) getMeasuredWidth()) * 1.0d) / (((double) size) * 1.0d) > 0.8999999761581421d) {
            setFadingEdgeLength(this.f13768y);
            z10 = true;
        } else {
            z10 = false;
        }
        setHorizontalFadingEdgeEnabled(z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FadingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.e(context, "context");
    }

    public /* synthetic */ FadingTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadingTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.e(context, "context");
        this.f13768y = context.getResources().getDimensionPixelSize(com.ayah.R.dimen.end_ayah_overlay_gradient_width);
    }
}
