package com.ayah.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.ayah.R;
import com.ayah.common.ui.view.AyahTextView;
import p192t6.f;
import p226x2.t;

/* JADX INFO: loaded from: classes.dex */
public class AyahPreference extends Preference {
    public AyahPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.U = R.layout.preference_resource;
    }

    @Override // androidx.preference.Preference
    public final void o(t tVar) {
        super.o(tVar);
        View view = tVar.f1486a;
        view.setBackgroundResource(R.drawable.list_selector);
        Context context = view.getContext();
        AyahTextView ayahTextView = (AyahTextView) view.findViewById(android.R.id.title);
        if (ayahTextView != null) {
            f.c(context, ayahTextView, false, false);
            ayahTextView.setTextColor(context.getColor(R.color.text));
        }
        AyahTextView ayahTextView2 = (AyahTextView) view.findViewById(android.R.id.summary);
        if (ayahTextView2 != null) {
            f.c(context, ayahTextView2, false, false);
            ayahTextView2.setTextColor(context.getColor(R.color.tertiary_text));
        }
    }

    public AyahPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = R.layout.preference_resource;
    }

    public AyahPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        this.U = R.layout.preference_resource;
    }

    public AyahPreference(Context context) {
        super(context, null);
        this.U = R.layout.preference_resource;
    }
}
