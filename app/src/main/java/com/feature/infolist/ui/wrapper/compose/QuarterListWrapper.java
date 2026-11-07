package com.ayah.feature.infolist.ui.wrapper.compose;

import K4.d;
import Q4.a;
import Q4.b;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import p035d3.v;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class QuarterListWrapper extends Hilt_QuarterListWrapper {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f13774u = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f13775t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarterListWrapper(Context context) {
        super(context);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13771s) {
            this.f13771s = true;
            this.f13775t = (d) ((v) ((b) c())).f15683a.Q.get();
        }
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new p074h0.d(1695412835, new a(this, 0), true));
        addView(composeView, -1, -1);
    }

    public final d getPresenter() {
        d dVar = this.f13775t;
        if (dVar != null) {
            return dVar;
        }
        j.k("presenter");
        throw null;
    }

    public final void setPresenter(d dVar) {
        j.e(dVar, "<set-?>");
        this.f13775t = dVar;
    }
}
