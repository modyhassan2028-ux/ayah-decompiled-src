package com.ayah.feature.notelist.ui.wrapper;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import p035d3.u;
import p035d3.v;
import p198u3.f;
import p218w3.c;
import p220w5.d;
import p238y5.a;
import p238y5.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class NotesListWrapper extends Hilt_NotesListWrapper {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f13820u = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f13821t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotesListWrapper(Context context) {
        super(context);
        j.e(context, "context");
        if (!isInEditMode() && !this.f13819s) {
            this.f13819s = true;
            u uVar = ((v) ((b) c())).f15683a;
            this.f13821t = new d((f) uVar.f15652K.get(), u.a(), (c) uVar.f15642A.get());
        }
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new p074h0.d(1543173419, new a(this, 0), true));
        addView(composeView, -1, -1);
    }

    public final d getPresenter() {
        d dVar = this.f13821t;
        if (dVar != null) {
            return dVar;
        }
        j.k("presenter");
        throw null;
    }

    public final void setPresenter(d dVar) {
        j.e(dVar, "<set-?>");
        this.f13821t = dVar;
    }
}
