package com.ayah.feature.starredlist.ui.wrapper;

import W5.d;
import Y5.a;
import Y5.b;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import p035d3.u;
import p035d3.v;
import p198u3.e;
import p218w3.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class FavoritesListWrapper extends Hilt_FavoritesListWrapper {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f13869u = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f13870t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritesListWrapper(Context context) {
        super(context);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13872s) {
            this.f13872s = true;
            u uVar = ((v) ((b) c())).f15683a;
            this.f13870t = new d(u.a(), (e) uVar.f15654M.get(), (c) uVar.f15642A.get());
        }
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new p074h0.d(-502921086, new a(this, 0), true));
        addView(composeView, -1, -1);
    }

    public final d getPresenter() {
        d dVar = this.f13870t;
        if (dVar != null) {
            return dVar;
        }
        j.k("presenter");
        throw null;
    }

    public final void setPresenter(d dVar) {
        j.e(dVar, "<set-?>");
        this.f13870t = dVar;
    }
}
