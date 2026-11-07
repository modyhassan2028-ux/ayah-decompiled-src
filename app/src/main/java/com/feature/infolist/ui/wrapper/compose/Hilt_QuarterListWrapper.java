package com.ayah.feature.infolist.ui.wrapper.compose;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_QuarterListWrapper extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13771s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13770r == null) {
            this.f13770r = new f(this);
        }
        return this.f13770r.c();
    }
}
