package com.ayah.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class QuranAyahTextView extends AyahTextView {
    public QuranAyahTextView(Context context) {
        super(context);
    }

    @Override // com.ayah.common.ui.view.AyahTextView
    public int getBoldTypeface() {
        return 3;
    }

    @Override // com.ayah.common.ui.view.AyahTextView
    public int getRegularTypeface() {
        return 3;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((double) size) * 0.98d), View.MeasureSpec.getMode(i10)), i11);
        setMeasuredDimension(size, getMeasuredHeight());
    }

    public QuranAyahTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuranAyahTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
