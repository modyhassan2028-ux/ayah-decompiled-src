package com.ayah.common.ui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p125m4.b;

/* JADX INFO: loaded from: classes.dex */
public class AyahTextView extends AppCompatTextView {
    public AyahTextView(Context context) {
        this(context, null);
    }

    public int getBoldTypeface() {
        return 2;
    }

    public int getRegularTypeface() {
        return 1;
    }

    public AyahTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AyahTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (b.b() || (this instanceof QuranAyahTextView)) {
            p106k4.b bVar = p106k4.b.f18991b;
            Typeface typeface = getTypeface();
            if (typeface != null && typeface.isBold()) {
                setTypeface(bVar.a(context, getBoldTypeface()));
            } else {
                setTypeface(bVar.a(context, getRegularTypeface()));
            }
        }
    }
}
