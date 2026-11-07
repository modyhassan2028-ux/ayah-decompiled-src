package com.ayah.ui.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;
import p192t6.f;
import p226x2.t;

/* JADX INFO: loaded from: classes.dex */
public class AyahPreferenceCategory extends PreferenceCategory {
    public AyahPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void o(t tVar) {
        super.o(tVar);
        TextView textView = (TextView) tVar.f1486a.findViewById(R.id.title);
        if (textView != null) {
            Context context = this.f12761r;
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(com.ayah.R.dimen.category_label_size));
            f.c(context, textView, true, true);
            textView.setTextColor(context.getColor(com.ayah.R.color.secondary_text));
        }
    }

    public AyahPreferenceCategory(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
    }

    public AyahPreferenceCategory(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public AyahPreferenceCategory(Context context) {
        super(context, null);
    }
}
