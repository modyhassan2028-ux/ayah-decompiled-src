package com.ayah.feature.navigator;

import android.widget.FrameLayout;
import p030c9.f;
import p051e9.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class Hilt_NavigationWrapper extends FrameLayout implements b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f13814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13815s;

    @Override // p051e9.b
    public final Object c() {
        if (this.f13814r == null) {
            this.f13814r = new f(this);
        }
        return this.f13814r.c();
    }
}
