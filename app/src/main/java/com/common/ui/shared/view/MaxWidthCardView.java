package com.ayah.common.ui.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class MaxWidthCardView extends CardView {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13708y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13709z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxWidthCardView(Context context) {
        this(context, null, 6, 0);
        j.e(context, "context");
    }

    public final int getLastSeenHeight() {
        return this.f13709z;
    }

    public final boolean getMaintainHeight() {
        return this.f13708y;
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (size > size2) {
            size = size2;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (((double) size) * 0.92d), 1073741824);
        if (this.f13708y) {
            int i12 = this.f13709z;
            if (i12 != -1) {
                i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE) {
                i11 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i11) * 0.95f), Integer.MIN_VALUE);
            }
        } else {
            i11 = iMakeMeasureSpec;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f13708y) {
            this.f13709z = getMeasuredHeight();
        }
    }

    public final void setLastSeenHeight(int i10) {
        this.f13709z = i10;
    }

    public final void setMaintainHeight(boolean z10) {
        this.f13708y = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxWidthCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.e(context, "context");
    }

    public /* synthetic */ MaxWidthCardView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxWidthCardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.e(context, "context");
        this.f13709z = -1;
    }
}
