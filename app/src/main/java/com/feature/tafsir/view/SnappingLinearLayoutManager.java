package com.ayah.feature.tafsir.view;

import E2.B0;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class SnappingLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final void C0(RecyclerView recyclerView, B0 b5, int i10) {
        j.e(b5, "state");
        Context context = recyclerView.getContext();
        j.d(context, "getContext(...)");
        o oVar = new o(context, 1);
        oVar.f1604a = i10;
        D0(oVar);
    }
}
