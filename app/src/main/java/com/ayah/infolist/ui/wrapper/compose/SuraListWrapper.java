package com.ayah.feature.infolist.ui.wrapper.compose;

import K4.d;
import Q4.c;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import p035d3.v;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class SuraListWrapper extends Hilt_SuraListWrapper {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f13776u = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f13777t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuraListWrapper(Context context) {
        super(context);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13773s) {
            this.f13773s = true;
            this.f13777t = (d) ((v) ((Q4.d) c())).f15683a.Q.get();
        }
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new p074h0.d(2064177609, new c(this, 0), true));
        addView(composeView, -1, -1);
    }

    public final d getPresenter() {
        d dVar = this.f13777t;
        if (dVar != null) {
            return dVar;
        }
        j.k("presenter");
        throw null;
    }

    public final void setPresenter(d dVar) {
        j.e(dVar, "<set-?>");
        this.f13777t = dVar;
    }
}
