package com.ayah.ui.util.view;

import F2.t;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import p074h0.d;
import p221w6.b;
import p227x3.c;
import p241y9.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionsRequestWrapper extends FrameLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f13944u = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f13945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final E5.c f13946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f13947t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionsRequestWrapper(Context context, c cVar, E5.c cVar2, t tVar) {
        super(context);
        j.e(cVar, "permissionsRequest");
        this.f13945r = cVar;
        this.f13946s = cVar2;
        this.f13947t = tVar;
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new d(-1925661761, new b(this, 0), true));
        addView(composeView);
    }

    public final p241y9.c getOnRationaleAccepted() {
        return this.f13946s;
    }

    public final a getOnRationaleDenied() {
        return this.f13947t;
    }
}
