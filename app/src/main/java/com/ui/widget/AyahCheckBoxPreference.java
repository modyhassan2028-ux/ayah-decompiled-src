package com.ayah.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;
import com.ayah.R;
import p192t6.f;
import p226x2.t;

/* JADX INFO: loaded from: classes.dex */
public class AyahCheckBoxPreference extends CheckBoxPreference {
    public AyahCheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.U = R.layout.preference_resource;
    }

    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public final void o(t tVar) {
        super.o(tVar);
        View view = tVar.f1486a;
        Context context = view.getContext();
        view.setBackgroundResource(R.drawable.list_selector);
        TextView textView = (TextView) view.findViewById(android.R.id.title);
        if (textView != null) {
            f.c(context, textView, false, true);
            textView.setTextColor(context.getColor(R.color.text));
        }
        TextView textView2 = (TextView) view.findViewById(android.R.id.summary);
        if (textView2 != null) {
            f.c(context, textView2, false, false);
            textView2.setTextColor(context.getColor(R.color.tertiary_text));
        }
        CheckBox checkBox = (CheckBox) view.findViewById(android.R.id.checkbox);
        if (checkBox != null) {
            checkBox.setButtonTintList(ColorStateList.valueOf(context.getColor(R.color.tint)));
        }
    }

    public AyahCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = R.layout.preference_resource;
    }

    public AyahCheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        this.U = R.layout.preference_resource;
    }

    public AyahCheckBoxPreference(Context context) {
        super(context, null);
        this.U = R.layout.preference_resource;
    }
}
